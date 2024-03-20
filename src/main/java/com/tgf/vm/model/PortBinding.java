package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PortBinding represents a binding between a host IP address and a host port. 
 */

@Schema(name = "PortBinding", description = "PortBinding represents a binding between a host IP address and a host port. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PortBinding {

  private String hostIp;

  private String hostPort;

  public PortBinding hostIp(String hostIp) {
    this.hostIp = hostIp;
    return this;
  }

  /**
   * Host IP address that the container's port is mapped to.
   * @return hostIp
  */
  
  @Schema(name = "HostIp", example = "127.0.0.1", description = "Host IP address that the container's port is mapped to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HostIp")
  public String getHostIp() {
    return hostIp;
  }

  public void setHostIp(String hostIp) {
    this.hostIp = hostIp;
  }

  public PortBinding hostPort(String hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  /**
   * Host port number that the container's port is mapped to.
   * @return hostPort
  */
  
  @Schema(name = "HostPort", example = "4443", description = "Host port number that the container's port is mapped to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HostPort")
  public String getHostPort() {
    return hostPort;
  }

  public void setHostPort(String hostPort) {
    this.hostPort = hostPort;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortBinding portBinding = (PortBinding) o;
    return Objects.equals(this.hostIp, portBinding.hostIp) &&
        Objects.equals(this.hostPort, portBinding.hostPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostIp, hostPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortBinding {\n");
    sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
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

