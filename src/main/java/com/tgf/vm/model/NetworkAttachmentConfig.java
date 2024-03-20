package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Specifies how a service should be attached to a particular network. 
 */

@Schema(name = "NetworkAttachmentConfig", description = "Specifies how a service should be attached to a particular network. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class NetworkAttachmentConfig {

  private String target;

  @Valid
  private List<String> aliases;

  @Valid
  private Map<String, String> driverOpts = new HashMap<>();

  public NetworkAttachmentConfig target(String target) {
    this.target = target;
    return this;
  }

  /**
   * The target network for attachment. Must be a network name or ID. 
   * @return target
  */
  
  @Schema(name = "Target", description = "The target network for attachment. Must be a network name or ID. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Target")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public NetworkAttachmentConfig aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public NetworkAttachmentConfig addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

  /**
   * Discoverable alternate names for the service on this network. 
   * @return aliases
  */
  
  @Schema(name = "Aliases", description = "Discoverable alternate names for the service on this network. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Aliases")
  public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }

  public NetworkAttachmentConfig driverOpts(Map<String, String> driverOpts) {
    this.driverOpts = driverOpts;
    return this;
  }

  public NetworkAttachmentConfig putDriverOptsItem(String key, String driverOptsItem) {
    if (this.driverOpts == null) {
      this.driverOpts = new HashMap<>();
    }
    this.driverOpts.put(key, driverOptsItem);
    return this;
  }

  /**
   * Driver attachment options for the network target. 
   * @return driverOpts
  */
  
  @Schema(name = "DriverOpts", description = "Driver attachment options for the network target. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DriverOpts")
  public Map<String, String> getDriverOpts() {
    return driverOpts;
  }

  public void setDriverOpts(Map<String, String> driverOpts) {
    this.driverOpts = driverOpts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkAttachmentConfig networkAttachmentConfig = (NetworkAttachmentConfig) o;
    return Objects.equals(this.target, networkAttachmentConfig.target) &&
        Objects.equals(this.aliases, networkAttachmentConfig.aliases) &&
        Objects.equals(this.driverOpts, networkAttachmentConfig.driverOpts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, aliases, driverOpts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkAttachmentConfig {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    driverOpts: ").append(toIndentedString(driverOpts)).append("\n");
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

