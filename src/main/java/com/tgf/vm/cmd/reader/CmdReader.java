package com.tgf.vm.cmd.reader;

import com.tgf.vm.util.CommonUtil;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

@RequiredArgsConstructor
public class CmdReader implements Runnable {

    private final InputStream inputStream;
    private final OutputStream outputStream;

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            // inputStream can not block read operation, process sends empty response
            // I can not remove while for which version of operating system sends empty response.
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] arr = new byte[1024 * 1024];
            int length;
            while ((length = inputStream.read(arr)) != -1) {
                try {
                    byteArrayOutputStream.write(arr, 0, length);
                    if (byteArrayOutputStream.size() > 0) {
                        String response = new String(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                        System.out.print(response);
                        if (response.contains("Do you want to continue?")) {
                            outputStream.write(("Y").getBytes(Charset.defaultCharset()));
                            outputStream.write(System.lineSeparator().getBytes(Charset.defaultCharset()));
                            outputStream.flush();
                        } else if(response.contains("Press [ENTER] to continue or Ctrl-c to cancel")) {
                            outputStream.write(System.lineSeparator().getBytes(Charset.defaultCharset()));
                            outputStream.flush();
                        }
                        byteArrayOutputStream.reset();
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
