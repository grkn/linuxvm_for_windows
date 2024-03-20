package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ContainerSummaryHostConfig
 */

@JsonTypeName("ContainerSummary_HostConfig")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ContainerSummaryHostConfig {

  private String networkMode;

  public ContainerSummaryHostConfig networkMode(String networkMode) {
    this.networkMode = networkMode;
    return this;
  }

  /**
   * Get networkMode
   * @return networkMode
  */
  
  @Schema(name = "NetworkMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NetworkMode")
  public String getNetworkMode() {
    return networkMode;
  }

  public void setNetworkMode(String networkMode) {
    this.networkMode = networkMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerSummaryHostConfig containerSummaryHostConfig = (ContainerSummaryHostConfig) o;
    return Objects.equals(this.networkMode, containerSummaryHostConfig.networkMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerSummaryHostConfig {\n");
    sb.append("    networkMode: ").append(toIndentedString(networkMode)).append("\n");
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

