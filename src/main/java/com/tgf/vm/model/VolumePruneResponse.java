package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * VolumePruneResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class VolumePruneResponse {

  @Valid
  private List<String> volumesDeleted;

  private Long spaceReclaimed;

  public VolumePruneResponse volumesDeleted(List<String> volumesDeleted) {
    this.volumesDeleted = volumesDeleted;
    return this;
  }

  public VolumePruneResponse addVolumesDeletedItem(String volumesDeletedItem) {
    if (this.volumesDeleted == null) {
      this.volumesDeleted = new ArrayList<>();
    }
    this.volumesDeleted.add(volumesDeletedItem);
    return this;
  }

  /**
   * Volumes that were deleted
   * @return volumesDeleted
  */
  
  @Schema(name = "VolumesDeleted", description = "Volumes that were deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VolumesDeleted")
  public List<String> getVolumesDeleted() {
    return volumesDeleted;
  }

  public void setVolumesDeleted(List<String> volumesDeleted) {
    this.volumesDeleted = volumesDeleted;
  }

  public VolumePruneResponse spaceReclaimed(Long spaceReclaimed) {
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
    VolumePruneResponse volumePruneResponse = (VolumePruneResponse) o;
    return Objects.equals(this.volumesDeleted, volumePruneResponse.volumesDeleted) &&
        Objects.equals(this.spaceReclaimed, volumePruneResponse.spaceReclaimed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumesDeleted, spaceReclaimed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumePruneResponse {\n");
    sb.append("    volumesDeleted: ").append(toIndentedString(volumesDeleted)).append("\n");
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

