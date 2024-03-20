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
 * The desired capacity that the volume should be created with. If empty, the plugin will decide the capacity. 
 */

@Schema(name = "ClusterVolumeSpec_AccessMode_CapacityRange", description = "The desired capacity that the volume should be created with. If empty, the plugin will decide the capacity. ")
@JsonTypeName("ClusterVolumeSpec_AccessMode_CapacityRange")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ClusterVolumeSpecAccessModeCapacityRange {

  private Long requiredBytes;

  private Long limitBytes;

  public ClusterVolumeSpecAccessModeCapacityRange requiredBytes(Long requiredBytes) {
    this.requiredBytes = requiredBytes;
    return this;
  }

  /**
   * The volume must be at least this big. The value of 0 indicates an unspecified minimum 
   * @return requiredBytes
  */
  
  @Schema(name = "RequiredBytes", description = "The volume must be at least this big. The value of 0 indicates an unspecified minimum ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequiredBytes")
  public Long getRequiredBytes() {
    return requiredBytes;
  }

  public void setRequiredBytes(Long requiredBytes) {
    this.requiredBytes = requiredBytes;
  }

  public ClusterVolumeSpecAccessModeCapacityRange limitBytes(Long limitBytes) {
    this.limitBytes = limitBytes;
    return this;
  }

  /**
   * The volume must not be bigger than this. The value of 0 indicates an unspecified maximum. 
   * @return limitBytes
  */
  
  @Schema(name = "LimitBytes", description = "The volume must not be bigger than this. The value of 0 indicates an unspecified maximum. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LimitBytes")
  public Long getLimitBytes() {
    return limitBytes;
  }

  public void setLimitBytes(Long limitBytes) {
    this.limitBytes = limitBytes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterVolumeSpecAccessModeCapacityRange clusterVolumeSpecAccessModeCapacityRange = (ClusterVolumeSpecAccessModeCapacityRange) o;
    return Objects.equals(this.requiredBytes, clusterVolumeSpecAccessModeCapacityRange.requiredBytes) &&
        Objects.equals(this.limitBytes, clusterVolumeSpecAccessModeCapacityRange.limitBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiredBytes, limitBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterVolumeSpecAccessModeCapacityRange {\n");
    sb.append("    requiredBytes: ").append(toIndentedString(requiredBytes)).append("\n");
    sb.append("    limitBytes: ").append(toIndentedString(limitBytes)).append("\n");
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

