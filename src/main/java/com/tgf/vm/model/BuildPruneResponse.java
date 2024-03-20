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
 * BuildPruneResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class BuildPruneResponse {

  @Valid
  private List<String> cachesDeleted;

  private Long spaceReclaimed;

  public BuildPruneResponse cachesDeleted(List<String> cachesDeleted) {
    this.cachesDeleted = cachesDeleted;
    return this;
  }

  public BuildPruneResponse addCachesDeletedItem(String cachesDeletedItem) {
    if (this.cachesDeleted == null) {
      this.cachesDeleted = new ArrayList<>();
    }
    this.cachesDeleted.add(cachesDeletedItem);
    return this;
  }

  /**
   * Get cachesDeleted
   * @return cachesDeleted
  */
  
  @Schema(name = "CachesDeleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CachesDeleted")
  public List<String> getCachesDeleted() {
    return cachesDeleted;
  }

  public void setCachesDeleted(List<String> cachesDeleted) {
    this.cachesDeleted = cachesDeleted;
  }

  public BuildPruneResponse spaceReclaimed(Long spaceReclaimed) {
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
    BuildPruneResponse buildPruneResponse = (BuildPruneResponse) o;
    return Objects.equals(this.cachesDeleted, buildPruneResponse.cachesDeleted) &&
        Objects.equals(this.spaceReclaimed, buildPruneResponse.spaceReclaimed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachesDeleted, spaceReclaimed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildPruneResponse {\n");
    sb.append("    cachesDeleted: ").append(toIndentedString(cachesDeleted)).append("\n");
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

