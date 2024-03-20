package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * EndpointIPAMConfig represents an endpoint&#39;s IPAM configuration. 
 */

@Schema(name = "EndpointIPAMConfig", description = "EndpointIPAMConfig represents an endpoint's IPAM configuration. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class EndpointIPAMConfig {

  private String ipv4Address;

  private String ipv6Address;

  @Valid
  private List<String> linkLocalIPs;

  public EndpointIPAMConfig ipv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }

  /**
   * Get ipv4Address
   * @return ipv4Address
  */
  
  @Schema(name = "IPv4Address", example = "172.20.30.33", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IPv4Address")
  public String getIpv4Address() {
    return ipv4Address;
  }

  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  public EndpointIPAMConfig ipv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

  /**
   * Get ipv6Address
   * @return ipv6Address
  */
  
  @Schema(name = "IPv6Address", example = "2001:db8:abcd::3033", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IPv6Address")
  public String getIpv6Address() {
    return ipv6Address;
  }

  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }

  public EndpointIPAMConfig linkLocalIPs(List<String> linkLocalIPs) {
    this.linkLocalIPs = linkLocalIPs;
    return this;
  }

  public EndpointIPAMConfig addLinkLocalIPsItem(String linkLocalIPsItem) {
    if (this.linkLocalIPs == null) {
      this.linkLocalIPs = new ArrayList<>();
    }
    this.linkLocalIPs.add(linkLocalIPsItem);
    return this;
  }

  /**
   * Get linkLocalIPs
   * @return linkLocalIPs
  */
  
  @Schema(name = "LinkLocalIPs", example = "[169.254.34.68, fe80::3468]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LinkLocalIPs")
  public List<String> getLinkLocalIPs() {
    return linkLocalIPs;
  }

  public void setLinkLocalIPs(List<String> linkLocalIPs) {
    this.linkLocalIPs = linkLocalIPs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointIPAMConfig endpointIPAMConfig = (EndpointIPAMConfig) o;
    return Objects.equals(this.ipv4Address, endpointIPAMConfig.ipv4Address) &&
        Objects.equals(this.ipv6Address, endpointIPAMConfig.ipv6Address) &&
        Objects.equals(this.linkLocalIPs, endpointIPAMConfig.linkLocalIPs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Address, ipv6Address, linkLocalIPs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointIPAMConfig {\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
    sb.append("    linkLocalIPs: ").append(toIndentedString(linkLocalIPs)).append("\n");
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

