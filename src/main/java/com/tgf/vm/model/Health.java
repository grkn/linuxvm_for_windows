package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.HealthcheckResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Health stores information about the container&#39;s healthcheck results. 
 */

@Schema(name = "Health", description = "Health stores information about the container's healthcheck results. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class Health {

  /**
   * Status is one of `none`, `starting`, `healthy` or `unhealthy`  - \"none\"      Indicates there is no healthcheck - \"starting\"  Starting indicates that the container is not yet ready - \"healthy\"   Healthy indicates that the container is running correctly - \"unhealthy\" Unhealthy indicates that the container has a problem 
   */
  public enum StatusEnum {
    NONE("none"),
    
    STARTING("starting"),
    
    HEALTHY("healthy"),
    
    UNHEALTHY("unhealthy");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private Integer failingStreak;

  @Valid
  private List<@Valid HealthcheckResult> log;

  public Health status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status is one of `none`, `starting`, `healthy` or `unhealthy`  - \"none\"      Indicates there is no healthcheck - \"starting\"  Starting indicates that the container is not yet ready - \"healthy\"   Healthy indicates that the container is running correctly - \"unhealthy\" Unhealthy indicates that the container has a problem 
   * @return status
  */
  
  @Schema(name = "Status", example = "healthy", description = "Status is one of `none`, `starting`, `healthy` or `unhealthy`  - \"none\"      Indicates there is no healthcheck - \"starting\"  Starting indicates that the container is not yet ready - \"healthy\"   Healthy indicates that the container is running correctly - \"unhealthy\" Unhealthy indicates that the container has a problem ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Health failingStreak(Integer failingStreak) {
    this.failingStreak = failingStreak;
    return this;
  }

  /**
   * FailingStreak is the number of consecutive failures
   * @return failingStreak
  */
  
  @Schema(name = "FailingStreak", example = "0", description = "FailingStreak is the number of consecutive failures", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FailingStreak")
  public Integer getFailingStreak() {
    return failingStreak;
  }

  public void setFailingStreak(Integer failingStreak) {
    this.failingStreak = failingStreak;
  }

  public Health log(List<@Valid HealthcheckResult> log) {
    this.log = log;
    return this;
  }

  public Health addLogItem(HealthcheckResult logItem) {
    if (this.log == null) {
      this.log = new ArrayList<>();
    }
    this.log.add(logItem);
    return this;
  }

  /**
   * Log contains the last few results (oldest first) 
   * @return log
  */
  @Valid 
  @Schema(name = "Log", description = "Log contains the last few results (oldest first) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Log")
  public List<@Valid HealthcheckResult> getLog() {
    return log;
  }

  public void setLog(List<@Valid HealthcheckResult> log) {
    this.log = log;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Health health = (Health) o;
    return Objects.equals(this.status, health.status) &&
        Objects.equals(this.failingStreak, health.failingStreak) &&
        Objects.equals(this.log, health.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, failingStreak, log);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Health {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failingStreak: ").append(toIndentedString(failingStreak)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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

