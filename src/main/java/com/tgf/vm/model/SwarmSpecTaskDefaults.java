package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.SwarmSpecTaskDefaultsLogDriver;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Defaults for creating tasks in this cluster.
 */

@Schema(name = "SwarmSpec_TaskDefaults", description = "Defaults for creating tasks in this cluster.")
@JsonTypeName("SwarmSpec_TaskDefaults")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmSpecTaskDefaults {

  private SwarmSpecTaskDefaultsLogDriver logDriver;

  public SwarmSpecTaskDefaults logDriver(SwarmSpecTaskDefaultsLogDriver logDriver) {
    this.logDriver = logDriver;
    return this;
  }

  /**
   * Get logDriver
   * @return logDriver
  */
  @Valid 
  @Schema(name = "LogDriver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LogDriver")
  public SwarmSpecTaskDefaultsLogDriver getLogDriver() {
    return logDriver;
  }

  public void setLogDriver(SwarmSpecTaskDefaultsLogDriver logDriver) {
    this.logDriver = logDriver;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecTaskDefaults swarmSpecTaskDefaults = (SwarmSpecTaskDefaults) o;
    return Objects.equals(this.logDriver, swarmSpecTaskDefaults.logDriver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDriver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecTaskDefaults {\n");
    sb.append("    logDriver: ").append(toIndentedString(logDriver)).append("\n");
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

