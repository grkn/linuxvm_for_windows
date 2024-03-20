package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.EndpointSettings;
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
 * A summary of the container&#39;s network settings
 */

@Schema(name = "ContainerSummary_NetworkSettings", description = "A summary of the container's network settings")
@JsonTypeName("ContainerSummary_NetworkSettings")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ContainerSummaryNetworkSettings {

  @Valid
  private Map<String, EndpointSettings> networks = new HashMap<>();

  public ContainerSummaryNetworkSettings networks(Map<String, EndpointSettings> networks) {
    this.networks = networks;
    return this;
  }

  public ContainerSummaryNetworkSettings putNetworksItem(String key, EndpointSettings networksItem) {
    if (this.networks == null) {
      this.networks = new HashMap<>();
    }
    this.networks.put(key, networksItem);
    return this;
  }

  /**
   * Get networks
   * @return networks
  */
  @Valid 
  @Schema(name = "Networks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Networks")
  public Map<String, EndpointSettings> getNetworks() {
    return networks;
  }

  public void setNetworks(Map<String, EndpointSettings> networks) {
    this.networks = networks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerSummaryNetworkSettings containerSummaryNetworkSettings = (ContainerSummaryNetworkSettings) o;
    return Objects.equals(this.networks, containerSummaryNetworkSettings.networks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerSummaryNetworkSettings {\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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

