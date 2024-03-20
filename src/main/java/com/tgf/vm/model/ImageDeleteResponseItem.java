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
 * ImageDeleteResponseItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ImageDeleteResponseItem {

  private String untagged;

  private String deleted;

  public ImageDeleteResponseItem untagged(String untagged) {
    this.untagged = untagged;
    return this;
  }

  /**
   * The image ID of an image that was untagged
   * @return untagged
  */
  
  @Schema(name = "Untagged", description = "The image ID of an image that was untagged", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Untagged")
  public String getUntagged() {
    return untagged;
  }

  public void setUntagged(String untagged) {
    this.untagged = untagged;
  }

  public ImageDeleteResponseItem deleted(String deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * The image ID of an image that was deleted
   * @return deleted
  */
  
  @Schema(name = "Deleted", description = "The image ID of an image that was deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Deleted")
  public String getDeleted() {
    return deleted;
  }

  public void setDeleted(String deleted) {
    this.deleted = deleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageDeleteResponseItem imageDeleteResponseItem = (ImageDeleteResponseItem) o;
    return Objects.equals(this.untagged, imageDeleteResponseItem.untagged) &&
        Objects.equals(this.deleted, imageDeleteResponseItem.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(untagged, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDeleteResponseItem {\n");
    sb.append("    untagged: ").append(toIndentedString(untagged)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

