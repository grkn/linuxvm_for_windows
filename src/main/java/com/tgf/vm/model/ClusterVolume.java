package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.ClusterVolumeInfo;
import com.tgf.vm.model.ClusterVolumePublishStatusInner;
import com.tgf.vm.model.ClusterVolumeSpec;
import com.tgf.vm.model.ObjectVersion;
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
 * Options and information specific to, and only present on, Swarm CSI cluster volumes. 
 */

@Schema(name = "ClusterVolume", description = "Options and information specific to, and only present on, Swarm CSI cluster volumes. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ClusterVolume {

  private String ID;

  private ObjectVersion version;

  private String createdAt;

  private String updatedAt;

  private ClusterVolumeSpec spec;

  private ClusterVolumeInfo info;

  @Valid
  private List<@Valid ClusterVolumePublishStatusInner> publishStatus;

  public ClusterVolume ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * The Swarm ID of this volume. Because cluster volumes are Swarm objects, they have an ID, unlike non-cluster volumes. This ID can be used to refer to the Volume instead of the name. 
   * @return ID
  */
  
  @Schema(name = "ID", description = "The Swarm ID of this volume. Because cluster volumes are Swarm objects, they have an ID, unlike non-cluster volumes. This ID can be used to refer to the Volume instead of the name. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public ClusterVolume version(ObjectVersion version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @Valid 
  @Schema(name = "Version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Version")
  public ObjectVersion getVersion() {
    return version;
  }

  public void setVersion(ObjectVersion version) {
    this.version = version;
  }

  public ClusterVolume createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "CreatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedAt")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ClusterVolume updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  
  @Schema(name = "UpdatedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UpdatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ClusterVolume spec(ClusterVolumeSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
  @Valid 
  @Schema(name = "Spec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Spec")
  public ClusterVolumeSpec getSpec() {
    return spec;
  }

  public void setSpec(ClusterVolumeSpec spec) {
    this.spec = spec;
  }

  public ClusterVolume info(ClusterVolumeInfo info) {
    this.info = info;
    return this;
  }

  /**
   * Get info
   * @return info
  */
  @Valid 
  @Schema(name = "Info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Info")
  public ClusterVolumeInfo getInfo() {
    return info;
  }

  public void setInfo(ClusterVolumeInfo info) {
    this.info = info;
  }

  public ClusterVolume publishStatus(List<@Valid ClusterVolumePublishStatusInner> publishStatus) {
    this.publishStatus = publishStatus;
    return this;
  }

  public ClusterVolume addPublishStatusItem(ClusterVolumePublishStatusInner publishStatusItem) {
    if (this.publishStatus == null) {
      this.publishStatus = new ArrayList<>();
    }
    this.publishStatus.add(publishStatusItem);
    return this;
  }

  /**
   * The status of the volume as it pertains to its publishing and use on specific nodes 
   * @return publishStatus
  */
  @Valid 
  @Schema(name = "PublishStatus", description = "The status of the volume as it pertains to its publishing and use on specific nodes ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PublishStatus")
  public List<@Valid ClusterVolumePublishStatusInner> getPublishStatus() {
    return publishStatus;
  }

  public void setPublishStatus(List<@Valid ClusterVolumePublishStatusInner> publishStatus) {
    this.publishStatus = publishStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterVolume clusterVolume = (ClusterVolume) o;
    return Objects.equals(this.ID, clusterVolume.ID) &&
        Objects.equals(this.version, clusterVolume.version) &&
        Objects.equals(this.createdAt, clusterVolume.createdAt) &&
        Objects.equals(this.updatedAt, clusterVolume.updatedAt) &&
        Objects.equals(this.spec, clusterVolume.spec) &&
        Objects.equals(this.info, clusterVolume.info) &&
        Objects.equals(this.publishStatus, clusterVolume.publishStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, version, createdAt, updatedAt, spec, info, publishStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterVolume {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    publishStatus: ").append(toIndentedString(publishStatus)).append("\n");
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

