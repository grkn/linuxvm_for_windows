package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.ImageDeleteResponseItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ImagePruneResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ImagePruneResponse {

  @Valid
  private List<@Valid ImageDeleteResponseItem> imagesDeleted;

  private Long spaceReclaimed;

  public ImagePruneResponse imagesDeleted(List<@Valid ImageDeleteResponseItem> imagesDeleted) {
    this.imagesDeleted = imagesDeleted;
    return this;
  }

  public ImagePruneResponse addImagesDeletedItem(ImageDeleteResponseItem imagesDeletedItem) {
    if (this.imagesDeleted == null) {
      this.imagesDeleted = new ArrayList<>();
    }
    this.imagesDeleted.add(imagesDeletedItem);
    return this;
  }

  /**
   * Images that were deleted
   * @return imagesDeleted
  */
  @Valid 
  @Schema(name = "ImagesDeleted", description = "Images that were deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImagesDeleted")
  public List<@Valid ImageDeleteResponseItem> getImagesDeleted() {
    return imagesDeleted;
  }

  public void setImagesDeleted(List<@Valid ImageDeleteResponseItem> imagesDeleted) {
    this.imagesDeleted = imagesDeleted;
  }

  public ImagePruneResponse spaceReclaimed(Long spaceReclaimed) {
    this.spaceReclaimed = spaceReclaimed;
    return this;
  }

  /**
   * Disk space reclaimed in bytes
   * @return spaceReclaimed
  */
  
  @Schema(name = "SpaceReclaimed", description = "Disk space reclaimed in bytes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SpaceReclaimed")
  public Long getSpaceReclaimed() {
    return spaceReclaimed;
  }

  public void setSpaceReclaimed(Long spaceReclaimed) {
    this.spaceReclaimed = spaceReclaimed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagePruneResponse imagePruneResponse = (ImagePruneResponse) o;
    return Objects.equals(this.imagesDeleted, imagePruneResponse.imagesDeleted) &&
        Objects.equals(this.spaceReclaimed, imagePruneResponse.spaceReclaimed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imagesDeleted, spaceReclaimed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagePruneResponse {\n");
    sb.append("    imagesDeleted: ").append(toIndentedString(imagesDeleted)).append("\n");
    sb.append("    spaceReclaimed: ").append(toIndentedString(spaceReclaimed)).append("\n");
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

