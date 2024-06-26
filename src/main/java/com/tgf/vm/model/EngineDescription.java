package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.EngineDescriptionPluginsInner;
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
 * EngineDescription provides information about an engine.
 */

@Schema(name = "EngineDescription", description = "EngineDescription provides information about an engine.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class EngineDescription {

  private String engineVersion;

  @Valid
  private Map<String, String> labels = new HashMap<>();

  @Valid
  private List<@Valid EngineDescriptionPluginsInner> plugins;

  public EngineDescription engineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
    return this;
  }

  /**
   * Get engineVersion
   * @return engineVersion
  */
  
  @Schema(name = "EngineVersion", example = "17.06.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EngineVersion")
  public String getEngineVersion() {
    return engineVersion;
  }

  public void setEngineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
  }

  public EngineDescription labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public EngineDescription putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
  
  @Schema(name = "Labels", example = "{\"foo\":\"bar\"}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public EngineDescription plugins(List<@Valid EngineDescriptionPluginsInner> plugins) {
    this.plugins = plugins;
    return this;
  }

  public EngineDescription addPluginsItem(EngineDescriptionPluginsInner pluginsItem) {
    if (this.plugins == null) {
      this.plugins = new ArrayList<>();
    }
    this.plugins.add(pluginsItem);
    return this;
  }

  /**
   * Get plugins
   * @return plugins
  */
  @Valid 
  @Schema(name = "Plugins", example = "[{Type=Log, Name=awslogs}, {Type=Log, Name=fluentd}, {Type=Log, Name=gcplogs}, {Type=Log, Name=gelf}, {Type=Log, Name=journald}, {Type=Log, Name=json-file}, {Type=Log, Name=splunk}, {Type=Log, Name=syslog}, {Type=Network, Name=bridge}, {Type=Network, Name=host}, {Type=Network, Name=ipvlan}, {Type=Network, Name=macvlan}, {Type=Network, Name=null}, {Type=Network, Name=overlay}, {Type=Volume, Name=local}, {Type=Volume, Name=localhost:5000/vieux/sshfs:latest}, {Type=Volume, Name=vieux/sshfs:latest}]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Plugins")
  public List<@Valid EngineDescriptionPluginsInner> getPlugins() {
    return plugins;
  }

  public void setPlugins(List<@Valid EngineDescriptionPluginsInner> plugins) {
    this.plugins = plugins;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngineDescription engineDescription = (EngineDescription) o;
    return Objects.equals(this.engineVersion, engineDescription.engineVersion) &&
        Objects.equals(this.labels, engineDescription.labels) &&
        Objects.equals(this.plugins, engineDescription.plugins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineVersion, labels, plugins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngineDescription {\n");
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
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

