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
 * A device mapping between the host and container
 */

@Schema(name = "DeviceMapping", description = "A device mapping between the host and container")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class DeviceMapping {

  private String pathOnHost;

  private String pathInContainer;

  private String cgroupPermissions;

  public DeviceMapping pathOnHost(String pathOnHost) {
    this.pathOnHost = pathOnHost;
    return this;
  }

  /**
   * Get pathOnHost
   * @return pathOnHost
  */
  
  @Schema(name = "PathOnHost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PathOnHost")
  public String getPathOnHost() {
    return pathOnHost;
  }

  public void setPathOnHost(String pathOnHost) {
    this.pathOnHost = pathOnHost;
  }

  public DeviceMapping pathInContainer(String pathInContainer) {
    this.pathInContainer = pathInContainer;
    return this;
  }

  /**
   * Get pathInContainer
   * @return pathInContainer
  */
  
  @Schema(name = "PathInContainer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PathInContainer")
  public String getPathInContainer() {
    return pathInContainer;
  }

  public void setPathInContainer(String pathInContainer) {
    this.pathInContainer = pathInContainer;
  }

  public DeviceMapping cgroupPermissions(String cgroupPermissions) {
    this.cgroupPermissions = cgroupPermissions;
    return this;
  }

  /**
   * Get cgroupPermissions
   * @return cgroupPermissions
  */
  
  @Schema(name = "CgroupPermissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CgroupPermissions")
  public String getCgroupPermissions() {
    return cgroupPermissions;
  }

  public void setCgroupPermissions(String cgroupPermissions) {
    this.cgroupPermissions = cgroupPermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceMapping deviceMapping = (DeviceMapping) o;
    return Objects.equals(this.pathOnHost, deviceMapping.pathOnHost) &&
        Objects.equals(this.pathInContainer, deviceMapping.pathInContainer) &&
        Objects.equals(this.cgroupPermissions, deviceMapping.cgroupPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathOnHost, pathInContainer, cgroupPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMapping {\n");
    sb.append("    pathOnHost: ").append(toIndentedString(pathOnHost)).append("\n");
    sb.append("    pathInContainer: ").append(toIndentedString(pathInContainer)).append("\n");
    sb.append("    cgroupPermissions: ").append(toIndentedString(cgroupPermissions)).append("\n");
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

