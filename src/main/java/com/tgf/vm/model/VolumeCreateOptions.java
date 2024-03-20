package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.ClusterVolumeSpec;
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
 * Volume configuration
 */

@Schema(name = "VolumeCreateOptions", description = "Volume configuration")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class VolumeCreateOptions {

  private String name;

  private String driver = "local";

  @Valid
  private Map<String, String> driverOpts = new HashMap<>();

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private ClusterVolumeSpec clusterVolumeSpec;

  public VolumeCreateOptions name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The new volume's name. If not specified, Docker generates a name. 
   * @return name
  */
  
  @Schema(name = "Name", example = "tardis", description = "The new volume's name. If not specified, Docker generates a name. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VolumeCreateOptions driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Name of the volume driver to use.
   * @return driver
  */
  
  @Schema(name = "Driver", example = "custom", description = "Name of the volume driver to use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public VolumeCreateOptions driverOpts(Map<String, String> driverOpts) {
    this.driverOpts = driverOpts;
    return this;
  }

  public VolumeCreateOptions putDriverOptsItem(String key, String driverOptsItem) {
    if (this.driverOpts == null) {
      this.driverOpts = new HashMap<>();
    }
    this.driverOpts.put(key, driverOptsItem);
    return this;
  }

  /**
   * A mapping of driver options and values. These options are passed directly to the driver and are driver specific. 
   * @return driverOpts
  */
  
  @Schema(name = "DriverOpts", example = "{\"device\":\"tmpfs\",\"o\":\"size=100m,uid=1000\",\"type\":\"tmpfs\"}", description = "A mapping of driver options and values. These options are passed directly to the driver and are driver specific. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DriverOpts")
  public Map<String, String> getDriverOpts() {
    return driverOpts;
  }

  public void setDriverOpts(Map<String, String> driverOpts) {
    this.driverOpts = driverOpts;
  }

  public VolumeCreateOptions labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public VolumeCreateOptions putLabelsItem(String key, String labelsItem) {
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
  
  @Schema(name = "Labels", example = "{\"com.example.some-label\":\"some-value\",\"com.example.some-other-label\":\"some-other-value\"}", description = "User-defined key/value metadata.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public VolumeCreateOptions clusterVolumeSpec(ClusterVolumeSpec clusterVolumeSpec) {
    this.clusterVolumeSpec = clusterVolumeSpec;
    return this;
  }

  /**
   * Get clusterVolumeSpec
   * @return clusterVolumeSpec
  */
  @Valid 
  @Schema(name = "ClusterVolumeSpec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClusterVolumeSpec")
  public ClusterVolumeSpec getClusterVolumeSpec() {
    return clusterVolumeSpec;
  }

  public void setClusterVolumeSpec(ClusterVolumeSpec clusterVolumeSpec) {
    this.clusterVolumeSpec = clusterVolumeSpec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeCreateOptions volumeCreateOptions = (VolumeCreateOptions) o;
    return Objects.equals(this.name, volumeCreateOptions.name) &&
        Objects.equals(this.driver, volumeCreateOptions.driver) &&
        Objects.equals(this.driverOpts, volumeCreateOptions.driverOpts) &&
        Objects.equals(this.labels, volumeCreateOptions.labels) &&
        Objects.equals(this.clusterVolumeSpec, volumeCreateOptions.clusterVolumeSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, driver, driverOpts, labels, clusterVolumeSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeCreateOptions {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    driverOpts: ").append(toIndentedString(driverOpts)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    clusterVolumeSpec: ").append(toIndentedString(clusterVolumeSpec)).append("\n");
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

