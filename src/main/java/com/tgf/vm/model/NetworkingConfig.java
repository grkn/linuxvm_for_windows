package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.EndpointSettings;
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
 * NetworkingConfig represents the container&#39;s networking configuration for each of its interfaces. It is used for the networking configs specified in the &#x60;docker create&#x60; and &#x60;docker network connect&#x60; commands. 
 */

@Schema(name = "NetworkingConfig", description = "NetworkingConfig represents the container's networking configuration for each of its interfaces. It is used for the networking configs specified in the `docker create` and `docker network connect` commands. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class NetworkingConfig {

  @Valid
  private Map<String, EndpointSettings> endpointsConfig = new HashMap<>();

  public NetworkingConfig endpointsConfig(Map<String, EndpointSettings> endpointsConfig) {
    this.endpointsConfig = endpointsConfig;
    return this;
  }

  public NetworkingConfig putEndpointsConfigItem(String key, EndpointSettings endpointsConfigItem) {
    if (this.endpointsConfig == null) {
      this.endpointsConfig = new HashMap<>();
    }
    this.endpointsConfig.put(key, endpointsConfigItem);
    return this;
  }

  /**
   * A mapping of network name to endpoint configuration for that network. 
   * @return endpointsConfig
  */
  @Valid 
  @Schema(name = "EndpointsConfig", description = "A mapping of network name to endpoint configuration for that network. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndpointsConfig")
  public Map<String, EndpointSettings> getEndpointsConfig() {
    return endpointsConfig;
  }

  public void setEndpointsConfig(Map<String, EndpointSettings> endpointsConfig) {
    this.endpointsConfig = endpointsConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkingConfig networkingConfig = (NetworkingConfig) o;
    return Objects.equals(this.endpointsConfig, networkingConfig.endpointsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointsConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkingConfig {\n");
    sb.append("    endpointsConfig: ").append(toIndentedString(endpointsConfig)).append("\n");
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

