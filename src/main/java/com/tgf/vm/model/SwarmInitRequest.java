package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.SwarmSpec;
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
 * SwarmInitRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmInitRequest {

  private String listenAddr;

  private String advertiseAddr;

  private String dataPathAddr;

  private Integer dataPathPort;

  @Valid
  private List<String> defaultAddrPool;

  private Boolean forceNewCluster;

  private Integer subnetSize;

  private SwarmSpec spec;

  public SwarmInitRequest listenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
    return this;
  }

  /**
   * Listen address used for inter-manager communication, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the default swarm listening port is used. 
   * @return listenAddr
  */
  
  @Schema(name = "ListenAddr", description = "Listen address used for inter-manager communication, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the default swarm listening port is used. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ListenAddr")
  public String getListenAddr() {
    return listenAddr;
  }

  public void setListenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
  }

  public SwarmInitRequest advertiseAddr(String advertiseAddr) {
    this.advertiseAddr = advertiseAddr;
    return this;
  }

  /**
   * Externally reachable address advertised to other nodes. This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the port number from the listen address is used. If `AdvertiseAddr` is not specified, it will be automatically detected when possible. 
   * @return advertiseAddr
  */
  
  @Schema(name = "AdvertiseAddr", description = "Externally reachable address advertised to other nodes. This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the port number from the listen address is used. If `AdvertiseAddr` is not specified, it will be automatically detected when possible. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AdvertiseAddr")
  public String getAdvertiseAddr() {
    return advertiseAddr;
  }

  public void setAdvertiseAddr(String advertiseAddr) {
    this.advertiseAddr = advertiseAddr;
  }

  public SwarmInitRequest dataPathAddr(String dataPathAddr) {
    this.dataPathAddr = dataPathAddr;
    return this;
  }

  /**
   * Address or interface to use for data path traffic (format: `<ip|interface>`), for example,  `192.168.1.1`, or an interface, like `eth0`. If `DataPathAddr` is unspecified, the same address as `AdvertiseAddr` is used.  The `DataPathAddr` specifies the address that global scope network drivers will publish towards other  nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster. 
   * @return dataPathAddr
  */
  
  @Schema(name = "DataPathAddr", description = "Address or interface to use for data path traffic (format: `<ip|interface>`), for example,  `192.168.1.1`, or an interface, like `eth0`. If `DataPathAddr` is unspecified, the same address as `AdvertiseAddr` is used.  The `DataPathAddr` specifies the address that global scope network drivers will publish towards other  nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DataPathAddr")
  public String getDataPathAddr() {
    return dataPathAddr;
  }

  public void setDataPathAddr(String dataPathAddr) {
    this.dataPathAddr = dataPathAddr;
  }

  public SwarmInitRequest dataPathPort(Integer dataPathPort) {
    this.dataPathPort = dataPathPort;
    return this;
  }

  /**
   * DataPathPort specifies the data path port number for data traffic. Acceptable port range is 1024 to 49151. if no port is set or is set to 0, default port 4789 will be used. 
   * @return dataPathPort
  */
  
  @Schema(name = "DataPathPort", description = "DataPathPort specifies the data path port number for data traffic. Acceptable port range is 1024 to 49151. if no port is set or is set to 0, default port 4789 will be used. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DataPathPort")
  public Integer getDataPathPort() {
    return dataPathPort;
  }

  public void setDataPathPort(Integer dataPathPort) {
    this.dataPathPort = dataPathPort;
  }

  public SwarmInitRequest defaultAddrPool(List<String> defaultAddrPool) {
    this.defaultAddrPool = defaultAddrPool;
    return this;
  }

  public SwarmInitRequest addDefaultAddrPoolItem(String defaultAddrPoolItem) {
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

  public SwarmInitRequest forceNewCluster(Boolean forceNewCluster) {
    this.forceNewCluster = forceNewCluster;
    return this;
  }

  /**
   * Force creation of a new swarm.
   * @return forceNewCluster
  */
  
  @Schema(name = "ForceNewCluster", description = "Force creation of a new swarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ForceNewCluster")
  public Boolean getForceNewCluster() {
    return forceNewCluster;
  }

  public void setForceNewCluster(Boolean forceNewCluster) {
    this.forceNewCluster = forceNewCluster;
  }

  public SwarmInitRequest subnetSize(Integer subnetSize) {
    this.subnetSize = subnetSize;
    return this;
  }

  /**
   * SubnetSize specifies the subnet size of the networks created from the default subnet pool. 
   * @return subnetSize
  */
  
  @Schema(name = "SubnetSize", description = "SubnetSize specifies the subnet size of the networks created from the default subnet pool. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubnetSize")
  public Integer getSubnetSize() {
    return subnetSize;
  }

  public void setSubnetSize(Integer subnetSize) {
    this.subnetSize = subnetSize;
  }

  public SwarmInitRequest spec(SwarmSpec spec) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmInitRequest swarmInitRequest = (SwarmInitRequest) o;
    return Objects.equals(this.listenAddr, swarmInitRequest.listenAddr) &&
        Objects.equals(this.advertiseAddr, swarmInitRequest.advertiseAddr) &&
        Objects.equals(this.dataPathAddr, swarmInitRequest.dataPathAddr) &&
        Objects.equals(this.dataPathPort, swarmInitRequest.dataPathPort) &&
        Objects.equals(this.defaultAddrPool, swarmInitRequest.defaultAddrPool) &&
        Objects.equals(this.forceNewCluster, swarmInitRequest.forceNewCluster) &&
        Objects.equals(this.subnetSize, swarmInitRequest.subnetSize) &&
        Objects.equals(this.spec, swarmInitRequest.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenAddr, advertiseAddr, dataPathAddr, dataPathPort, defaultAddrPool, forceNewCluster, subnetSize, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmInitRequest {\n");
    sb.append("    listenAddr: ").append(toIndentedString(listenAddr)).append("\n");
    sb.append("    advertiseAddr: ").append(toIndentedString(advertiseAddr)).append("\n");
    sb.append("    dataPathAddr: ").append(toIndentedString(dataPathAddr)).append("\n");
    sb.append("    dataPathPort: ").append(toIndentedString(dataPathPort)).append("\n");
    sb.append("    defaultAddrPool: ").append(toIndentedString(defaultAddrPool)).append("\n");
    sb.append("    forceNewCluster: ").append(toIndentedString(forceNewCluster)).append("\n");
    sb.append("    subnetSize: ").append(toIndentedString(subnetSize)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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

