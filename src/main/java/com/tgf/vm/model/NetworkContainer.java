package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NetworkContainer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class NetworkContainer {

  private String name;

  private String endpointID;

  private String macAddress;

  private String ipv4Address;

  private String ipv6Address;

  public NetworkContainer name(String name) {
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

  public NetworkContainer endpointID(String endpointID) {
    this.endpointID = endpointID;
    return this;
  }

  /**
   * Get endpointID
   * @return endpointID
  */
  
  @Schema(name = "EndpointID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndpointID")
  public String getEndpointID() {
    return endpointID;
  }

  public void setEndpointID(String endpointID) {
    this.endpointID = endpointID;
  }

  public NetworkContainer macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * Get macAddress
   * @return macAddress
  */
  
  @Schema(name = "MacAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MacAddress")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public NetworkContainer ipv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }

  /**
   * Get ipv4Address
   * @return ipv4Address
  */
  
  @Schema(name = "IPv4Address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IPv4Address")
  public String getIpv4Address() {
    return ipv4Address;
  }

  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  public NetworkContainer ipv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

  /**
   * Get ipv6Address
   * @return ipv6Address
  */
  
  @Schema(name = "IPv6Address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IPv6Address")
  public String getIpv6Address() {
    return ipv6Address;
  }

  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkContainer networkContainer = (NetworkContainer) o;
    return Objects.equals(this.name, networkContainer.name) &&
        Objects.equals(this.endpointID, networkContainer.endpointID) &&
        Objects.equals(this.macAddress, networkContainer.macAddress) &&
        Objects.equals(this.ipv4Address, networkContainer.ipv4Address) &&
        Objects.equals(this.ipv6Address, networkContainer.ipv6Address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, endpointID, macAddress, ipv4Address, ipv6Address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkContainer {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endpointID: ").append(toIndentedString(endpointID)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
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

