package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HealthcheckResult stores information about a single run of a healthcheck probe 
 */

@Schema(name = "HealthcheckResult", description = "HealthcheckResult stores information about a single run of a healthcheck probe ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class HealthcheckResult {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime start;

  private String end;

  private Integer exitCode;

  private String output;

  public HealthcheckResult start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Date and time at which this check started in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return start
  */
  @Valid 
  @Schema(name = "Start", example = "2020-01-04T10:44:24.496525531Z", description = "Date and time at which this check started in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Start")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public HealthcheckResult end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Date and time at which this check ended in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return end
  */
  
  @Schema(name = "End", example = "2020-01-04T10:45:21.364524523Z", description = "Date and time at which this check ended in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("End")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public HealthcheckResult exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * ExitCode meanings:  - `0` healthy - `1` unhealthy - `2` reserved (considered unhealthy) - other values: error running probe 
   * @return exitCode
  */
  
  @Schema(name = "ExitCode", example = "0", description = "ExitCode meanings:  - `0` healthy - `1` unhealthy - `2` reserved (considered unhealthy) - other values: error running probe ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExitCode")
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  public HealthcheckResult output(String output) {
    this.output = output;
    return this;
  }

  /**
   * Output from last check
   * @return output
  */
  
  @Schema(name = "Output", description = "Output from last check", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Output")
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthcheckResult healthcheckResult = (HealthcheckResult) o;
    return Objects.equals(this.start, healthcheckResult.start) &&
        Objects.equals(this.end, healthcheckResult.end) &&
        Objects.equals(this.exitCode, healthcheckResult.exitCode) &&
        Objects.equals(this.output, healthcheckResult.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, exitCode, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthcheckResult {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

