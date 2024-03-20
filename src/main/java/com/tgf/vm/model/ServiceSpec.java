package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.EndpointSpec;
import com.tgf.vm.model.NetworkAttachmentConfig;
import com.tgf.vm.model.ServiceSpecMode;
import com.tgf.vm.model.ServiceSpecRollbackConfig;
import com.tgf.vm.model.ServiceSpecUpdateConfig;
import com.tgf.vm.model.TaskSpec;
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
 * User modifiable configuration for a service.
 */

@Schema(name = "ServiceSpec", description = "User modifiable configuration for a service.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ServiceSpec {

  private String name;

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private TaskSpec taskTemplate;

  private ServiceSpecMode mode;

  private ServiceSpecUpdateConfig updateConfig;

  private ServiceSpecRollbackConfig rollbackConfig;

  @Valid
  private List<@Valid NetworkAttachmentConfig> networks;

  private EndpointSpec endpointSpec;

  public ServiceSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the service.
   * @return name
  */
  
  @Schema(name = "Name", description = "Name of the service.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ServiceSpec putLabelsItem(String key, String labelsItem) {
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

  public ServiceSpec taskTemplate(TaskSpec taskTemplate) {
    this.taskTemplate = taskTemplate;
    return this;
  }

  /**
   * Get taskTemplate
   * @return taskTemplate
  */
  @Valid 
  @Schema(name = "TaskTemplate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TaskTemplate")
  public TaskSpec getTaskTemplate() {
    return taskTemplate;
  }

  public void setTaskTemplate(TaskSpec taskTemplate) {
    this.taskTemplate = taskTemplate;
  }

  public ServiceSpec mode(ServiceSpecMode mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  @Valid 
  @Schema(name = "Mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mode")
  public ServiceSpecMode getMode() {
    return mode;
  }

  public void setMode(ServiceSpecMode mode) {
    this.mode = mode;
  }

  public ServiceSpec updateConfig(ServiceSpecUpdateConfig updateConfig) {
    this.updateConfig = updateConfig;
    return this;
  }

  /**
   * Get updateConfig
   * @return updateConfig
  */
  @Valid 
  @Schema(name = "UpdateConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UpdateConfig")
  public ServiceSpecUpdateConfig getUpdateConfig() {
    return updateConfig;
  }

  public void setUpdateConfig(ServiceSpecUpdateConfig updateConfig) {
    this.updateConfig = updateConfig;
  }

  public ServiceSpec rollbackConfig(ServiceSpecRollbackConfig rollbackConfig) {
    this.rollbackConfig = rollbackConfig;
    return this;
  }

  /**
   * Get rollbackConfig
   * @return rollbackConfig
  */
  @Valid 
  @Schema(name = "RollbackConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RollbackConfig")
  public ServiceSpecRollbackConfig getRollbackConfig() {
    return rollbackConfig;
  }

  public void setRollbackConfig(ServiceSpecRollbackConfig rollbackConfig) {
    this.rollbackConfig = rollbackConfig;
  }

  public ServiceSpec networks(List<@Valid NetworkAttachmentConfig> networks) {
    this.networks = networks;
    return this;
  }

  public ServiceSpec addNetworksItem(NetworkAttachmentConfig networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<>();
    }
    this.networks.add(networksItem);
    return this;
  }

  /**
   * Specifies which networks the service should attach to.
   * @return networks
  */
  @Valid 
  @Schema(name = "Networks", description = "Specifies which networks the service should attach to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Networks")
  public List<@Valid NetworkAttachmentConfig> getNetworks() {
    return networks;
  }

  public void setNetworks(List<@Valid NetworkAttachmentConfig> networks) {
    this.networks = networks;
  }

  public ServiceSpec endpointSpec(EndpointSpec endpointSpec) {
    this.endpointSpec = endpointSpec;
    return this;
  }

  /**
   * Get endpointSpec
   * @return endpointSpec
  */
  @Valid 
  @Schema(name = "EndpointSpec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndpointSpec")
  public EndpointSpec getEndpointSpec() {
    return endpointSpec;
  }

  public void setEndpointSpec(EndpointSpec endpointSpec) {
    this.endpointSpec = endpointSpec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSpec serviceSpec = (ServiceSpec) o;
    return Objects.equals(this.name, serviceSpec.name) &&
        Objects.equals(this.labels, serviceSpec.labels) &&
        Objects.equals(this.taskTemplate, serviceSpec.taskTemplate) &&
        Objects.equals(this.mode, serviceSpec.mode) &&
        Objects.equals(this.updateConfig, serviceSpec.updateConfig) &&
        Objects.equals(this.rollbackConfig, serviceSpec.rollbackConfig) &&
        Objects.equals(this.networks, serviceSpec.networks) &&
        Objects.equals(this.endpointSpec, serviceSpec.endpointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels, taskTemplate, mode, updateConfig, rollbackConfig, networks, endpointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpec {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    taskTemplate: ").append(toIndentedString(taskTemplate)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    updateConfig: ").append(toIndentedString(updateConfig)).append("\n");
    sb.append("    rollbackConfig: ").append(toIndentedString(rollbackConfig)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    endpointSpec: ").append(toIndentedString(endpointSpec)).append("\n");
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

