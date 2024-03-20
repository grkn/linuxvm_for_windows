package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Information about the global status of the volume. 
 */

@Schema(name = "ClusterVolume_Info", description = "Information about the global status of the volume. ")
@JsonTypeName("ClusterVolume_Info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ClusterVolumeInfo {

  private Long capacityBytes;

  @Valid
  private Map<String, String> volumeContext = new HashMap<>();

  private String volumeID;

  @Valid
  private List<Map<String, String>> accessibleTopology;

  public ClusterVolumeInfo capacityBytes(Long capacityBytes) {
    this.capacityBytes = capacityBytes;
    return this;
  }

  /**
   * The capacity of the volume in bytes. A value of 0 indicates that the capacity is unknown. 
   * @return capacityBytes
  */
  
  @Schema(name = "CapacityBytes", description = "The capacity of the volume in bytes. A value of 0 indicates that the capacity is unknown. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CapacityBytes")
  public Long getCapacityBytes() {
    return capacityBytes;
  }

  public void setCapacityBytes(Long capacityBytes) {
    this.capacityBytes = capacityBytes;
  }

  public ClusterVolumeInfo volumeContext(Map<String, String> volumeContext) {
    this.volumeContext = volumeContext;
    return this;
  }

  public ClusterVolumeInfo putVolumeContextItem(String key, String volumeContextItem) {
    if (this.volumeContext == null) {
      this.volumeContext = new HashMap<>();
    }
    this.volumeContext.put(key, volumeContextItem);
    return this;
  }

  /**
   * A map of strings to strings returned from the storage plugin when the volume is created. 
   * @return volumeContext
  */
  
  @Schema(name = "VolumeContext", description = "A map of strings to strings returned from the storage plugin when the volume is created. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VolumeContext")
  public Map<String, String> getVolumeContext() {
    return volumeContext;
  }

  public void setVolumeContext(Map<String, String> volumeContext) {
    this.volumeContext = volumeContext;
  }

  public ClusterVolumeInfo volumeID(String volumeID) {
    this.volumeID = volumeID;
    return this;
  }

  /**
   * The ID of the volume as returned by the CSI storage plugin. This is distinct from the volume's ID as provided by Docker. This ID is never used by the user when communicating with Docker to refer to this volume. If the ID is blank, then the Volume has not been successfully created in the plugin yet. 
   * @return volumeID
  */
  
  @Schema(name = "VolumeID", description = "The ID of the volume as returned by the CSI storage plugin. This is distinct from the volume's ID as provided by Docker. This ID is never used by the user when communicating with Docker to refer to this volume. If the ID is blank, then the Volume has not been successfully created in the plugin yet. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VolumeID")
  public String getVolumeID() {
    return volumeID;
  }

  public void setVolumeID(String volumeID) {
    this.volumeID = volumeID;
  }

  public ClusterVolumeInfo accessibleTopology(List<Map<String, String>> accessibleTopology) {
    this.accessibleTopology = accessibleTopology;
    return this;
  }

  public ClusterVolumeInfo addAccessibleTopologyItem(Map<String, String> accessibleTopologyItem) {
    if (this.accessibleTopology == null) {
      this.accessibleTopology = new ArrayList<>();
    }
    this.accessibleTopology.add(accessibleTopologyItem);
    return this;
  }

  /**
   * The topology this volume is actually accessible from. 
   * @return accessibleTopology
  */
  @Valid 
  @Schema(name = "AccessibleTopology", description = "The topology this volume is actually accessible from. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccessibleTopology")
  public List<Map<String, String>> getAccessibleTopology() {
    return accessibleTopology;
  }

  public void setAccessibleTopology(List<Map<String, String>> accessibleTopology) {
    this.accessibleTopology = accessibleTopology;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterVolumeInfo clusterVolumeInfo = (ClusterVolumeInfo) o;
    return Objects.equals(this.capacityBytes, clusterVolumeInfo.capacityBytes) &&
        Objects.equals(this.volumeContext, clusterVolumeInfo.volumeContext) &&
        Objects.equals(this.volumeID, clusterVolumeInfo.volumeID) &&
        Objects.equals(this.accessibleTopology, clusterVolumeInfo.accessibleTopology);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacityBytes, volumeContext, volumeID, accessibleTopology);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterVolumeInfo {\n");
    sb.append("    capacityBytes: ").append(toIndentedString(capacityBytes)).append("\n");
    sb.append("    volumeContext: ").append(toIndentedString(volumeContext)).append("\n");
    sb.append("    volumeID: ").append(toIndentedString(volumeID)).append("\n");
    sb.append("    accessibleTopology: ").append(toIndentedString(accessibleTopology)).append("\n");
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

