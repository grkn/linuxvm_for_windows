package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tgf.vm.model.PluginInterfaceType;
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
 * The interface between Docker and the plugin
 */

@Schema(name = "Plugin_Config_Interface", description = "The interface between Docker and the plugin")
@JsonTypeName("Plugin_Config_Interface")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PluginConfigInterface {

  @Valid
  private List<@Valid PluginInterfaceType> types = new ArrayList<>();

  private String socket;

  /**
   * Protocol to use for clients connecting to the plugin.
   */
  public enum ProtocolSchemeEnum {
    EMPTY(""),
    
    MOBY_PLUGINS_HTTP_V1("moby.plugins.http/v1");

    private String value;

    ProtocolSchemeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProtocolSchemeEnum fromValue(String value) {
      for (ProtocolSchemeEnum b : ProtocolSchemeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProtocolSchemeEnum protocolScheme;

  public PluginConfigInterface() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PluginConfigInterface(List<@Valid PluginInterfaceType> types, String socket) {
    this.types = types;
    this.socket = socket;
  }

  public PluginConfigInterface types(List<@Valid PluginInterfaceType> types) {
    this.types = types;
    return this;
  }

  public PluginConfigInterface addTypesItem(PluginInterfaceType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
  */
  @NotNull @Valid 
  @Schema(name = "Types", example = "[docker.volumedriver/1.0]", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Types")
  public List<@Valid PluginInterfaceType> getTypes() {
    return types;
  }

  public void setTypes(List<@Valid PluginInterfaceType> types) {
    this.types = types;
  }

  public PluginConfigInterface socket(String socket) {
    this.socket = socket;
    return this;
  }

  /**
   * Get socket
   * @return socket
  */
  @NotNull 
  @Schema(name = "Socket", example = "plugins.sock", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Socket")
  public String getSocket() {
    return socket;
  }

  public void setSocket(String socket) {
    this.socket = socket;
  }

  public PluginConfigInterface protocolScheme(ProtocolSchemeEnum protocolScheme) {
    this.protocolScheme = protocolScheme;
    return this;
  }

  /**
   * Protocol to use for clients connecting to the plugin.
   * @return protocolScheme
  */
  
  @Schema(name = "ProtocolScheme", example = "some.protocol/v1.0", description = "Protocol to use for clients connecting to the plugin.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProtocolScheme")
  public ProtocolSchemeEnum getProtocolScheme() {
    return protocolScheme;
  }

  public void setProtocolScheme(ProtocolSchemeEnum protocolScheme) {
    this.protocolScheme = protocolScheme;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfigInterface pluginConfigInterface = (PluginConfigInterface) o;
    return Objects.equals(this.types, pluginConfigInterface.types) &&
        Objects.equals(this.socket, pluginConfigInterface.socket) &&
        Objects.equals(this.protocolScheme, pluginConfigInterface.protocolScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, socket, protocolScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfigInterface {\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    socket: ").append(toIndentedString(socket)).append("\n");
    sb.append("    protocolScheme: ").append(toIndentedString(protocolScheme)).append("\n");
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

