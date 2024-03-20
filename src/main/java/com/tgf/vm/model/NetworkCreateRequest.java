package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.IPAM;
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
 * NetworkCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class NetworkCreateRequest {

  private String name;

  private Boolean checkDuplicate;

  private String driver = "bridge";

  private Boolean internal;

  private Boolean attachable;

  private Boolean ingress;

  private IPAM ipam;

  private Boolean enableIPv6;

  @Valid
  private Map<String, String> options = new HashMap<>();

  @Valid
  private Map<String, String> labels = new HashMap<>();

  public NetworkCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NetworkCreateRequest(String name) {
    this.name = name;
  }

  public NetworkCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The network's name.
   * @return name
  */
  @NotNull 
  @Schema(name = "Name", description = "The network's name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NetworkCreateRequest checkDuplicate(Boolean checkDuplicate) {
    this.checkDuplicate = checkDuplicate;
    return this;
  }

  /**
   * Check for networks with duplicate names. Since Network is primarily keyed based on a random ID and not on the name, and network name is strictly a user-friendly alias to the network which is uniquely identified using ID, there is no guaranteed way to check for duplicates. CheckDuplicate is there to provide a best effort checking of any networks which has the same name but it is not guaranteed to catch all name collisions. 
   * @return checkDuplicate
  */
  
  @Schema(name = "CheckDuplicate", description = "Check for networks with duplicate names. Since Network is primarily keyed based on a random ID and not on the name, and network name is strictly a user-friendly alias to the network which is uniquely identified using ID, there is no guaranteed way to check for duplicates. CheckDuplicate is there to provide a best effort checking of any networks which has the same name but it is not guaranteed to catch all name collisions. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CheckDuplicate")
  public Boolean getCheckDuplicate() {
    return checkDuplicate;
  }

  public void setCheckDuplicate(Boolean checkDuplicate) {
    this.checkDuplicate = checkDuplicate;
  }

  public NetworkCreateRequest driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Name of the network driver plugin to use.
   * @return driver
  */
  
  @Schema(name = "Driver", description = "Name of the network driver plugin to use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Driver")
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public NetworkCreateRequest internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

  /**
   * Restrict external access to the network.
   * @return internal
  */
  
  @Schema(name = "Internal", description = "Restrict external access to the network.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Internal")
  public Boolean getInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public NetworkCreateRequest attachable(Boolean attachable) {
    this.attachable = attachable;
    return this;
  }

  /**
   * Globally scoped network is manually attachable by regular containers from workers in swarm mode. 
   * @return attachable
  */
  
  @Schema(name = "Attachable", description = "Globally scoped network is manually attachable by regular containers from workers in swarm mode. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Attachable")
  public Boolean getAttachable() {
    return attachable;
  }

  public void setAttachable(Boolean attachable) {
    this.attachable = attachable;
  }

  public NetworkCreateRequest ingress(Boolean ingress) {
    this.ingress = ingress;
    return this;
  }

  /**
   * Ingress network is the network which provides the routing-mesh in swarm mode. 
   * @return ingress
  */
  
  @Schema(name = "Ingress", description = "Ingress network is the network which provides the routing-mesh in swarm mode. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Ingress")
  public Boolean getIngress() {
    return ingress;
  }

  public void setIngress(Boolean ingress) {
    this.ingress = ingress;
  }

  public NetworkCreateRequest ipam(IPAM ipam) {
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

  public NetworkCreateRequest enableIPv6(Boolean enableIPv6) {
    this.enableIPv6 = enableIPv6;
    return this;
  }

  /**
   * Enable IPv6 on the network.
   * @return enableIPv6
  */
  
  @Schema(name = "EnableIPv6", description = "Enable IPv6 on the network.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableIPv6")
  public Boolean getEnableIPv6() {
    return enableIPv6;
  }

  public void setEnableIPv6(Boolean enableIPv6) {
    this.enableIPv6 = enableIPv6;
  }

  public NetworkCreateRequest options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public NetworkCreateRequest putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Network specific options to be used by the drivers.
   * @return options
  */
  
  @Schema(name = "Options", description = "Network specific options to be used by the drivers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Options")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  public NetworkCreateRequest labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public NetworkCreateRequest putLabelsItem(String key, String labelsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkCreateRequest networkCreateRequest = (NetworkCreateRequest) o;
    return Objects.equals(this.name, networkCreateRequest.name) &&
        Objects.equals(this.checkDuplicate, networkCreateRequest.checkDuplicate) &&
        Objects.equals(this.driver, networkCreateRequest.driver) &&
        Objects.equals(this.internal, networkCreateRequest.internal) &&
        Objects.equals(this.attachable, networkCreateRequest.attachable) &&
        Objects.equals(this.ingress, networkCreateRequest.ingress) &&
        Objects.equals(this.ipam, networkCreateRequest.ipam) &&
        Objects.equals(this.enableIPv6, networkCreateRequest.enableIPv6) &&
        Objects.equals(this.options, networkCreateRequest.options) &&
        Objects.equals(this.labels, networkCreateRequest.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, checkDuplicate, driver, internal, attachable, ingress, ipam, enableIPv6, options, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkCreateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    checkDuplicate: ").append(toIndentedString(checkDuplicate)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    attachable: ").append(toIndentedString(attachable)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    ipam: ").append(toIndentedString(ipam)).append("\n");
    sb.append("    enableIPv6: ").append(toIndentedString(enableIPv6)).append("\n");
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

