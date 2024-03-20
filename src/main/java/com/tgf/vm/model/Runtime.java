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
 * Runtime describes an [OCI compliant](https://github.com/opencontainers/runtime-spec) runtime.  The runtime is invoked by the daemon via the &#x60;containerd&#x60; daemon. OCI runtimes act as an interface to the Linux kernel namespaces, cgroups, and SELinux. 
 */

@Schema(name = "Runtime", description = "Runtime describes an [OCI compliant](https://github.com/opencontainers/runtime-spec) runtime.  The runtime is invoked by the daemon via the `containerd` daemon. OCI runtimes act as an interface to the Linux kernel namespaces, cgroups, and SELinux. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class Runtime {

  private String path;

  @Valid
  private JsonNullable<List<String>> runtimeArgs = JsonNullable.<List<String>>undefined();

  public Runtime path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Name and, optional, path, of the OCI executable binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result. 
   * @return path
  */
  
  @Schema(name = "path", example = "/usr/local/bin/my-oci-runtime", description = "Name and, optional, path, of the OCI executable binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Runtime runtimeArgs(List<String> runtimeArgs) {
    this.runtimeArgs = JsonNullable.of(runtimeArgs);
    return this;
  }

  public Runtime addRuntimeArgsItem(String runtimeArgsItem) {
    if (this.runtimeArgs == null || !this.runtimeArgs.isPresent()) {
      this.runtimeArgs = JsonNullable.of(new ArrayList<>());
    }
    this.runtimeArgs.get().add(runtimeArgsItem);
    return this;
  }

  /**
   * List of command-line arguments to pass to the runtime when invoked. 
   * @return runtimeArgs
  */
  
  @Schema(name = "runtimeArgs", example = "[--debug, --systemd-cgroup=false]", description = "List of command-line arguments to pass to the runtime when invoked. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("runtimeArgs")
  public JsonNullable<List<String>> getRuntimeArgs() {
    return runtimeArgs;
  }

  public void setRuntimeArgs(JsonNullable<List<String>> runtimeArgs) {
    this.runtimeArgs = runtimeArgs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Runtime runtime = (Runtime) o;
    return Objects.equals(this.path, runtime.path) &&
        equalsNullable(this.runtimeArgs, runtime.runtimeArgs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, hashCodeNullable(runtimeArgs));
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
    sb.append("class Runtime {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    runtimeArgs: ").append(toIndentedString(runtimeArgs)).append("\n");
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

