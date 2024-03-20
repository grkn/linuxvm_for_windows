package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.ClusterInfo;
import com.tgf.vm.model.LocalNodeState;
import com.tgf.vm.model.PeerNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Represents generic information about swarm. 
 */

@Schema(name = "SwarmInfo", description = "Represents generic information about swarm. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmInfo {

  private String nodeID = "";

  private String nodeAddr = "";

  private LocalNodeState localNodeState = LocalNodeState.EMPTY;

  private Boolean controlAvailable = false;

  private String error = "";

  @Valid
  private JsonNullable<List<@Valid PeerNode>> remoteManagers = JsonNullable.<List<@Valid PeerNode>>undefined();

  private JsonNullable<Integer> nodes = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> managers = JsonNullable.<Integer>undefined();

  private JsonNullable<ClusterInfo> cluster = JsonNullable.<ClusterInfo>undefined();

  public SwarmInfo nodeID(String nodeID) {
    this.nodeID = nodeID;
    return this;
  }

  /**
   * Unique identifier of for this node in the swarm.
   * @return nodeID
  */
  
  @Schema(name = "NodeID", example = "k67qz4598weg5unwwffg6z1m1", description = "Unique identifier of for this node in the swarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NodeID")
  public String getNodeID() {
    return nodeID;
  }

  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }

  public SwarmInfo nodeAddr(String nodeAddr) {
    this.nodeAddr = nodeAddr;
    return this;
  }

  /**
   * IP address at which this node can be reached by other nodes in the swarm. 
   * @return nodeAddr
  */
  
  @Schema(name = "NodeAddr", example = "10.0.0.46", description = "IP address at which this node can be reached by other nodes in the swarm. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NodeAddr")
  public String getNodeAddr() {
    return nodeAddr;
  }

  public void setNodeAddr(String nodeAddr) {
    this.nodeAddr = nodeAddr;
  }

  public SwarmInfo localNodeState(LocalNodeState localNodeState) {
    this.localNodeState = localNodeState;
    return this;
  }

  /**
   * Get localNodeState
   * @return localNodeState
  */
  @Valid 
  @Schema(name = "LocalNodeState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LocalNodeState")
  public LocalNodeState getLocalNodeState() {
    return localNodeState;
  }

  public void setLocalNodeState(LocalNodeState localNodeState) {
    this.localNodeState = localNodeState;
  }

  public SwarmInfo controlAvailable(Boolean controlAvailable) {
    this.controlAvailable = controlAvailable;
    return this;
  }

  /**
   * Get controlAvailable
   * @return controlAvailable
  */
  
  @Schema(name = "ControlAvailable", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ControlAvailable")
  public Boolean getControlAvailable() {
    return controlAvailable;
  }

  public void setControlAvailable(Boolean controlAvailable) {
    this.controlAvailable = controlAvailable;
  }

  public SwarmInfo error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  
  @Schema(name = "Error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public SwarmInfo remoteManagers(List<@Valid PeerNode> remoteManagers) {
    this.remoteManagers = JsonNullable.of(remoteManagers);
    return this;
  }

  public SwarmInfo addRemoteManagersItem(PeerNode remoteManagersItem) {
    if (this.remoteManagers == null || !this.remoteManagers.isPresent()) {
      this.remoteManagers = JsonNullable.of(new ArrayList<>());
    }
    this.remoteManagers.get().add(remoteManagersItem);
    return this;
  }

  /**
   * List of ID's and addresses of other managers in the swarm. 
   * @return remoteManagers
  */
  @Valid 
  @Schema(name = "RemoteManagers", example = "[{NodeID=71izy0goik036k48jg985xnds, Addr=10.0.0.158:2377}, {NodeID=79y6h1o4gv8n120drcprv5nmc, Addr=10.0.0.159:2377}, {NodeID=k67qz4598weg5unwwffg6z1m1, Addr=10.0.0.46:2377}]", description = "List of ID's and addresses of other managers in the swarm. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RemoteManagers")
  public JsonNullable<List<@Valid PeerNode>> getRemoteManagers() {
    return remoteManagers;
  }

  public void setRemoteManagers(JsonNullable<List<@Valid PeerNode>> remoteManagers) {
    this.remoteManagers = remoteManagers;
  }

  public SwarmInfo nodes(Integer nodes) {
    this.nodes = JsonNullable.of(nodes);
    return this;
  }

  /**
   * Total number of nodes in the swarm.
   * @return nodes
  */
  
  @Schema(name = "Nodes", example = "4", description = "Total number of nodes in the swarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Nodes")
  public JsonNullable<Integer> getNodes() {
    return nodes;
  }

  public void setNodes(JsonNullable<Integer> nodes) {
    this.nodes = nodes;
  }

  public SwarmInfo managers(Integer managers) {
    this.managers = JsonNullable.of(managers);
    return this;
  }

  /**
   * Total number of managers in the swarm.
   * @return managers
  */
  
  @Schema(name = "Managers", example = "3", description = "Total number of managers in the swarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Managers")
  public JsonNullable<Integer> getManagers() {
    return managers;
  }

  public void setManagers(JsonNullable<Integer> managers) {
    this.managers = managers;
  }

  public SwarmInfo cluster(ClusterInfo cluster) {
    this.cluster = JsonNullable.of(cluster);
    return this;
  }

  /**
   * Get cluster
   * @return cluster
  */
  @Valid 
  @Schema(name = "Cluster", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Cluster")
  public JsonNullable<ClusterInfo> getCluster() {
    return cluster;
  }

  public void setCluster(JsonNullable<ClusterInfo> cluster) {
    this.cluster = cluster;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmInfo swarmInfo = (SwarmInfo) o;
    return Objects.equals(this.nodeID, swarmInfo.nodeID) &&
        Objects.equals(this.nodeAddr, swarmInfo.nodeAddr) &&
        Objects.equals(this.localNodeState, swarmInfo.localNodeState) &&
        Objects.equals(this.controlAvailable, swarmInfo.controlAvailable) &&
        Objects.equals(this.error, swarmInfo.error) &&
        equalsNullable(this.remoteManagers, swarmInfo.remoteManagers) &&
        equalsNullable(this.nodes, swarmInfo.nodes) &&
        equalsNullable(this.managers, swarmInfo.managers) &&
        equalsNullable(this.cluster, swarmInfo.cluster);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeID, nodeAddr, localNodeState, controlAvailable, error, hashCodeNullable(remoteManagers), hashCodeNullable(nodes), hashCodeNullable(managers), hashCodeNullable(cluster));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmInfo {\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    nodeAddr: ").append(toIndentedString(nodeAddr)).append("\n");
    sb.append("    localNodeState: ").append(toIndentedString(localNodeState)).append("\n");
    sb.append("    controlAvailable: ").append(toIndentedString(controlAvailable)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    remoteManagers: ").append(toIndentedString(remoteManagers)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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

