package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.ContainerSummaryHostConfig;
import com.tgf.vm.model.ContainerSummaryNetworkSettings;
import com.tgf.vm.model.MountPoint;
import com.tgf.vm.model.Port;
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
 * ContainerSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ContainerSummary {

  private String id;

  @Valid
  private List<String> names;

  private String image;

  private String imageID;

  private String command;

  private Long created;

  @Valid
  private List<@Valid Port> ports;

  private Long sizeRw;

  private Long sizeRootFs;

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private String state;

  private String status;

  private ContainerSummaryHostConfig hostConfig;

  private ContainerSummaryNetworkSettings networkSettings;

  @Valid
  private List<@Valid MountPoint> mounts;

  public ContainerSummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this container
   * @return id
  */
  
  @Schema(name = "Id", description = "The ID of this container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContainerSummary names(List<String> names) {
    this.names = names;
    return this;
  }

  public ContainerSummary addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The names that this container has been given
   * @return names
  */
  
  @Schema(name = "Names", description = "The names that this container has been given", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Names")
  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public ContainerSummary image(String image) {
    this.image = image;
    return this;
  }

  /**
   * The name of the image used when creating this container
   * @return image
  */
  
  @Schema(name = "Image", description = "The name of the image used when creating this container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ContainerSummary imageID(String imageID) {
    this.imageID = imageID;
    return this;
  }

  /**
   * The ID of the image that this container was created from
   * @return imageID
  */
  
  @Schema(name = "ImageID", description = "The ID of the image that this container was created from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageID")
  public String getImageID() {
    return imageID;
  }

  public void setImageID(String imageID) {
    this.imageID = imageID;
  }

  public ContainerSummary command(String command) {
    this.command = command;
    return this;
  }

  /**
   * Command to run when starting the container
   * @return command
  */
  
  @Schema(name = "Command", description = "Command to run when starting the container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Command")
  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public ContainerSummary created(Long created) {
    this.created = created;
    return this;
  }

  /**
   * When the container was created
   * @return created
  */
  
  @Schema(name = "Created", description = "When the container was created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public ContainerSummary ports(List<@Valid Port> ports) {
    this.ports = ports;
    return this;
  }

  public ContainerSummary addPortsItem(Port portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * The ports exposed by this container
   * @return ports
  */
  @Valid 
  @Schema(name = "Ports", description = "The ports exposed by this container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Ports")
  public List<@Valid Port> getPorts() {
    return ports;
  }

  public void setPorts(List<@Valid Port> ports) {
    this.ports = ports;
  }

  public ContainerSummary sizeRw(Long sizeRw) {
    this.sizeRw = sizeRw;
    return this;
  }

  /**
   * The size of files that have been created or changed by this container
   * @return sizeRw
  */
  
  @Schema(name = "SizeRw", description = "The size of files that have been created or changed by this container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SizeRw")
  public Long getSizeRw() {
    return sizeRw;
  }

  public void setSizeRw(Long sizeRw) {
    this.sizeRw = sizeRw;
  }

  public ContainerSummary sizeRootFs(Long sizeRootFs) {
    this.sizeRootFs = sizeRootFs;
    return this;
  }

  /**
   * The total size of all the files in this container
   * @return sizeRootFs
  */
  
  @Schema(name = "SizeRootFs", description = "The total size of all the files in this container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SizeRootFs")
  public Long getSizeRootFs() {
    return sizeRootFs;
  }

  public void setSizeRootFs(Long sizeRootFs) {
    this.sizeRootFs = sizeRootFs;
  }

  public ContainerSummary labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ContainerSummary putLabelsItem(String key, String labelsItem) {
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

  public ContainerSummary state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The state of this container (e.g. `Exited`)
   * @return state
  */
  
  @Schema(name = "State", description = "The state of this container (e.g. `Exited`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("State")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ContainerSummary status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Additional human-readable status of this container (e.g. `Exit 0`)
   * @return status
  */
  
  @Schema(name = "Status", description = "Additional human-readable status of this container (e.g. `Exit 0`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ContainerSummary hostConfig(ContainerSummaryHostConfig hostConfig) {
    this.hostConfig = hostConfig;
    return this;
  }

  /**
   * Get hostConfig
   * @return hostConfig
  */
  @Valid 
  @Schema(name = "HostConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HostConfig")
  public ContainerSummaryHostConfig getHostConfig() {
    return hostConfig;
  }

  public void setHostConfig(ContainerSummaryHostConfig hostConfig) {
    this.hostConfig = hostConfig;
  }

  public ContainerSummary networkSettings(ContainerSummaryNetworkSettings networkSettings) {
    this.networkSettings = networkSettings;
    return this;
  }

  /**
   * Get networkSettings
   * @return networkSettings
  */
  @Valid 
  @Schema(name = "NetworkSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NetworkSettings")
  public ContainerSummaryNetworkSettings getNetworkSettings() {
    return networkSettings;
  }

  public void setNetworkSettings(ContainerSummaryNetworkSettings networkSettings) {
    this.networkSettings = networkSettings;
  }

  public ContainerSummary mounts(List<@Valid MountPoint> mounts) {
    this.mounts = mounts;
    return this;
  }

  public ContainerSummary addMountsItem(MountPoint mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

  /**
   * Get mounts
   * @return mounts
  */
  @Valid 
  @Schema(name = "Mounts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mounts")
  public List<@Valid MountPoint> getMounts() {
    return mounts;
  }

  public void setMounts(List<@Valid MountPoint> mounts) {
    this.mounts = mounts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerSummary containerSummary = (ContainerSummary) o;
    return Objects.equals(this.id, containerSummary.id) &&
        Objects.equals(this.names, containerSummary.names) &&
        Objects.equals(this.image, containerSummary.image) &&
        Objects.equals(this.imageID, containerSummary.imageID) &&
        Objects.equals(this.command, containerSummary.command) &&
        Objects.equals(this.created, containerSummary.created) &&
        Objects.equals(this.ports, containerSummary.ports) &&
        Objects.equals(this.sizeRw, containerSummary.sizeRw) &&
        Objects.equals(this.sizeRootFs, containerSummary.sizeRootFs) &&
        Objects.equals(this.labels, containerSummary.labels) &&
        Objects.equals(this.state, containerSummary.state) &&
        Objects.equals(this.status, containerSummary.status) &&
        Objects.equals(this.hostConfig, containerSummary.hostConfig) &&
        Objects.equals(this.networkSettings, containerSummary.networkSettings) &&
        Objects.equals(this.mounts, containerSummary.mounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, names, image, imageID, command, created, ports, sizeRw, sizeRootFs, labels, state, status, hostConfig, networkSettings, mounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    sizeRw: ").append(toIndentedString(sizeRw)).append("\n");
    sb.append("    sizeRootFs: ").append(toIndentedString(sizeRootFs)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hostConfig: ").append(toIndentedString(hostConfig)).append("\n");
    sb.append("    networkSettings: ").append(toIndentedString(networkSettings)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
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

