package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Specification for the restart policy which applies to containers created as part of this service. 
 */

@Schema(name = "TaskSpec_RestartPolicy", description = "Specification for the restart policy which applies to containers created as part of this service. ")
@JsonTypeName("TaskSpec_RestartPolicy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecRestartPolicy {

  /**
   * Condition for restart.
   */
  public enum ConditionEnum {
    NONE("none"),
    
    ON_FAILURE("on-failure"),
    
    ANY("any");

    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConditionEnum fromValue(String value) {
      for (ConditionEnum b : ConditionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ConditionEnum condition;

  private Long delay;

  private Long maxAttempts = 0l;

  private Long window = 0l;

  public TaskSpecRestartPolicy condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Condition for restart.
   * @return condition
  */
  
  @Schema(name = "Condition", description = "Condition for restart.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Condition")
  public ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }

  public TaskSpecRestartPolicy delay(Long delay) {
    this.delay = delay;
    return this;
  }

  /**
   * Delay between restart attempts.
   * @return delay
  */
  
  @Schema(name = "Delay", description = "Delay between restart attempts.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Delay")
  public Long getDelay() {
    return delay;
  }

  public void setDelay(Long delay) {
    this.delay = delay;
  }

  public TaskSpecRestartPolicy maxAttempts(Long maxAttempts) {
    this.maxAttempts = maxAttempts;
    return this;
  }

  /**
   * Maximum attempts to restart a given container before giving up (default value is 0, which is ignored). 
   * @return maxAttempts
  */
  
  @Schema(name = "MaxAttempts", description = "Maximum attempts to restart a given container before giving up (default value is 0, which is ignored). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxAttempts")
  public Long getMaxAttempts() {
    return maxAttempts;
  }

  public void setMaxAttempts(Long maxAttempts) {
    this.maxAttempts = maxAttempts;
  }

  public TaskSpecRestartPolicy window(Long window) {
    this.window = window;
    return this;
  }

  /**
   * Windows is the time window used to evaluate the restart policy (default value is 0, which is unbounded). 
   * @return window
  */
  
  @Schema(name = "Window", description = "Windows is the time window used to evaluate the restart policy (default value is 0, which is unbounded). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Window")
  public Long getWindow() {
    return window;
  }

  public void setWindow(Long window) {
    this.window = window;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecRestartPolicy taskSpecRestartPolicy = (TaskSpecRestartPolicy) o;
    return Objects.equals(this.condition, taskSpecRestartPolicy.condition) &&
        Objects.equals(this.delay, taskSpecRestartPolicy.delay) &&
        Objects.equals(this.maxAttempts, taskSpecRestartPolicy.maxAttempts) &&
        Objects.equals(this.window, taskSpecRestartPolicy.window);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, delay, maxAttempts, window);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecRestartPolicy {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    maxAttempts: ").append(toIndentedString(maxAttempts)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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

