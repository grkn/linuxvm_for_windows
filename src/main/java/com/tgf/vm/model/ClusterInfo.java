package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.ObjectVersion;
import com.tgf.vm.model.SwarmSpec;
import com.tgf.vm.model.TLSInfo;
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
 * ClusterInfo represents information about the swarm as is returned by the \&quot;/info\&quot; endpoint. Join-tokens are not included. 
 */

@Schema(name = "ClusterInfo", description = "ClusterInfo represents information about the swarm as is returned by the \"/info\" endpoint. Join-tokens are not included. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ClusterInfo {

  private String ID;

  private ObjectVersion version;

  private String createdAt;

  private String updatedAt;

  private SwarmSpec spec;

  private TLSInfo tlSInfo;

  private Boolean rootRotationInProgress;

  private Integer dataPathPort;

  @Valid
  private List<String> defaultAddrPool;

  private Integer subnetSize;

  public ClusterInfo ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * The ID of the swarm.
   * @return ID
  */
  
  @Schema(name = "ID", example = "abajmipo7b4xz5ip2nrla6b11", description = "The ID of the swarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public ClusterInfo version(ObjectVersion version) {
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

  public ClusterInfo createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date and time at which the swarm was initialised in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return createdAt
  */
  
  @Schema(name = "CreatedAt", example = "2016-08-18T10:44:24.496525531Z", description = "Date and time at which the swarm was initialised in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedAt")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ClusterInfo updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Date and time at which the swarm was last updated in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return updatedAt
  */
  
  @Schema(name = "UpdatedAt", example = "2017-08-09T07:09:37.632105588Z", description = "Date and time at which the swarm was last updated in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UpdatedAt")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ClusterInfo spec(SwarmSpec spec) {
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
  public SwarmSpec getSpec() {
    return spec;
  }

  public void setSpec(SwarmSpec spec) {
    this.spec = spec;
  }

  public ClusterInfo tlSInfo(TLSInfo tlSInfo) {
    this.tlSInfo = tlSInfo;
    return this;
  }

  /**
   * Get tlSInfo
   * @return tlSInfo
  */
  @Valid 
  @Schema(name = "TLSInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TLSInfo")
  public TLSInfo getTlSInfo() {
    return tlSInfo;
  }

  public void setTlSInfo(TLSInfo tlSInfo) {
    this.tlSInfo = tlSInfo;
  }

  public ClusterInfo rootRotationInProgress(Boolean rootRotationInProgress) {
    this.rootRotationInProgress = rootRotationInProgress;
    return this;
  }

  /**
   * Whether there is currently a root CA rotation in progress for the swarm 
   * @return rootRotationInProgress
  */
  
  @Schema(name = "RootRotationInProgress", example = "false", description = "Whether there is currently a root CA rotation in progress for the swarm ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RootRotationInProgress")
  public Boolean getRootRotationInProgress() {
    return rootRotationInProgress;
  }

  public void setRootRotationInProgress(Boolean rootRotationInProgress) {
    this.rootRotationInProgress = rootRotationInProgress;
  }

  public ClusterInfo dataPathPort(Integer dataPathPort) {
    this.dataPathPort = dataPathPort;
    return this;
  }

  /**
   * DataPathPort specifies the data path port number for data traffic. Acceptable port range is 1024 to 49151. If no port is set or is set to 0, the default port (4789) is used. 
   * @return dataPathPort
  */
  
  @Schema(name = "DataPathPort", example = "4789", description = "DataPathPort specifies the data path port number for data traffic. Acceptable port range is 1024 to 49151. If no port is set or is set to 0, the default port (4789) is used. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DataPathPort")
  public Integer getDataPathPort() {
    return dataPathPort;
  }

  public void setDataPathPort(Integer dataPathPort) {
    this.dataPathPort = dataPathPort;
  }

  public ClusterInfo defaultAddrPool(List<String> defaultAddrPool) {
    this.defaultAddrPool = defaultAddrPool;
    return this;
  }

  public ClusterInfo addDefaultAddrPoolItem(String defaultAddrPoolItem) {
    if (this.defaultAddrPool == null) {
      this.defaultAddrPool = new ArrayList<>();
    }
    this.defaultAddrPool.add(defaultAddrPoolItem);
    return this;
  }

  /**
   * Default Address Pool specifies default subnet pools for global scope networks. 
   * @return defaultAddrPool
  */
  
  @Schema(name = "DefaultAddrPool", description = "Default Address Pool specifies default subnet pools for global scope networks. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DefaultAddrPool")
  public List<String> getDefaultAddrPool() {
    return defaultAddrPool;
  }

  public void setDefaultAddrPool(List<String> defaultAddrPool) {
    this.defaultAddrPool = defaultAddrPool;
  }

  public ClusterInfo subnetSize(Integer subnetSize) {
    this.subnetSize = subnetSize;
    return this;
  }

  /**
   * SubnetSize specifies the subnet size of the networks created from the default subnet pool. 
   * maximum: 29
   * @return subnetSize
  */
  @Max(29) 
  @Schema(name = "SubnetSize", example = "24", description = "SubnetSize specifies the subnet size of the networks created from the default subnet pool. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubnetSize")
  public Integer getSubnetSize() {
    return subnetSize;
  }

  public void setSubnetSize(Integer subnetSize) {
    this.subnetSize = subnetSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterInfo clusterInfo = (ClusterInfo) o;
    return Objects.equals(this.ID, clusterInfo.ID) &&
        Objects.equals(this.version, clusterInfo.version) &&
        Objects.equals(this.createdAt, clusterInfo.createdAt) &&
        Objects.equals(this.updatedAt, clusterInfo.updatedAt) &&
        Objects.equals(this.spec, clusterInfo.spec) &&
        Objects.equals(this.tlSInfo, clusterInfo.tlSInfo) &&
        Objects.equals(this.rootRotationInProgress, clusterInfo.rootRotationInProgress) &&
        Objects.equals(this.dataPathPort, clusterInfo.dataPathPort) &&
        Objects.equals(this.defaultAddrPool, clusterInfo.defaultAddrPool) &&
        Objects.equals(this.subnetSize, clusterInfo.subnetSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, version, createdAt, updatedAt, spec, tlSInfo, rootRotationInProgress, dataPathPort, defaultAddrPool, subnetSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterInfo {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    tlSInfo: ").append(toIndentedString(tlSInfo)).append("\n");
    sb.append("    rootRotationInProgress: ").append(toIndentedString(rootRotationInProgress)).append("\n");
    sb.append("    dataPathPort: ").append(toIndentedString(dataPathPort)).append("\n");
    sb.append("    defaultAddrPool: ").append(toIndentedString(defaultAddrPool)).append("\n");
    sb.append("    subnetSize: ").append(toIndentedString(subnetSize)).append("\n");
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

