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
 * PluginInterfaceType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PluginInterfaceType {

  private String prefix;

  private String capability;

  private String version;

  public PluginInterfaceType() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PluginInterfaceType(String prefix, String capability, String version) {
    this.prefix = prefix;
    this.capability = capability;
    this.version = version;
  }

  public PluginInterfaceType prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  /**
   * Get prefix
   * @return prefix
  */
  @NotNull 
  @Schema(name = "Prefix", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Prefix")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public PluginInterfaceType capability(String capability) {
    this.capability = capability;
    return this;
  }

  /**
   * Get capability
   * @return capability
  */
  @NotNull 
  @Schema(name = "Capability", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Capability")
  public String getCapability() {
    return capability;
  }

  public void setCapability(String capability) {
    this.capability = capability;
  }

  public PluginInterfaceType version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @NotNull 
  @Schema(name = "Version", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginInterfaceType pluginInterfaceType = (PluginInterfaceType) o;
    return Objects.equals(this.prefix, pluginInterfaceType.prefix) &&
        Objects.equals(this.capability, pluginInterfaceType.capability) &&
        Objects.equals(this.version, pluginInterfaceType.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, capability, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginInterfaceType {\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

