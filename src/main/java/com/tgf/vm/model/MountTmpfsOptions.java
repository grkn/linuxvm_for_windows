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
 * Optional configuration for the &#x60;tmpfs&#x60; type.
 */

@Schema(name = "Mount_TmpfsOptions", description = "Optional configuration for the `tmpfs` type.")
@JsonTypeName("Mount_TmpfsOptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class MountTmpfsOptions {

  private Long sizeBytes;

  private Integer mode;

  public MountTmpfsOptions sizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * The size for the tmpfs mount in bytes.
   * @return sizeBytes
  */
  
  @Schema(name = "SizeBytes", description = "The size for the tmpfs mount in bytes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SizeBytes")
  public Long getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  public MountTmpfsOptions mode(Integer mode) {
    this.mode = mode;
    return this;
  }

  /**
   * The permission mode for the tmpfs mount in an integer.
   * @return mode
  */
  
  @Schema(name = "Mode", description = "The permission mode for the tmpfs mount in an integer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mode")
  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountTmpfsOptions mountTmpfsOptions = (MountTmpfsOptions) o;
    return Objects.equals(this.sizeBytes, mountTmpfsOptions.sizeBytes) &&
        Objects.equals(this.mode, mountTmpfsOptions.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sizeBytes, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountTmpfsOptions {\n");
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

