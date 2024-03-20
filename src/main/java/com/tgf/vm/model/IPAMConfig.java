package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * IPAMConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class IPAMConfig {

  private String subnet;

  private String ipRange;

  private String gateway;

  @Valid
  private Map<String, String> auxiliaryAddresses = new HashMap<>();

  public IPAMConfig subnet(String subnet) {
    this.subnet = subnet;
    return this;
  }

  /**
   * Get subnet
   * @return subnet
  */
  
  @Schema(name = "Subnet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Subnet")
  public String getSubnet() {
    return subnet;
  }

  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }

  public IPAMConfig ipRange(String ipRange) {
    this.ipRange = ipRange;
    return this;
  }

  /**
   * Get ipRange
   * @return ipRange
  */
  
  @Schema(name = "IPRange", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IPRange")
  public String getIpRange() {
    return ipRange;
  }

  public void setIpRange(String ipRange) {
    this.ipRange = ipRange;
  }

  public IPAMConfig gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * Get gateway
   * @return gateway
  */
  
  @Schema(name = "Gateway", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Gateway")
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public IPAMConfig auxiliaryAddresses(Map<String, String> auxiliaryAddresses) {
    this.auxiliaryAddresses = auxiliaryAddresses;
    return this;
  }

  public IPAMConfig putAuxiliaryAddressesItem(String key, String auxiliaryAddressesItem) {
    if (this.auxiliaryAddresses == null) {
      this.auxiliaryAddresses = new HashMap<>();
    }
    this.auxiliaryAddresses.put(key, auxiliaryAddressesItem);
    return this;
  }

  /**
   * Get auxiliaryAddresses
   * @return auxiliaryAddresses
  */
  
  @Schema(name = "AuxiliaryAddresses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AuxiliaryAddresses")
  public Map<String, String> getAuxiliaryAddresses() {
    return auxiliaryAddresses;
  }

  public void setAuxiliaryAddresses(Map<String, String> auxiliaryAddresses) {
    this.auxiliaryAddresses = auxiliaryAddresses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAMConfig ipAMConfig = (IPAMConfig) o;
    return Objects.equals(this.subnet, ipAMConfig.subnet) &&
        Objects.equals(this.ipRange, ipAMConfig.ipRange) &&
        Objects.equals(this.gateway, ipAMConfig.gateway) &&
        Objects.equals(this.auxiliaryAddresses, ipAMConfig.auxiliaryAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnet, ipRange, gateway, auxiliaryAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAMConfig {\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
    sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    auxiliaryAddresses: ").append(toIndentedString(auxiliaryAddresses)).append("\n");
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

