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
 * ContainerPruneResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ContainerPruneResponse {

  @Valid
  private List<String> containersDeleted;

  private Long spaceReclaimed;

  public ContainerPruneResponse containersDeleted(List<String> containersDeleted) {
    this.containersDeleted = containersDeleted;
    return this;
  }

  public ContainerPruneResponse addContainersDeletedItem(String containersDeletedItem) {
    if (this.containersDeleted == null) {
      this.containersDeleted = new ArrayList<>();
    }
    this.containersDeleted.add(containersDeletedItem);
    return this;
  }

  /**
   * Container IDs that were deleted
   * @return containersDeleted
  */
  
  @Schema(name = "ContainersDeleted", description = "Container IDs that were deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainersDeleted")
  public List<String> getContainersDeleted() {
    return containersDeleted;
  }

  public void setContainersDeleted(List<String> containersDeleted) {
    this.containersDeleted = containersDeleted;
  }

  public ContainerPruneResponse spaceReclaimed(Long spaceReclaimed) {
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
    ContainerPruneResponse containerPruneResponse = (ContainerPruneResponse) o;
    return Objects.equals(this.containersDeleted, containerPruneResponse.containersDeleted) &&
        Objects.equals(this.spaceReclaimed, containerPruneResponse.spaceReclaimed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containersDeleted, spaceReclaimed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerPruneResponse {\n");
    sb.append("    containersDeleted: ").append(toIndentedString(containersDeleted)).append("\n");
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

