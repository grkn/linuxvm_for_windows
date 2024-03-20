package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * A test to perform to check that the container is healthy.
 */

@Schema(name = "HealthConfig", description = "A test to perform to check that the container is healthy.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class HealthConfig {

  @Valid
  private List<String> test;

  private Long interval;

  private Long timeout;

  private Integer retries;

  private Long startPeriod;

  public HealthConfig test(List<String> test) {
    this.test = test;
    return this;
  }

  public HealthConfig addTestItem(String testItem) {
    if (this.test == null) {
      this.test = new ArrayList<>();
    }
    this.test.add(testItem);
    return this;
  }

  /**
   * The test to perform. Possible values are:  - `[]` inherit healthcheck from image or parent image - `[\"NONE\"]` disable healthcheck - `[\"CMD\", args...]` exec arguments directly - `[\"CMD-SHELL\", command]` run command with system's default shell 
   * @return test
  */
  
  @Schema(name = "Test", description = "The test to perform. Possible values are:  - `[]` inherit healthcheck from image or parent image - `[\"NONE\"]` disable healthcheck - `[\"CMD\", args...]` exec arguments directly - `[\"CMD-SHELL\", command]` run command with system's default shell ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Test")
  public List<String> getTest() {
    return test;
  }

  public void setTest(List<String> test) {
    this.test = test;
  }

  public HealthConfig interval(Long interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The time to wait between checks in nanoseconds. It should be 0 or at least 1000000 (1 ms). 0 means inherit. 
   * @return interval
  */
  
  @Schema(name = "Interval", description = "The time to wait between checks in nanoseconds. It should be 0 or at least 1000000 (1 ms). 0 means inherit. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Interval")
  public Long getInterval() {
    return interval;
  }

  public void setInterval(Long interval) {
    this.interval = interval;
  }

  public HealthConfig timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * The time to wait before considering the check to have hung. It should be 0 or at least 1000000 (1 ms). 0 means inherit. 
   * @return timeout
  */
  
  @Schema(name = "Timeout", description = "The time to wait before considering the check to have hung. It should be 0 or at least 1000000 (1 ms). 0 means inherit. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Timeout")
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }

  public HealthConfig retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * The number of consecutive failures needed to consider a container as unhealthy. 0 means inherit. 
   * @return retries
  */
  
  @Schema(name = "Retries", description = "The number of consecutive failures needed to consider a container as unhealthy. 0 means inherit. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Retries")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public HealthConfig startPeriod(Long startPeriod) {
    this.startPeriod = startPeriod;
    return this;
  }

  /**
   * Start period for the container to initialize before starting health-retries countdown in nanoseconds. It should be 0 or at least 1000000 (1 ms). 0 means inherit. 
   * @return startPeriod
  */
  
  @Schema(name = "StartPeriod", description = "Start period for the container to initialize before starting health-retries countdown in nanoseconds. It should be 0 or at least 1000000 (1 ms). 0 means inherit. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartPeriod")
  public Long getStartPeriod() {
    return startPeriod;
  }

  public void setStartPeriod(Long startPeriod) {
    this.startPeriod = startPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthConfig healthConfig = (HealthConfig) o;
    return Objects.equals(this.test, healthConfig.test) &&
        Objects.equals(this.interval, healthConfig.interval) &&
        Objects.equals(this.timeout, healthConfig.timeout) &&
        Objects.equals(this.retries, healthConfig.retries) &&
        Objects.equals(this.startPeriod, healthConfig.startPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(test, interval, timeout, retries, startPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthConfig {\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    startPeriod: ").append(toIndentedString(startPeriod)).append("\n");
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

