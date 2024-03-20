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
 * Address represents an IPv4 or IPv6 IP address.
 */

@Schema(name = "Address", description = "Address represents an IPv4 or IPv6 IP address.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class Address {

  private String addr;

  private Integer prefixLen;

  public Address addr(String addr) {
    this.addr = addr;
    return this;
  }

  /**
   * IP address.
   * @return addr
  */
  
  @Schema(name = "Addr", description = "IP address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Addr")
  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public Address prefixLen(Integer prefixLen) {
    this.prefixLen = prefixLen;
    return this;
  }

  /**
   * Mask length of the IP address.
   * @return prefixLen
  */
  
  @Schema(name = "PrefixLen", description = "Mask length of the IP address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrefixLen")
  public Integer getPrefixLen() {
    return prefixLen;
  }

  public void setPrefixLen(Integer prefixLen) {
    this.prefixLen = prefixLen;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addr, address.addr) &&
        Objects.equals(this.prefixLen, address.prefixLen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addr, prefixLen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
    sb.append("    prefixLen: ").append(toIndentedString(prefixLen)).append("\n");
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

