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
 * Usage details about the volume. This information is used by the &#x60;GET /system/df&#x60; endpoint, and omitted in other endpoints. 
 */

@Schema(name = "Volume_UsageData", description = "Usage details about the volume. This information is used by the `GET /system/df` endpoint, and omitted in other endpoints. ")
@JsonTypeName("Volume_UsageData")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class VolumeUsageData {

  private Long size = -1l;

  private Long refCount = -1l;

  public VolumeUsageData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VolumeUsageData(Long size, Long refCount) {
    this.size = size;
    this.refCount = refCount;
  }

  public VolumeUsageData size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Amount of disk space used by the volume (in bytes). This information is only available for volumes created with the `\"local\"` volume driver. For volumes created with other volume drivers, this field is set to `-1` (\"not available\") 
   * @return size
  */
  @NotNull 
  @Schema(name = "Size", description = "Amount of disk space used by the volume (in bytes). This information is only available for volumes created with the `\"local\"` volume driver. For volumes created with other volume drivers, this field is set to `-1` (\"not available\") ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public VolumeUsageData refCount(Long refCount) {
    this.refCount = refCount;
    return this;
  }

  /**
   * The number of containers referencing this volume. This field is set to `-1` if the reference-count is not available. 
   * @return refCount
  */
  @NotNull 
  @Schema(name = "RefCount", description = "The number of containers referencing this volume. This field is set to `-1` if the reference-count is not available. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("RefCount")
  public Long getRefCount() {
    return refCount;
  }

  public void setRefCount(Long refCount) {
    this.refCount = refCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeUsageData volumeUsageData = (VolumeUsageData) o;
    return Objects.equals(this.size, volumeUsageData.size) &&
        Objects.equals(this.refCount, volumeUsageData.refCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, refCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeUsageData {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    refCount: ").append(toIndentedString(refCount)).append("\n");
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

