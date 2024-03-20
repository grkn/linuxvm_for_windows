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
 * Available plugins per type.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: Only unmanaged (V1) plugins are included in this list. &gt; V1 plugins are \&quot;lazily\&quot; loaded, and are not returned in this list &gt; if there is no resource using the plugin. 
 */

@Schema(name = "PluginsInfo", description = "Available plugins per type.  <p><br /></p>  > **Note**: Only unmanaged (V1) plugins are included in this list. > V1 plugins are \"lazily\" loaded, and are not returned in this list > if there is no resource using the plugin. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PluginsInfo {

  @Valid
  private List<String> volume;

  @Valid
  private List<String> network;

  @Valid
  private List<String> authorization;

  @Valid
  private List<String> log;

  public PluginsInfo volume(List<String> volume) {
    this.volume = volume;
    return this;
  }

  public PluginsInfo addVolumeItem(String volumeItem) {
    if (this.volume == null) {
      this.volume = new ArrayList<>();
    }
    this.volume.add(volumeItem);
    return this;
  }

  /**
   * Names of available volume-drivers, and network-driver plugins.
   * @return volume
  */
  
  @Schema(name = "Volume", example = "[local]", description = "Names of available volume-drivers, and network-driver plugins.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Volume")
  public List<String> getVolume() {
    return volume;
  }

  public void setVolume(List<String> volume) {
    this.volume = volume;
  }

  public PluginsInfo network(List<String> network) {
    this.network = network;
    return this;
  }

  public PluginsInfo addNetworkItem(String networkItem) {
    if (this.network == null) {
      this.network = new ArrayList<>();
    }
    this.network.add(networkItem);
    return this;
  }

  /**
   * Names of available network-drivers, and network-driver plugins.
   * @return network
  */
  
  @Schema(name = "Network", example = "[bridge, host, ipvlan, macvlan, null, overlay]", description = "Names of available network-drivers, and network-driver plugins.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Network")
  public List<String> getNetwork() {
    return network;
  }

  public void setNetwork(List<String> network) {
    this.network = network;
  }

  public PluginsInfo authorization(List<String> authorization) {
    this.authorization = authorization;
    return this;
  }

  public PluginsInfo addAuthorizationItem(String authorizationItem) {
    if (this.authorization == null) {
      this.authorization = new ArrayList<>();
    }
    this.authorization.add(authorizationItem);
    return this;
  }

  /**
   * Names of available authorization plugins.
   * @return authorization
  */
  
  @Schema(name = "Authorization", example = "[img-authz-plugin, hbm]", description = "Names of available authorization plugins.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Authorization")
  public List<String> getAuthorization() {
    return authorization;
  }

  public void setAuthorization(List<String> authorization) {
    this.authorization = authorization;
  }

  public PluginsInfo log(List<String> log) {
    this.log = log;
    return this;
  }

  public PluginsInfo addLogItem(String logItem) {
    if (this.log == null) {
      this.log = new ArrayList<>();
    }
    this.log.add(logItem);
    return this;
  }

  /**
   * Names of available logging-drivers, and logging-driver plugins.
   * @return log
  */
  
  @Schema(name = "Log", example = "[awslogs, fluentd, gcplogs, gelf, journald, json-file, splunk, syslog]", description = "Names of available logging-drivers, and logging-driver plugins.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Log")
  public List<String> getLog() {
    return log;
  }

  public void setLog(List<String> log) {
    this.log = log;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginsInfo pluginsInfo = (PluginsInfo) o;
    return Objects.equals(this.volume, pluginsInfo.volume) &&
        Objects.equals(this.network, pluginsInfo.network) &&
        Objects.equals(this.authorization, pluginsInfo.authorization) &&
        Objects.equals(this.log, pluginsInfo.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volume, network, authorization, log);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginsInfo {\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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

