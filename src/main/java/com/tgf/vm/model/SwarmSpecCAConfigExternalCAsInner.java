package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SwarmSpecCAConfigExternalCAsInner
 */

@JsonTypeName("SwarmSpec_CAConfig_ExternalCAs_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SwarmSpecCAConfigExternalCAsInner {

  /**
   * Protocol for communication with the external CA (currently only `cfssl` is supported). 
   */
  public enum ProtocolEnum {
    CFSSL("cfssl");

    private String value;

    ProtocolEnum(String value) {
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
    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProtocolEnum protocol = ProtocolEnum.CFSSL;

  private String URL;

  @Valid
  private Map<String, String> options = new HashMap<>();

  private String caCert;

  public SwarmSpecCAConfigExternalCAsInner protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Protocol for communication with the external CA (currently only `cfssl` is supported). 
   * @return protocol
  */
  
  @Schema(name = "Protocol", description = "Protocol for communication with the external CA (currently only `cfssl` is supported). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Protocol")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public SwarmSpecCAConfigExternalCAsInner URL(String URL) {
    this.URL = URL;
    return this;
  }

  /**
   * URL where certificate signing requests should be sent. 
   * @return URL
  */
  
  @Schema(name = "URL", description = "URL where certificate signing requests should be sent. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("URL")
  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public SwarmSpecCAConfigExternalCAsInner options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public SwarmSpecCAConfigExternalCAsInner putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * An object with key/value pairs that are interpreted as protocol-specific options for the external CA driver. 
   * @return options
  */
  
  @Schema(name = "Options", description = "An object with key/value pairs that are interpreted as protocol-specific options for the external CA driver. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Options")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  public SwarmSpecCAConfigExternalCAsInner caCert(String caCert) {
    this.caCert = caCert;
    return this;
  }

  /**
   * The root CA certificate (in PEM format) this external CA uses to issue TLS certificates (assumed to be to the current swarm root CA certificate if not provided). 
   * @return caCert
  */
  
  @Schema(name = "CACert", description = "The root CA certificate (in PEM format) this external CA uses to issue TLS certificates (assumed to be to the current swarm root CA certificate if not provided). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CACert")
  public String getCaCert() {
    return caCert;
  }

  public void setCaCert(String caCert) {
    this.caCert = caCert;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecCAConfigExternalCAsInner swarmSpecCAConfigExternalCAsInner = (SwarmSpecCAConfigExternalCAsInner) o;
    return Objects.equals(this.protocol, swarmSpecCAConfigExternalCAsInner.protocol) &&
        Objects.equals(this.URL, swarmSpecCAConfigExternalCAsInner.URL) &&
        Objects.equals(this.options, swarmSpecCAConfigExternalCAsInner.options) &&
        Objects.equals(this.caCert, swarmSpecCAConfigExternalCAsInner.caCert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, URL, options, caCert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecCAConfigExternalCAsInner {\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    caCert: ").append(toIndentedString(caCert)).append("\n");
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

