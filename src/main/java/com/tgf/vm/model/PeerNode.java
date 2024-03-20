package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Represents a peer-node in the swarm
 */

@Schema(name = "PeerNode", description = "Represents a peer-node in the swarm")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PeerNode {

  private String nodeID;

  private String addr;

  public PeerNode nodeID(String nodeID) {
    this.nodeID = nodeID;
    return this;
  }

  /**
   * Unique identifier of for this node in the swarm.
   * @return nodeID
  */
  
  @Schema(name = "NodeID", description = "Unique identifier of for this node in the swarm.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NodeID")
  public String getNodeID() {
    return nodeID;
  }

  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }

  public PeerNode addr(String addr) {
    this.addr = addr;
    return this;
  }

  /**
   * IP address and ports at which this node can be reached. 
   * @return addr
  */
  
  @Schema(name = "Addr", description = "IP address and ports at which this node can be reached. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Addr")
  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeerNode peerNode = (PeerNode) o;
    return Objects.equals(this.nodeID, peerNode.nodeID) &&
        Objects.equals(this.addr, peerNode.addr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeID, addr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeerNode {\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
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

