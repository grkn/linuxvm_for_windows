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
 * The logging configuration for this container
 */

@Schema(name = "HostConfig_allOf_LogConfig", description = "The logging configuration for this container")
@JsonTypeName("HostConfig_allOf_LogConfig")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class HostConfigAllOfLogConfig {

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    JSON_FILE("json-file"),
    
    SYSLOG("syslog"),
    
    JOURNALD("journald"),
    
    GELF("gelf"),
    
    FLUENTD("fluentd"),
    
    AWSLOGS("awslogs"),
    
    SPLUNK("splunk"),
    
    ETWLOGS("etwlogs"),
    
    NONE("none");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  @Valid
  private Map<String, String> config = new HashMap<>();

  public HostConfigAllOfLogConfig type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public HostConfigAllOfLogConfig config(Map<String, String> config) {
    this.config = config;
    return this;
  }

  public HostConfigAllOfLogConfig putConfigItem(String key, String configItem) {
    if (this.config == null) {
      this.config = new HashMap<>();
    }
    this.config.put(key, configItem);
    return this;
  }

  /**
   * Get config
   * @return config
  */
  
  @Schema(name = "Config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Config")
  public Map<String, String> getConfig() {
    return config;
  }

  public void setConfig(Map<String, String> config) {
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
    HostConfigAllOfLogConfig hostConfigAllOfLogConfig = (HostConfigAllOfLogConfig) o;
    return Objects.equals(this.type, hostConfigAllOfLogConfig.type) &&
        Objects.equals(this.config, hostConfigAllOfLogConfig.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostConfigAllOfLogConfig {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

