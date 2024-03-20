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
 * ResourcesUlimitsInner
 */

@JsonTypeName("Resources_Ulimits_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ResourcesUlimitsInner {

  private String name;

  private Integer soft;

  private Integer hard;

  public ResourcesUlimitsInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of ulimit
   * @return name
  */
  
  @Schema(name = "Name", description = "Name of ulimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourcesUlimitsInner soft(Integer soft) {
    this.soft = soft;
    return this;
  }

  /**
   * Soft limit
   * @return soft
  */
  
  @Schema(name = "Soft", description = "Soft limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Soft")
  public Integer getSoft() {
    return soft;
  }

  public void setSoft(Integer soft) {
    this.soft = soft;
  }

  public ResourcesUlimitsInner hard(Integer hard) {
    this.hard = hard;
    return this;
  }

  /**
   * Hard limit
   * @return hard
  */
  
  @Schema(name = "Hard", description = "Hard limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Hard")
  public Integer getHard() {
    return hard;
  }

  public void setHard(Integer hard) {
    this.hard = hard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcesUlimitsInner resourcesUlimitsInner = (ResourcesUlimitsInner) o;
    return Objects.equals(this.name, resourcesUlimitsInner.name) &&
        Objects.equals(this.soft, resourcesUlimitsInner.soft) &&
        Objects.equals(this.hard, resourcesUlimitsInner.hard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, soft, hard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcesUlimitsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    soft: ").append(toIndentedString(soft)).append("\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
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

