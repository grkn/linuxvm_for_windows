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
 * ResourcesBlkioWeightDeviceInner
 */

@JsonTypeName("Resources_BlkioWeightDevice_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ResourcesBlkioWeightDeviceInner {

  private String path;

  private Integer weight;

  public ResourcesBlkioWeightDeviceInner path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  
  @Schema(name = "Path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ResourcesBlkioWeightDeviceInner weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * minimum: 0
   * @return weight
  */
  @Min(0) 
  @Schema(name = "Weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Weight")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcesBlkioWeightDeviceInner resourcesBlkioWeightDeviceInner = (ResourcesBlkioWeightDeviceInner) o;
    return Objects.equals(this.path, resourcesBlkioWeightDeviceInner.path) &&
        Objects.equals(this.weight, resourcesBlkioWeightDeviceInner.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcesBlkioWeightDeviceInner {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

