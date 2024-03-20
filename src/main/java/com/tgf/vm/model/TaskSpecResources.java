package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.Limit;
import com.tgf.vm.model.ResourceObject;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource requirements which apply to each individual container created as part of the service. 
 */

@Schema(name = "TaskSpec_Resources", description = "Resource requirements which apply to each individual container created as part of the service. ")
@JsonTypeName("TaskSpec_Resources")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecResources {

  private Limit limits;

  private ResourceObject reservations;

  public TaskSpecResources limits(Limit limits) {
    this.limits = limits;
    return this;
  }

  /**
   * Get limits
   * @return limits
  */
  @Valid 
  @Schema(name = "Limits", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Limits")
  public Limit getLimits() {
    return limits;
  }

  public void setLimits(Limit limits) {
    this.limits = limits;
  }

  public TaskSpecResources reservations(ResourceObject reservations) {
    this.reservations = reservations;
    return this;
  }

  /**
   * Get reservations
   * @return reservations
  */
  @Valid 
  @Schema(name = "Reservations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reservations")
  public ResourceObject getReservations() {
    return reservations;
  }

  public void setReservations(ResourceObject reservations) {
    this.reservations = reservations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecResources taskSpecResources = (TaskSpecResources) o;
    return Objects.equals(this.limits, taskSpecResources.limits) &&
        Objects.equals(this.reservations, taskSpecResources.reservations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, reservations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecResources {\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    reservations: ").append(toIndentedString(reservations)).append("\n");
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

