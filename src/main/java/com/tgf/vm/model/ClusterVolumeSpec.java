package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.ClusterVolumeSpecAccessMode;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Cluster-specific options used to create the volume. 
 */

@Schema(name = "ClusterVolumeSpec", description = "Cluster-specific options used to create the volume. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ClusterVolumeSpec {

  private String group;

  private ClusterVolumeSpecAccessMode accessMode;

  public ClusterVolumeSpec group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Group defines the volume group of this volume. Volumes belonging to the same group can be referred to by group name when creating Services.  Referring to a volume by group instructs Swarm to treat volumes in that group interchangeably for the purpose of scheduling. Volumes with an empty string for a group technically all belong to the same, emptystring group. 
   * @return group
  */
  
  @Schema(name = "Group", description = "Group defines the volume group of this volume. Volumes belonging to the same group can be referred to by group name when creating Services.  Referring to a volume by group instructs Swarm to treat volumes in that group interchangeably for the purpose of scheduling. Volumes with an empty string for a group technically all belong to the same, emptystring group. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Group")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public ClusterVolumeSpec accessMode(ClusterVolumeSpecAccessMode accessMode) {
    this.accessMode = accessMode;
    return this;
  }

  /**
   * Get accessMode
   * @return accessMode
  */
  @Valid 
  @Schema(name = "AccessMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccessMode")
  public ClusterVolumeSpecAccessMode getAccessMode() {
    return accessMode;
  }

  public void setAccessMode(ClusterVolumeSpecAccessMode accessMode) {
    this.accessMode = accessMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterVolumeSpec clusterVolumeSpec = (ClusterVolumeSpec) o;
    return Objects.equals(this.group, clusterVolumeSpec.group) &&
        Objects.equals(this.accessMode, clusterVolumeSpec.accessMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, accessMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterVolumeSpec {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
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

