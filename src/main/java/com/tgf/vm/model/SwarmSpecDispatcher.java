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
 * Dispatcher configuration.
 */

@Schema(name = "SwarmSpec_Dispatcher", description = "Dispatcher configuration.")
@JsonTypeName("SwarmSpec_Dispatcher")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmSpecDispatcher {

  private Long heartbeatPeriod;

  public SwarmSpecDispatcher heartbeatPeriod(Long heartbeatPeriod) {
    this.heartbeatPeriod = heartbeatPeriod;
    return this;
  }

  /**
   * The delay for an agent to send a heartbeat to the dispatcher. 
   * @return heartbeatPeriod
  */
  
  @Schema(name = "HeartbeatPeriod", example = "5000000000", description = "The delay for an agent to send a heartbeat to the dispatcher. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HeartbeatPeriod")
  public Long getHeartbeatPeriod() {
    return heartbeatPeriod;
  }

  public void setHeartbeatPeriod(Long heartbeatPeriod) {
    this.heartbeatPeriod = heartbeatPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecDispatcher swarmSpecDispatcher = (SwarmSpecDispatcher) o;
    return Objects.equals(this.heartbeatPeriod, swarmSpecDispatcher.heartbeatPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heartbeatPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecDispatcher {\n");
    sb.append("    heartbeatPeriod: ").append(toIndentedString(heartbeatPeriod)).append("\n");
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

