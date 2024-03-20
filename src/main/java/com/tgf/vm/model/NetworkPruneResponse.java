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
 * NetworkPruneResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class NetworkPruneResponse {

  @Valid
  private List<String> networksDeleted;

  public NetworkPruneResponse networksDeleted(List<String> networksDeleted) {
    this.networksDeleted = networksDeleted;
    return this;
  }

  public NetworkPruneResponse addNetworksDeletedItem(String networksDeletedItem) {
    if (this.networksDeleted == null) {
      this.networksDeleted = new ArrayList<>();
    }
    this.networksDeleted.add(networksDeletedItem);
    return this;
  }

  /**
   * Networks that were deleted
   * @return networksDeleted
  */
  
  @Schema(name = "NetworksDeleted", description = "Networks that were deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NetworksDeleted")
  public List<String> getNetworksDeleted() {
    return networksDeleted;
  }

  public void setNetworksDeleted(List<String> networksDeleted) {
    this.networksDeleted = networksDeleted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkPruneResponse networkPruneResponse = (NetworkPruneResponse) o;
    return Objects.equals(this.networksDeleted, networkPruneResponse.networksDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networksDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkPruneResponse {\n");
    sb.append("    networksDeleted: ").append(toIndentedString(networksDeleted)).append("\n");
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

