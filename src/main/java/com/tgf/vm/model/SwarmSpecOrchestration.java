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
 * Orchestration configuration.
 */

@Schema(name = "SwarmSpec_Orchestration", description = "Orchestration configuration.")
@JsonTypeName("SwarmSpec_Orchestration")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmSpecOrchestration {

  private Long taskHistoryRetentionLimit;

  public SwarmSpecOrchestration taskHistoryRetentionLimit(Long taskHistoryRetentionLimit) {
    this.taskHistoryRetentionLimit = taskHistoryRetentionLimit;
    return this;
  }

  /**
   * The number of historic tasks to keep per instance or node. If negative, never remove completed or failed tasks. 
   * @return taskHistoryRetentionLimit
  */
  
  @Schema(name = "TaskHistoryRetentionLimit", example = "10", description = "The number of historic tasks to keep per instance or node. If negative, never remove completed or failed tasks. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TaskHistoryRetentionLimit")
  public Long getTaskHistoryRetentionLimit() {
    return taskHistoryRetentionLimit;
  }

  public void setTaskHistoryRetentionLimit(Long taskHistoryRetentionLimit) {
    this.taskHistoryRetentionLimit = taskHistoryRetentionLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecOrchestration swarmSpecOrchestration = (SwarmSpecOrchestration) o;
    return Objects.equals(this.taskHistoryRetentionLimit, swarmSpecOrchestration.taskHistoryRetentionLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskHistoryRetentionLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecOrchestration {\n");
    sb.append("    taskHistoryRetentionLimit: ").append(toIndentedString(taskHistoryRetentionLimit)).append("\n");
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

