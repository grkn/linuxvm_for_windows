package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.TaskSpecPlacementPreferencesInnerSpread;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TaskSpecPlacementPreferencesInner
 */

@JsonTypeName("TaskSpec_Placement_Preferences_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpecPlacementPreferencesInner {

  private TaskSpecPlacementPreferencesInnerSpread spread;

  public TaskSpecPlacementPreferencesInner spread(TaskSpecPlacementPreferencesInnerSpread spread) {
    this.spread = spread;
    return this;
  }

  /**
   * Get spread
   * @return spread
  */
  @Valid 
  @Schema(name = "Spread", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Spread")
  public TaskSpecPlacementPreferencesInnerSpread getSpread() {
    return spread;
  }

  public void setSpread(TaskSpecPlacementPreferencesInnerSpread spread) {
    this.spread = spread;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecPlacementPreferencesInner taskSpecPlacementPreferencesInner = (TaskSpecPlacementPreferencesInner) o;
    return Objects.equals(this.spread, taskSpecPlacementPreferencesInner.spread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecPlacementPreferencesInner {\n");
    sb.append("    spread: ").append(toIndentedString(spread)).append("\n");
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

