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
 * SystemInfoDefaultAddressPoolsInner
 */

@JsonTypeName("SystemInfo_DefaultAddressPools_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SystemInfoDefaultAddressPoolsInner {

  private String base;

  private Integer size;

  public SystemInfoDefaultAddressPoolsInner base(String base) {
    this.base = base;
    return this;
  }

  /**
   * The network address in CIDR format
   * @return base
  */
  
  @Schema(name = "Base", example = "10.10.0.0/16", description = "The network address in CIDR format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Base")
  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public SystemInfoDefaultAddressPoolsInner size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The network pool size
   * @return size
  */
  
  @Schema(name = "Size", example = "24", description = "The network pool size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfoDefaultAddressPoolsInner systemInfoDefaultAddressPoolsInner = (SystemInfoDefaultAddressPoolsInner) o;
    return Objects.equals(this.base, systemInfoDefaultAddressPoolsInner.base) &&
        Objects.equals(this.size, systemInfoDefaultAddressPoolsInner.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfoDefaultAddressPoolsInner {\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

