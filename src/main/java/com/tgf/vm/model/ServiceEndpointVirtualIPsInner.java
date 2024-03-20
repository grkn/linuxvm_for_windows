package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ServiceEndpointVirtualIPsInner
 */

@JsonTypeName("Service_Endpoint_VirtualIPs_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ServiceEndpointVirtualIPsInner {

  private String networkID;

  private String addr;

  public ServiceEndpointVirtualIPsInner networkID(String networkID) {
    this.networkID = networkID;
    return this;
  }

  /**
   * Get networkID
   * @return networkID
  */
  
  @Schema(name = "NetworkID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NetworkID")
  public String getNetworkID() {
    return networkID;
  }

  public void setNetworkID(String networkID) {
    this.networkID = networkID;
  }

  public ServiceEndpointVirtualIPsInner addr(String addr) {
    this.addr = addr;
    return this;
  }

  /**
   * Get addr
   * @return addr
  */
  
  @Schema(name = "Addr", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Addr")
  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceEndpointVirtualIPsInner serviceEndpointVirtualIPsInner = (ServiceEndpointVirtualIPsInner) o;
    return Objects.equals(this.networkID, serviceEndpointVirtualIPsInner.networkID) &&
        Objects.equals(this.addr, serviceEndpointVirtualIPsInner.addr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkID, addr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceEndpointVirtualIPsInner {\n");
    sb.append("    networkID: ").append(toIndentedString(networkID)).append("\n");
    sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
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

