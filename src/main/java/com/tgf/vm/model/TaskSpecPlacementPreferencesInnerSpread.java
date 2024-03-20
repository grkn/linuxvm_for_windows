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
 * TaskSpecPlacementPreferencesInnerSpread
 */

@JsonTypeName("TaskSpec_Placement_Preferences_inner_Spread")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecPlacementPreferencesInnerSpread {

  private String spreadDescriptor;

  public TaskSpecPlacementPreferencesInnerSpread spreadDescriptor(String spreadDescriptor) {
    this.spreadDescriptor = spreadDescriptor;
    return this;
  }

  /**
   * label descriptor, such as `engine.labels.az`. 
   * @return spreadDescriptor
  */
  
  @Schema(name = "SpreadDescriptor", description = "label descriptor, such as `engine.labels.az`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SpreadDescriptor")
  public String getSpreadDescriptor() {
    return spreadDescriptor;
  }

  public void setSpreadDescriptor(String spreadDescriptor) {
    this.spreadDescriptor = spreadDescriptor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecPlacementPreferencesInnerSpread taskSpecPlacementPreferencesInnerSpread = (TaskSpecPlacementPreferencesInnerSpread) o;
    return Objects.equals(this.spreadDescriptor, taskSpecPlacementPreferencesInnerSpread.spreadDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spreadDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecPlacementPreferencesInnerSpread {\n");
    sb.append("    spreadDescriptor: ").append(toIndentedString(spreadDescriptor)).append("\n");
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

