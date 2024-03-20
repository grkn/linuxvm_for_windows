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
 * Describes the platform which the image in the manifest runs on, as defined in the [OCI Image Index Specification](https://github.com/opencontainers/image-spec/blob/v1.0.1/image-index.md). 
 */

@Schema(name = "OCIPlatform", description = "Describes the platform which the image in the manifest runs on, as defined in the [OCI Image Index Specification](https://github.com/opencontainers/image-spec/blob/v1.0.1/image-index.md). ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class OCIPlatform {

  private String architecture;

  private String os;

  private String osVersion;

  @Valid
  private List<String> osFeatures;

  private String variant;

  public OCIPlatform architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * The CPU architecture, for example `amd64` or `ppc64`. 
   * @return architecture
  */
  
  @Schema(name = "architecture", example = "arm", description = "The CPU architecture, for example `amd64` or `ppc64`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("architecture")
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public OCIPlatform os(String os) {
    this.os = os;
    return this;
  }

  /**
   * The operating system, for example `linux` or `windows`. 
   * @return os
  */
  
  @Schema(name = "os", example = "windows", description = "The operating system, for example `linux` or `windows`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("os")
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public OCIPlatform osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Optional field specifying the operating system version, for example on Windows `10.0.19041.1165`. 
   * @return osVersion
  */
  
  @Schema(name = "os.version", example = "10.0.19041.1165", description = "Optional field specifying the operating system version, for example on Windows `10.0.19041.1165`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("os.version")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public OCIPlatform osFeatures(List<String> osFeatures) {
    this.osFeatures = osFeatures;
    return this;
  }

  public OCIPlatform addOsFeaturesItem(String osFeaturesItem) {
    if (this.osFeatures == null) {
      this.osFeatures = new ArrayList<>();
    }
    this.osFeatures.add(osFeaturesItem);
    return this;
  }

  /**
   * Optional field specifying an array of strings, each listing a required OS feature (for example on Windows `win32k`). 
   * @return osFeatures
  */
  
  @Schema(name = "os.features", example = "[win32k]", description = "Optional field specifying an array of strings, each listing a required OS feature (for example on Windows `win32k`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("os.features")
  public List<String> getOsFeatures() {
    return osFeatures;
  }

  public void setOsFeatures(List<String> osFeatures) {
    this.osFeatures = osFeatures;
  }

  public OCIPlatform variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * Optional field specifying a variant of the CPU, for example `v7` to specify ARMv7 when architecture is `arm`. 
   * @return variant
  */
  
  @Schema(name = "variant", example = "v7", description = "Optional field specifying a variant of the CPU, for example `v7` to specify ARMv7 when architecture is `arm`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variant")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCIPlatform ocIPlatform = (OCIPlatform) o;
    return Objects.equals(this.architecture, ocIPlatform.architecture) &&
        Objects.equals(this.os, ocIPlatform.os) &&
        Objects.equals(this.osVersion, ocIPlatform.osVersion) &&
        Objects.equals(this.osFeatures, ocIPlatform.osFeatures) &&
        Objects.equals(this.variant, ocIPlatform.variant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, os, osVersion, osFeatures, variant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCIPlatform {\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    osFeatures: ").append(toIndentedString(osFeatures)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
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

