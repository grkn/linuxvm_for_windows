package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.IPAM;
import com.tgf.vm.model.NetworkContainer;
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
 * Network
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class Network {

  private String name;

  private String id;

  private String created;

  private String scope;

  private String driver;

  private Boolean enableIPv6;

  private IPAM ipam;

  private Boolean internal;

  private Boolean attachable;

  private Boolean ingress;

  @Valid
  private Map<String, NetworkContainer> containers = new HashMap<>();

  @Valid
  private Map<String, String> options = new HashMap<>();

  @Valid
  private Map<String, String> labels = new HashMap<>();

  public Network name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Network id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "Id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Network created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  
  @Schema(name = "Created", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Created")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Network scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  
  @Schema(name = "Scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Scope")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public Network driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  */
  
  @Schema(name = "Driver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public Network enableIPv6(Boolean enableIPv6) {
    this.enableIPv6 = enableIPv6;
    return this;
  }

  /**
   * Get enableIPv6
   * @return enableIPv6
  */
  
  @Schema(name = "EnableIPv6", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableIPv6")
  public Boolean getEnableIPv6() {
    return enableIPv6;
  }

  public void setEnableIPv6(Boolean enableIPv6) {
    this.enableIPv6 = enableIPv6;
  }

  public Network ipam(IPAM ipam) {
    this.ipam = ipam;
    return this;
  }

  /**
   * Get ipam
   * @return ipam
  */
  @Valid 
  @Schema(name = "IPAM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IPAM")
  public IPAM getIPAM() {
    return ipam;
  }

  public void setIPAM(IPAM ipam) {
    this.ipam = ipam;
  }

  public Network internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

  /**
   * Get internal
   * @return internal
  */
  
  @Schema(name = "Internal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Internal")
  public Boolean getInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public Network attachable(Boolean attachable) {
    this.attachable = attachable;
    return this;
  }

  /**
   * Get attachable
   * @return attachable
  */
  
  @Schema(name = "Attachable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Attachable")
  public Boolean getAttachable() {
    return attachable;
  }

  public void setAttachable(Boolean attachable) {
    this.attachable = attachable;
  }

  public Network ingress(Boolean ingress) {
    this.ingress = ingress;
    return this;
  }

  /**
   * Get ingress
   * @return ingress
  */
  
  @Schema(name = "Ingress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Ingress")
  public Boolean getIngress() {
    return ingress;
  }

  public void setIngress(Boolean ingress) {
    this.ingress = ingress;
  }

  public Network containers(Map<String, NetworkContainer> containers) {
    this.containers = containers;
    return this;
  }

  public Network putContainersItem(String key, NetworkContainer containersItem) {
    if (this.containers == null) {
      this.containers = new HashMap<>();
    }
    this.containers.put(key, containersItem);
    return this;
  }

  /**
   * Get containers
   * @return containers
  */
  @Valid 
  @Schema(name = "Containers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Containers")
  public Map<String, NetworkContainer> getContainers() {
    return containers;
  }

  public void setContainers(Map<String, NetworkContainer> containers) {
    this.containers = containers;
  }

  public Network options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Network putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
  */
  
  @Schema(name = "Options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Options")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  public Network labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Network putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
  
  @Schema(name = "Labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Network network = (Network) o;
    return Objects.equals(this.name, network.name) &&
        Objects.equals(this.id, network.id) &&
        Objects.equals(this.created, network.created) &&
        Objects.equals(this.scope, network.scope) &&
        Objects.equals(this.driver, network.driver) &&
        Objects.equals(this.enableIPv6, network.enableIPv6) &&
        Objects.equals(this.ipam, network.ipam) &&
        Objects.equals(this.internal, network.internal) &&
        Objects.equals(this.attachable, network.attachable) &&
        Objects.equals(this.ingress, network.ingress) &&
        Objects.equals(this.containers, network.containers) &&
        Objects.equals(this.options, network.options) &&
        Objects.equals(this.labels, network.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, created, scope, driver, enableIPv6, ipam, internal, attachable, ingress, containers, options, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Network {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    enableIPv6: ").append(toIndentedString(enableIPv6)).append("\n");
    sb.append("    ipam: ").append(toIndentedString(ipam)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    attachable: ").append(toIndentedString(attachable)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

