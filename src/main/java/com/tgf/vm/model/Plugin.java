package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.PluginConfig;
import com.tgf.vm.model.PluginSettings;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A plugin for the Engine API
 */

@Schema(name = "Plugin", description = "A plugin for the Engine API")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class Plugin {

  private String id;

  private String name;

  private Boolean enabled;

  private PluginSettings settings;

  private String pluginReference;

  private PluginConfig config;

  public Plugin() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Plugin(String name, Boolean enabled, PluginSettings settings, PluginConfig config) {
    this.name = name;
    this.enabled = enabled;
    this.settings = settings;
    this.config = config;
  }

  public Plugin id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "Id", example = "5724e2c8652da337ab2eedd19fc6fc0ec908e4bd907c7421bf6a8dfc70c4c078", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Plugin name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "Name", example = "tiborvass/sample-volume-plugin", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Plugin enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * True if the plugin is running. False if the plugin is not running, only installed.
   * @return enabled
  */
  @NotNull 
  @Schema(name = "Enabled", example = "true", description = "True if the plugin is running. False if the plugin is not running, only installed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Plugin settings(PluginSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
  */
  @NotNull @Valid 
  @Schema(name = "Settings", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Settings")
  public PluginSettings getSettings() {
    return settings;
  }

  public void setSettings(PluginSettings settings) {
    this.settings = settings;
  }

  public Plugin pluginReference(String pluginReference) {
    this.pluginReference = pluginReference;
    return this;
  }

  /**
   * plugin remote reference used to push/pull the plugin
   * @return pluginReference
  */
  
  @Schema(name = "PluginReference", example = "localhost:5000/tiborvass/sample-volume-plugin:latest", description = "plugin remote reference used to push/pull the plugin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PluginReference")
  public String getPluginReference() {
    return pluginReference;
  }

  public void setPluginReference(String pluginReference) {
    this.pluginReference = pluginReference;
  }

  public Plugin config(PluginConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
  */
  @NotNull @Valid 
  @Schema(name = "Config", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Config")
  public PluginConfig getConfig() {
    return config;
  }

  public void setConfig(PluginConfig config) {
    this.config = config;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plugin plugin = (Plugin) o;
    return Objects.equals(this.id, plugin.id) &&
        Objects.equals(this.name, plugin.name) &&
        Objects.equals(this.enabled, plugin.enabled) &&
        Objects.equals(this.settings, plugin.settings) &&
        Objects.equals(this.pluginReference, plugin.pluginReference) &&
        Objects.equals(this.config, plugin.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, enabled, settings, pluginReference, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plugin {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    pluginReference: ").append(toIndentedString(pluginReference)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

