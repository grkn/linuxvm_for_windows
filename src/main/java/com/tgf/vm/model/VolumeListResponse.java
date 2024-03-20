package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.Volume;
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
 * Volume list response
 */

@Schema(name = "VolumeListResponse", description = "Volume list response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class VolumeListResponse {

  @Valid
  private List<@Valid Volume> volumes;

  @Valid
  private List<String> warnings;

  public VolumeListResponse volumes(List<@Valid Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public VolumeListResponse addVolumesItem(Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * List of volumes
   * @return volumes
  */
  @Valid 
  @Schema(name = "Volumes", description = "List of volumes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Volumes")
  public List<@Valid Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<@Valid Volume> volumes) {
    this.volumes = volumes;
  }

  public VolumeListResponse warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public VolumeListResponse addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Warnings that occurred when fetching the list of volumes. 
   * @return warnings
  */
  
  @Schema(name = "Warnings", example = "[]", description = "Warnings that occurred when fetching the list of volumes. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Warnings")
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeListResponse volumeListResponse = (VolumeListResponse) o;
    return Objects.equals(this.volumes, volumeListResponse.volumes) &&
        Objects.equals(this.warnings, volumeListResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumes, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeListResponse {\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

