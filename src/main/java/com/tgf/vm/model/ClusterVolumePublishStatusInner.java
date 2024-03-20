package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * ClusterVolumePublishStatusInner
 */

@JsonTypeName("ClusterVolume_PublishStatus_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ClusterVolumePublishStatusInner {

  private String nodeID;

  /**
   * The published state of the volume. * `pending-publish` The volume should be published to this node, but the call to the controller plugin to do so has not yet been successfully completed. * `published` The volume is published successfully to the node. * `pending-node-unpublish` The volume should be unpublished from the node, and the manager is awaiting confirmation from the worker that it has done so. * `pending-controller-unpublish` The volume is successfully unpublished from the node, but has not yet been successfully unpublished on the controller. 
   */
  public enum StateEnum {
    PENDING_PUBLISH("pending-publish"),
    
    PUBLISHED("published"),
    
    PENDING_NODE_UNPUBLISH("pending-node-unpublish"),
    
    PENDING_CONTROLLER_UNPUBLISH("pending-controller-unpublish");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StateEnum state;

  @Valid
  private Map<String, String> publishContext = new HashMap<>();

  public ClusterVolumePublishStatusInner nodeID(String nodeID) {
    this.nodeID = nodeID;
    return this;
  }

  /**
   * The ID of the Swarm node the volume is published on. 
   * @return nodeID
  */
  
  @Schema(name = "NodeID", description = "The ID of the Swarm node the volume is published on. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NodeID")
  public String getNodeID() {
    return nodeID;
  }

  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }

  public ClusterVolumePublishStatusInner state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * The published state of the volume. * `pending-publish` The volume should be published to this node, but the call to the controller plugin to do so has not yet been successfully completed. * `published` The volume is published successfully to the node. * `pending-node-unpublish` The volume should be unpublished from the node, and the manager is awaiting confirmation from the worker that it has done so. * `pending-controller-unpublish` The volume is successfully unpublished from the node, but has not yet been successfully unpublished on the controller. 
   * @return state
  */
  
  @Schema(name = "State", description = "The published state of the volume. * `pending-publish` The volume should be published to this node, but the call to the controller plugin to do so has not yet been successfully completed. * `published` The volume is published successfully to the node. * `pending-node-unpublish` The volume should be unpublished from the node, and the manager is awaiting confirmation from the worker that it has done so. * `pending-controller-unpublish` The volume is successfully unpublished from the node, but has not yet been successfully unpublished on the controller. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("State")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public ClusterVolumePublishStatusInner publishContext(Map<String, String> publishContext) {
    this.publishContext = publishContext;
    return this;
  }

  public ClusterVolumePublishStatusInner putPublishContextItem(String key, String publishContextItem) {
    if (this.publishContext == null) {
      this.publishContext = new HashMap<>();
    }
    this.publishContext.put(key, publishContextItem);
    return this;
  }

  /**
   * A map of strings to strings returned by the CSI controller plugin when a volume is published. 
   * @return publishContext
  */
  
  @Schema(name = "PublishContext", description = "A map of strings to strings returned by the CSI controller plugin when a volume is published. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PublishContext")
  public Map<String, String> getPublishContext() {
    return publishContext;
  }

  public void setPublishContext(Map<String, String> publishContext) {
    this.publishContext = publishContext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterVolumePublishStatusInner clusterVolumePublishStatusInner = (ClusterVolumePublishStatusInner) o;
    return Objects.equals(this.nodeID, clusterVolumePublishStatusInner.nodeID) &&
        Objects.equals(this.state, clusterVolumePublishStatusInner.state) &&
        Objects.equals(this.publishContext, clusterVolumePublishStatusInner.publishContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeID, state, publishContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterVolumePublishStatusInner {\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    publishContext: ").append(toIndentedString(publishContext)).append("\n");
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

