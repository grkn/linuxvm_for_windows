package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.TaskState;
import com.tgf.vm.model.TaskStatusContainerStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TaskStatus
 */

@JsonTypeName("Task_Status")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskStatus {

  private String timestamp;

  private TaskState state;

  private String message;

  private String err;

  private TaskStatusContainerStatus containerStatus;

  public TaskStatus timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  
  @Schema(name = "Timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public TaskStatus state(TaskState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @Valid 
  @Schema(name = "State", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("State")
  public TaskState getState() {
    return state;
  }

  public void setState(TaskState state) {
    this.state = state;
  }

  public TaskStatus message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  
  @Schema(name = "Message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TaskStatus err(String err) {
    this.err = err;
    return this;
  }

  /**
   * Get err
   * @return err
  */
  
  @Schema(name = "Err", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Err")
  public String getErr() {
    return err;
  }

  public void setErr(String err) {
    this.err = err;
  }

  public TaskStatus containerStatus(TaskStatusContainerStatus containerStatus) {
    this.containerStatus = containerStatus;
    return this;
  }

  /**
   * Get containerStatus
   * @return containerStatus
  */
  @Valid 
  @Schema(name = "ContainerStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainerStatus")
  public TaskStatusContainerStatus getContainerStatus() {
    return containerStatus;
  }

  public void setContainerStatus(TaskStatusContainerStatus containerStatus) {
    this.containerStatus = containerStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskStatus taskStatus = (TaskStatus) o;
    return Objects.equals(this.timestamp, taskStatus.timestamp) &&
        Objects.equals(this.state, taskStatus.state) &&
        Objects.equals(this.message, taskStatus.message) &&
        Objects.equals(this.err, taskStatus.err) &&
        Objects.equals(this.containerStatus, taskStatus.containerStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, state, message, err, containerStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskStatus {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    err: ").append(toIndentedString(err)).append("\n");
    sb.append("    containerStatus: ").append(toIndentedString(containerStatus)).append("\n");
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

