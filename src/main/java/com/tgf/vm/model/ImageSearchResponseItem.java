package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ImageSearchResponseItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ImageSearchResponseItem {

  private String description;

  private Boolean isOfficial;

  private Boolean isAutomated;

  private String name;

  private Integer starCount;

  public ImageSearchResponseItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ImageSearchResponseItem isOfficial(Boolean isOfficial) {
    this.isOfficial = isOfficial;
    return this;
  }

  /**
   * Get isOfficial
   * @return isOfficial
  */
  
  @Schema(name = "is_official", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_official")
  public Boolean getIsOfficial() {
    return isOfficial;
  }

  public void setIsOfficial(Boolean isOfficial) {
    this.isOfficial = isOfficial;
  }

  public ImageSearchResponseItem isAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
    return this;
  }

  /**
   * Get isAutomated
   * @return isAutomated
  */
  
  @Schema(name = "is_automated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_automated")
  public Boolean getIsAutomated() {
    return isAutomated;
  }

  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }

  public ImageSearchResponseItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ImageSearchResponseItem starCount(Integer starCount) {
    this.starCount = starCount;
    return this;
  }

  /**
   * Get starCount
   * @return starCount
  */
  
  @Schema(name = "star_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("star_count")
  public Integer getStarCount() {
    return starCount;
  }

  public void setStarCount(Integer starCount) {
    this.starCount = starCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSearchResponseItem imageSearchResponseItem = (ImageSearchResponseItem) o;
    return Objects.equals(this.description, imageSearchResponseItem.description) &&
        Objects.equals(this.isOfficial, imageSearchResponseItem.isOfficial) &&
        Objects.equals(this.isAutomated, imageSearchResponseItem.isAutomated) &&
        Objects.equals(this.name, imageSearchResponseItem.name) &&
        Objects.equals(this.starCount, imageSearchResponseItem.starCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isOfficial, isAutomated, name, starCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSearchResponseItem {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isOfficial: ").append(toIndentedString(isOfficial)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    starCount: ").append(toIndentedString(starCount)).append("\n");
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

