package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.GenericResourcesInner;
import com.tgf.vm.model.ObjectVersion;
import com.tgf.vm.model.TaskSpec;
import com.tgf.vm.model.TaskState;
import com.tgf.vm.model.TaskStatus;
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
 * Task
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class Task {

  private String ID;

  private ObjectVersion version;

  private String createdAt;

  private String updatedAt;

  private String name;

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private TaskSpec spec;

  private String serviceID;

  private Integer slot;

  private String nodeID;

  @Valid
  private List<@Valid GenericResourcesInner> assignedGenericResources;

  private TaskStatus status;

  private TaskState desiredState;

  private ObjectVersion jobIteration;

  public Task ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * The ID of the task.
   * @return ID
  */
  
  @Schema(name = "ID", description = "The ID of the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public Task version(ObjectVersion version) {
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

  public Task createdAt(String createdAt) {
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

  public Task updatedAt(String updatedAt) {
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

  public Task name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the task.
   * @return name
  */
  
  @Schema(name = "Name", description = "Name of the task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Task labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Task putLabelsItem(String key, String labelsItem) {
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

  public Task spec(TaskSpec spec) {
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
  public TaskSpec getSpec() {
    return spec;
  }

  public void setSpec(TaskSpec spec) {
    this.spec = spec;
  }

  public Task serviceID(String serviceID) {
    this.serviceID = serviceID;
    return this;
  }

  /**
   * The ID of the service this task is part of.
   * @return serviceID
  */
  
  @Schema(name = "ServiceID", description = "The ID of the service this task is part of.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceID")
  public String getServiceID() {
    return serviceID;
  }

  public void setServiceID(String serviceID) {
    this.serviceID = serviceID;
  }

  public Task slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  /**
   * Get slot
   * @return slot
  */
  
  @Schema(name = "Slot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Slot")
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public Task nodeID(String nodeID) {
    this.nodeID = nodeID;
    return this;
  }

  /**
   * The ID of the node that this task is on.
   * @return nodeID
  */
  
  @Schema(name = "NodeID", description = "The ID of the node that this task is on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NodeID")
  public String getNodeID() {
    return nodeID;
  }

  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }

  public Task assignedGenericResources(List<@Valid GenericResourcesInner> assignedGenericResources) {
    this.assignedGenericResources = assignedGenericResources;
    return this;
  }

  public Task addAssignedGenericResourcesItem(GenericResourcesInner assignedGenericResourcesItem) {
    if (this.assignedGenericResources == null) {
      this.assignedGenericResources = new ArrayList<>();
    }
    this.assignedGenericResources.add(assignedGenericResourcesItem);
    return this;
  }

  /**
   * User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`). 
   * @return assignedGenericResources
  */
  @Valid 
  @Schema(name = "AssignedGenericResources", example = "[{DiscreteResourceSpec={Kind=SSD, Value=3}}, {NamedResourceSpec={Kind=GPU, Value=UUID1}}, {NamedResourceSpec={Kind=GPU, Value=UUID2}}]", description = "User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AssignedGenericResources")
  public List<@Valid GenericResourcesInner> getAssignedGenericResources() {
    return assignedGenericResources;
  }

  public void setAssignedGenericResources(List<@Valid GenericResourcesInner> assignedGenericResources) {
    this.assignedGenericResources = assignedGenericResources;
  }

  public Task status(TaskStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public TaskStatus getStatus() {
    return status;
  }

  public void setStatus(TaskStatus status) {
    this.status = status;
  }

  public Task desiredState(TaskState desiredState) {
    this.desiredState = desiredState;
    return this;
  }

  /**
   * Get desiredState
   * @return desiredState
  */
  @Valid 
  @Schema(name = "DesiredState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DesiredState")
  public TaskState getDesiredState() {
    return desiredState;
  }

  public void setDesiredState(TaskState desiredState) {
    this.desiredState = desiredState;
  }

  public Task jobIteration(ObjectVersion jobIteration) {
    this.jobIteration = jobIteration;
    return this;
  }

  /**
   * Get jobIteration
   * @return jobIteration
  */
  @Valid 
  @Schema(name = "JobIteration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobIteration")
  public ObjectVersion getJobIteration() {
    return jobIteration;
  }

  public void setJobIteration(ObjectVersion jobIteration) {
    this.jobIteration = jobIteration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.ID, task.ID) &&
        Objects.equals(this.version, task.version) &&
        Objects.equals(this.createdAt, task.createdAt) &&
        Objects.equals(this.updatedAt, task.updatedAt) &&
        Objects.equals(this.name, task.name) &&
        Objects.equals(this.labels, task.labels) &&
        Objects.equals(this.spec, task.spec) &&
        Objects.equals(this.serviceID, task.serviceID) &&
        Objects.equals(this.slot, task.slot) &&
        Objects.equals(this.nodeID, task.nodeID) &&
        Objects.equals(this.assignedGenericResources, task.assignedGenericResources) &&
        Objects.equals(this.status, task.status) &&
        Objects.equals(this.desiredState, task.desiredState) &&
        Objects.equals(this.jobIteration, task.jobIteration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, version, createdAt, updatedAt, name, labels, spec, serviceID, slot, nodeID, assignedGenericResources, status, desiredState, jobIteration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    assignedGenericResources: ").append(toIndentedString(assignedGenericResources)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    desiredState: ").append(toIndentedString(desiredState)).append("\n");
    sb.append("    jobIteration: ").append(toIndentedString(jobIteration)).append("\n");
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

