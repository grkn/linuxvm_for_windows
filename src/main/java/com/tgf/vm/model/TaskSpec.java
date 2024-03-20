package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.NetworkAttachmentConfig;
import com.tgf.vm.model.TaskSpecContainerSpec;
import com.tgf.vm.model.TaskSpecLogDriver;
import com.tgf.vm.model.TaskSpecNetworkAttachmentSpec;
import com.tgf.vm.model.TaskSpecPlacement;
import com.tgf.vm.model.TaskSpecPluginSpec;
import com.tgf.vm.model.TaskSpecResources;
import com.tgf.vm.model.TaskSpecRestartPolicy;
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
 * User modifiable task configuration.
 */

@Schema(name = "TaskSpec", description = "User modifiable task configuration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class TaskSpec {

  private TaskSpecPluginSpec pluginSpec;

  private TaskSpecContainerSpec containerSpec;

  private TaskSpecNetworkAttachmentSpec networkAttachmentSpec;

  private TaskSpecResources resources;

  private TaskSpecRestartPolicy restartPolicy;

  private TaskSpecPlacement placement;

  private Integer forceUpdate;

  private String runtime;

  @Valid
  private List<@Valid NetworkAttachmentConfig> networks;

  private TaskSpecLogDriver logDriver;

  public TaskSpec pluginSpec(TaskSpecPluginSpec pluginSpec) {
    this.pluginSpec = pluginSpec;
    return this;
  }

  /**
   * Get pluginSpec
   * @return pluginSpec
  */
  @Valid 
  @Schema(name = "PluginSpec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PluginSpec")
  public TaskSpecPluginSpec getPluginSpec() {
    return pluginSpec;
  }

  public void setPluginSpec(TaskSpecPluginSpec pluginSpec) {
    this.pluginSpec = pluginSpec;
  }

  public TaskSpec containerSpec(TaskSpecContainerSpec containerSpec) {
    this.containerSpec = containerSpec;
    return this;
  }

  /**
   * Get containerSpec
   * @return containerSpec
  */
  @Valid 
  @Schema(name = "ContainerSpec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainerSpec")
  public TaskSpecContainerSpec getContainerSpec() {
    return containerSpec;
  }

  public void setContainerSpec(TaskSpecContainerSpec containerSpec) {
    this.containerSpec = containerSpec;
  }

  public TaskSpec networkAttachmentSpec(TaskSpecNetworkAttachmentSpec networkAttachmentSpec) {
    this.networkAttachmentSpec = networkAttachmentSpec;
    return this;
  }

  /**
   * Get networkAttachmentSpec
   * @return networkAttachmentSpec
  */
  @Valid 
  @Schema(name = "NetworkAttachmentSpec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NetworkAttachmentSpec")
  public TaskSpecNetworkAttachmentSpec getNetworkAttachmentSpec() {
    return networkAttachmentSpec;
  }

  public void setNetworkAttachmentSpec(TaskSpecNetworkAttachmentSpec networkAttachmentSpec) {
    this.networkAttachmentSpec = networkAttachmentSpec;
  }

  public TaskSpec resources(TaskSpecResources resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
  */
  @Valid 
  @Schema(name = "Resources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Resources")
  public TaskSpecResources getResources() {
    return resources;
  }

  public void setResources(TaskSpecResources resources) {
    this.resources = resources;
  }

  public TaskSpec restartPolicy(TaskSpecRestartPolicy restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

  /**
   * Get restartPolicy
   * @return restartPolicy
  */
  @Valid 
  @Schema(name = "RestartPolicy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RestartPolicy")
  public TaskSpecRestartPolicy getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(TaskSpecRestartPolicy restartPolicy) {
    this.restartPolicy = restartPolicy;
  }

  public TaskSpec placement(TaskSpecPlacement placement) {
    this.placement = placement;
    return this;
  }

  /**
   * Get placement
   * @return placement
  */
  @Valid 
  @Schema(name = "Placement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Placement")
  public TaskSpecPlacement getPlacement() {
    return placement;
  }

  public void setPlacement(TaskSpecPlacement placement) {
    this.placement = placement;
  }

  public TaskSpec forceUpdate(Integer forceUpdate) {
    this.forceUpdate = forceUpdate;
    return this;
  }

  /**
   * A counter that triggers an update even if no relevant parameters have been changed. 
   * @return forceUpdate
  */
  
  @Schema(name = "ForceUpdate", description = "A counter that triggers an update even if no relevant parameters have been changed. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ForceUpdate")
  public Integer getForceUpdate() {
    return forceUpdate;
  }

  public void setForceUpdate(Integer forceUpdate) {
    this.forceUpdate = forceUpdate;
  }

  public TaskSpec runtime(String runtime) {
    this.runtime = runtime;
    return this;
  }

  /**
   * Runtime is the type of runtime specified for the task executor. 
   * @return runtime
  */
  
  @Schema(name = "Runtime", description = "Runtime is the type of runtime specified for the task executor. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Runtime")
  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public TaskSpec networks(List<@Valid NetworkAttachmentConfig> networks) {
    this.networks = networks;
    return this;
  }

  public TaskSpec addNetworksItem(NetworkAttachmentConfig networksItem) {
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

  public TaskSpec logDriver(TaskSpecLogDriver logDriver) {
    this.logDriver = logDriver;
    return this;
  }

  /**
   * Get logDriver
   * @return logDriver
  */
  @Valid 
  @Schema(name = "LogDriver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LogDriver")
  public TaskSpecLogDriver getLogDriver() {
    return logDriver;
  }

  public void setLogDriver(TaskSpecLogDriver logDriver) {
    this.logDriver = logDriver;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpec taskSpec = (TaskSpec) o;
    return Objects.equals(this.pluginSpec, taskSpec.pluginSpec) &&
        Objects.equals(this.containerSpec, taskSpec.containerSpec) &&
        Objects.equals(this.networkAttachmentSpec, taskSpec.networkAttachmentSpec) &&
        Objects.equals(this.resources, taskSpec.resources) &&
        Objects.equals(this.restartPolicy, taskSpec.restartPolicy) &&
        Objects.equals(this.placement, taskSpec.placement) &&
        Objects.equals(this.forceUpdate, taskSpec.forceUpdate) &&
        Objects.equals(this.runtime, taskSpec.runtime) &&
        Objects.equals(this.networks, taskSpec.networks) &&
        Objects.equals(this.logDriver, taskSpec.logDriver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pluginSpec, containerSpec, networkAttachmentSpec, resources, restartPolicy, placement, forceUpdate, runtime, networks, logDriver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpec {\n");
    sb.append("    pluginSpec: ").append(toIndentedString(pluginSpec)).append("\n");
    sb.append("    containerSpec: ").append(toIndentedString(containerSpec)).append("\n");
    sb.append("    networkAttachmentSpec: ").append(toIndentedString(networkAttachmentSpec)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    forceUpdate: ").append(toIndentedString(forceUpdate)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    logDriver: ").append(toIndentedString(logDriver)).append("\n");
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

