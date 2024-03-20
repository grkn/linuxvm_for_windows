package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.MountVolumeOptionsDriverConfig;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Optional configuration for the &#x60;volume&#x60; type.
 */

@Schema(name = "Mount_VolumeOptions", description = "Optional configuration for the `volume` type.")
@JsonTypeName("Mount_VolumeOptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class MountVolumeOptions {

  private Boolean noCopy = false;

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private MountVolumeOptionsDriverConfig driverConfig;

  public MountVolumeOptions noCopy(Boolean noCopy) {
    this.noCopy = noCopy;
    return this;
  }

  /**
   * Populate volume with data from the target.
   * @return noCopy
  */
  
  @Schema(name = "NoCopy", description = "Populate volume with data from the target.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NoCopy")
  public Boolean getNoCopy() {
    return noCopy;
  }

  public void setNoCopy(Boolean noCopy) {
    this.noCopy = noCopy;
  }

  public MountVolumeOptions labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public MountVolumeOptions putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * User-defined key/value metadata.
   * @return labels
  */
  
  @Schema(name = "Labels", description = "User-defined key/value metadata.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public MountVolumeOptions driverConfig(MountVolumeOptionsDriverConfig driverConfig) {
    this.driverConfig = driverConfig;
    return this;
  }

  /**
   * Get driverConfig
   * @return driverConfig
  */
  @Valid 
  @Schema(name = "DriverConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DriverConfig")
  public MountVolumeOptionsDriverConfig getDriverConfig() {
    return driverConfig;
  }

  public void setDriverConfig(MountVolumeOptionsDriverConfig driverConfig) {
    this.driverConfig = driverConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountVolumeOptions mountVolumeOptions = (MountVolumeOptions) o;
    return Objects.equals(this.noCopy, mountVolumeOptions.noCopy) &&
        Objects.equals(this.labels, mountVolumeOptions.labels) &&
        Objects.equals(this.driverConfig, mountVolumeOptions.driverConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noCopy, labels, driverConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountVolumeOptions {\n");
    sb.append("    noCopy: ").append(toIndentedString(noCopy)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    driverConfig: ").append(toIndentedString(driverConfig)).append("\n");
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

