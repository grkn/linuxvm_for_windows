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
 * SwarmJoinRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmJoinRequest {

  private String listenAddr;

  private String advertiseAddr;

  private String dataPathAddr;

  @Valid
  private List<String> remoteAddrs;

  private String joinToken;

  public SwarmJoinRequest listenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
    return this;
  }

  /**
   * Listen address used for inter-manager communication if the node gets promoted to manager, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). 
   * @return listenAddr
  */
  
  @Schema(name = "ListenAddr", description = "Listen address used for inter-manager communication if the node gets promoted to manager, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ListenAddr")
  public String getListenAddr() {
    return listenAddr;
  }

  public void setListenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
  }

  public SwarmJoinRequest advertiseAddr(String advertiseAddr) {
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

  public SwarmJoinRequest dataPathAddr(String dataPathAddr) {
    this.dataPathAddr = dataPathAddr;
    return this;
  }

  /**
   * Address or interface to use for data path traffic (format: `<ip|interface>`), for example,  `192.168.1.1`, or an interface, like `eth0`. If `DataPathAddr` is unspecified, the same address as `AdvertiseAddr` is used.  The `DataPathAddr` specifies the address that global scope network drivers will publish towards other nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster. 
   * @return dataPathAddr
  */
  
  @Schema(name = "DataPathAddr", description = "Address or interface to use for data path traffic (format: `<ip|interface>`), for example,  `192.168.1.1`, or an interface, like `eth0`. If `DataPathAddr` is unspecified, the same address as `AdvertiseAddr` is used.  The `DataPathAddr` specifies the address that global scope network drivers will publish towards other nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DataPathAddr")
  public String getDataPathAddr() {
    return dataPathAddr;
  }

  public void setDataPathAddr(String dataPathAddr) {
    this.dataPathAddr = dataPathAddr;
  }

  public SwarmJoinRequest remoteAddrs(List<String> remoteAddrs) {
    this.remoteAddrs = remoteAddrs;
    return this;
  }

  public SwarmJoinRequest addRemoteAddrsItem(String remoteAddrsItem) {
    if (this.remoteAddrs == null) {
      this.remoteAddrs = new ArrayList<>();
    }
    this.remoteAddrs.add(remoteAddrsItem);
    return this;
  }

  /**
   * Addresses of manager nodes already participating in the swarm. 
   * @return remoteAddrs
  */
  
  @Schema(name = "RemoteAddrs", description = "Addresses of manager nodes already participating in the swarm. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RemoteAddrs")
  public List<String> getRemoteAddrs() {
    return remoteAddrs;
  }

  public void setRemoteAddrs(List<String> remoteAddrs) {
    this.remoteAddrs = remoteAddrs;
  }

  public SwarmJoinRequest joinToken(String joinToken) {
    this.joinToken = joinToken;
    return this;
  }

  /**
   * Secret token for joining this swarm.
   * @return joinToken
  */
  
  @Schema(name = "JoinToken", description = "Secret token for joining this swarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JoinToken")
  public String getJoinToken() {
    return joinToken;
  }

  public void setJoinToken(String joinToken) {
    this.joinToken = joinToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmJoinRequest swarmJoinRequest = (SwarmJoinRequest) o;
    return Objects.equals(this.listenAddr, swarmJoinRequest.listenAddr) &&
        Objects.equals(this.advertiseAddr, swarmJoinRequest.advertiseAddr) &&
        Objects.equals(this.dataPathAddr, swarmJoinRequest.dataPathAddr) &&
        Objects.equals(this.remoteAddrs, swarmJoinRequest.remoteAddrs) &&
        Objects.equals(this.joinToken, swarmJoinRequest.joinToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenAddr, advertiseAddr, dataPathAddr, remoteAddrs, joinToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmJoinRequest {\n");
    sb.append("    listenAddr: ").append(toIndentedString(listenAddr)).append("\n");
    sb.append("    advertiseAddr: ").append(toIndentedString(advertiseAddr)).append("\n");
    sb.append("    dataPathAddr: ").append(toIndentedString(dataPathAddr)).append("\n");
    sb.append("    remoteAddrs: ").append(toIndentedString(remoteAddrs)).append("\n");
    sb.append("    joinToken: ").append(toIndentedString(joinToken)).append("\n");
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

