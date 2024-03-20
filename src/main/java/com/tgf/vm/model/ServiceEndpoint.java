package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.EndpointPortConfig;
import com.tgf.vm.model.EndpointSpec;
import com.tgf.vm.model.ServiceEndpointVirtualIPsInner;
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
 * ServiceEndpoint
 */

@JsonTypeName("Service_Endpoint")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ServiceEndpoint {

  private EndpointSpec spec;

  @Valid
  private List<@Valid EndpointPortConfig> ports;

  @Valid
  private List<@Valid ServiceEndpointVirtualIPsInner> virtualIPs;

  public ServiceEndpoint spec(EndpointSpec spec) {
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
  public EndpointSpec getSpec() {
    return spec;
  }

  public void setSpec(EndpointSpec spec) {
    this.spec = spec;
  }

  public ServiceEndpoint ports(List<@Valid EndpointPortConfig> ports) {
    this.ports = ports;
    return this;
  }

  public ServiceEndpoint addPortsItem(EndpointPortConfig portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * Get ports
   * @return ports
  */
  @Valid 
  @Schema(name = "Ports", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Ports")
  public List<@Valid EndpointPortConfig> getPorts() {
    return ports;
  }

  public void setPorts(List<@Valid EndpointPortConfig> ports) {
    this.ports = ports;
  }

  public ServiceEndpoint virtualIPs(List<@Valid ServiceEndpointVirtualIPsInner> virtualIPs) {
    this.virtualIPs = virtualIPs;
    return this;
  }

  public ServiceEndpoint addVirtualIPsItem(ServiceEndpointVirtualIPsInner virtualIPsItem) {
    if (this.virtualIPs == null) {
      this.virtualIPs = new ArrayList<>();
    }
    this.virtualIPs.add(virtualIPsItem);
    return this;
  }

  /**
   * Get virtualIPs
   * @return virtualIPs
  */
  @Valid 
  @Schema(name = "VirtualIPs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VirtualIPs")
  public List<@Valid ServiceEndpointVirtualIPsInner> getVirtualIPs() {
    return virtualIPs;
  }

  public void setVirtualIPs(List<@Valid ServiceEndpointVirtualIPsInner> virtualIPs) {
    this.virtualIPs = virtualIPs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceEndpoint serviceEndpoint = (ServiceEndpoint) o;
    return Objects.equals(this.spec, serviceEndpoint.spec) &&
        Objects.equals(this.ports, serviceEndpoint.ports) &&
        Objects.equals(this.virtualIPs, serviceEndpoint.virtualIPs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spec, ports, virtualIPs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceEndpoint {\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    virtualIPs: ").append(toIndentedString(virtualIPs)).append("\n");
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

