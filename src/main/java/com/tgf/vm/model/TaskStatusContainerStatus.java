package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TaskStatusContainerStatus
 */

@JsonTypeName("Task_Status_ContainerStatus")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskStatusContainerStatus {

  private String containerID;

  private Integer PID;

  private Integer exitCode;

  public TaskStatusContainerStatus containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

  /**
   * Get containerID
   * @return containerID
  */
  
  @Schema(name = "ContainerID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainerID")
  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  public TaskStatusContainerStatus PID(Integer PID) {
    this.PID = PID;
    return this;
  }

  /**
   * Get PID
   * @return PID
  */
  
  @Schema(name = "PID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PID")
  public Integer getPID() {
    return PID;
  }

  public void setPID(Integer PID) {
    this.PID = PID;
  }

  public TaskStatusContainerStatus exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * Get exitCode
   * @return exitCode
  */
  
  @Schema(name = "ExitCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExitCode")
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskStatusContainerStatus taskStatusContainerStatus = (TaskStatusContainerStatus) o;
    return Objects.equals(this.containerID, taskStatusContainerStatus.containerID) &&
        Objects.equals(this.PID, taskStatusContainerStatus.PID) &&
        Objects.equals(this.exitCode, taskStatusContainerStatus.exitCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerID, PID, exitCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskStatusContainerStatus {\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    PID: ").append(toIndentedString(PID)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
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

