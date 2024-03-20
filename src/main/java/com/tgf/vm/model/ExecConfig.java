package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExecConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ExecConfig {

  private Boolean attachStdin;

  private Boolean attachStdout;

  private Boolean attachStderr;

  @Valid
  private JsonNullable<List<@Min(0)Integer>> consoleSize = JsonNullable.<List<@Min(0)Integer>>undefined();

  private String detachKeys;

  private Boolean tty;

  @Valid
  private List<String> env;

  @Valid
  private List<String> cmd;

  private Boolean privileged = false;

  private String user;

  private String workingDir;

  public ExecConfig attachStdin(Boolean attachStdin) {
    this.attachStdin = attachStdin;
    return this;
  }

  /**
   * Attach to `stdin` of the exec command.
   * @return attachStdin
  */
  
  @Schema(name = "AttachStdin", description = "Attach to `stdin` of the exec command.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AttachStdin")
  public Boolean getAttachStdin() {
    return attachStdin;
  }

  public void setAttachStdin(Boolean attachStdin) {
    this.attachStdin = attachStdin;
  }

  public ExecConfig attachStdout(Boolean attachStdout) {
    this.attachStdout = attachStdout;
    return this;
  }

  /**
   * Attach to `stdout` of the exec command.
   * @return attachStdout
  */
  
  @Schema(name = "AttachStdout", description = "Attach to `stdout` of the exec command.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AttachStdout")
  public Boolean getAttachStdout() {
    return attachStdout;
  }

  public void setAttachStdout(Boolean attachStdout) {
    this.attachStdout = attachStdout;
  }

  public ExecConfig attachStderr(Boolean attachStderr) {
    this.attachStderr = attachStderr;
    return this;
  }

  /**
   * Attach to `stderr` of the exec command.
   * @return attachStderr
  */
  
  @Schema(name = "AttachStderr", description = "Attach to `stderr` of the exec command.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AttachStderr")
  public Boolean getAttachStderr() {
    return attachStderr;
  }

  public void setAttachStderr(Boolean attachStderr) {
    this.attachStderr = attachStderr;
  }

  public ExecConfig consoleSize(List<@Min(0)Integer> consoleSize) {
    this.consoleSize = JsonNullable.of(consoleSize);
    return this;
  }

  public ExecConfig addConsoleSizeItem(Integer consoleSizeItem) {
    if (this.consoleSize == null || !this.consoleSize.isPresent()) {
      this.consoleSize = JsonNullable.of(new ArrayList<>());
    }
    this.consoleSize.get().add(consoleSizeItem);
    return this;
  }

  /**
   * Initial console size, as an `[height, width]` array.
   * @return consoleSize
  */
  @Size(min = 2, max = 2) 
  @Schema(name = "ConsoleSize", description = "Initial console size, as an `[height, width]` array.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ConsoleSize")
  public JsonNullable<List<@Min(0)Integer>> getConsoleSize() {
    return consoleSize;
  }

  public void setConsoleSize(JsonNullable<List<@Min(0)Integer>> consoleSize) {
    this.consoleSize = consoleSize;
  }

  public ExecConfig detachKeys(String detachKeys) {
    this.detachKeys = detachKeys;
    return this;
  }

  /**
   * Override the key sequence for detaching a container. Format is a single character `[a-Z]` or `ctrl-<value>` where `<value>` is one of: `a-z`, `@`, `^`, `[`, `,` or `_`. 
   * @return detachKeys
  */
  
  @Schema(name = "DetachKeys", description = "Override the key sequence for detaching a container. Format is a single character `[a-Z]` or `ctrl-<value>` where `<value>` is one of: `a-z`, `@`, `^`, `[`, `,` or `_`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DetachKeys")
  public String getDetachKeys() {
    return detachKeys;
  }

  public void setDetachKeys(String detachKeys) {
    this.detachKeys = detachKeys;
  }

  public ExecConfig tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Allocate a pseudo-TTY.
   * @return tty
  */
  
  @Schema(name = "Tty", description = "Allocate a pseudo-TTY.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tty")
  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }

  public ExecConfig env(List<String> env) {
    this.env = env;
    return this;
  }

  public ExecConfig addEnvItem(String envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * A list of environment variables in the form `[\"VAR=value\", ...]`. 
   * @return env
  */
  
  @Schema(name = "Env", description = "A list of environment variables in the form `[\"VAR=value\", ...]`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Env")
  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }

  public ExecConfig cmd(List<String> cmd) {
    this.cmd = cmd;
    return this;
  }

  public ExecConfig addCmdItem(String cmdItem) {
    if (this.cmd == null) {
      this.cmd = new ArrayList<>();
    }
    this.cmd.add(cmdItem);
    return this;
  }

  /**
   * Command to run, as a string or array of strings.
   * @return cmd
  */
  
  @Schema(name = "Cmd", description = "Command to run, as a string or array of strings.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Cmd")
  public List<String> getCmd() {
    return cmd;
  }

  public void setCmd(List<String> cmd) {
    this.cmd = cmd;
  }

  public ExecConfig privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  /**
   * Runs the exec process with extended privileges.
   * @return privileged
  */
  
  @Schema(name = "Privileged", description = "Runs the exec process with extended privileges.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Privileged")
  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public ExecConfig user(String user) {
    this.user = user;
    return this;
  }

  /**
   * The user, and optionally, group to run the exec process inside the container. Format is one of: `user`, `user:group`, `uid`, or `uid:gid`. 
   * @return user
  */
  
  @Schema(name = "User", description = "The user, and optionally, group to run the exec process inside the container. Format is one of: `user`, `user:group`, `uid`, or `uid:gid`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("User")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public ExecConfig workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  /**
   * The working directory for the exec process inside the container. 
   * @return workingDir
  */
  
  @Schema(name = "WorkingDir", description = "The working directory for the exec process inside the container. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WorkingDir")
  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecConfig execConfig = (ExecConfig) o;
    return Objects.equals(this.attachStdin, execConfig.attachStdin) &&
        Objects.equals(this.attachStdout, execConfig.attachStdout) &&
        Objects.equals(this.attachStderr, execConfig.attachStderr) &&
        equalsNullable(this.consoleSize, execConfig.consoleSize) &&
        Objects.equals(this.detachKeys, execConfig.detachKeys) &&
        Objects.equals(this.tty, execConfig.tty) &&
        Objects.equals(this.env, execConfig.env) &&
        Objects.equals(this.cmd, execConfig.cmd) &&
        Objects.equals(this.privileged, execConfig.privileged) &&
        Objects.equals(this.user, execConfig.user) &&
        Objects.equals(this.workingDir, execConfig.workingDir);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachStdin, attachStdout, attachStderr, hashCodeNullable(consoleSize), detachKeys, tty, env, cmd, privileged, user, workingDir);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecConfig {\n");
    sb.append("    attachStdin: ").append(toIndentedString(attachStdin)).append("\n");
    sb.append("    attachStdout: ").append(toIndentedString(attachStdout)).append("\n");
    sb.append("    attachStderr: ").append(toIndentedString(attachStderr)).append("\n");
    sb.append("    consoleSize: ").append(toIndentedString(consoleSize)).append("\n");
    sb.append("    detachKeys: ").append(toIndentedString(detachKeys)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

