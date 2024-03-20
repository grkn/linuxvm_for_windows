package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.ClusterVolumeSpec;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Volume configuration
 */

@Schema(name = "VolumeUpdate_request", description = "Volume configuration")
@JsonTypeName("VolumeUpdate_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class VolumeUpdateRequest {

  private ClusterVolumeSpec spec;

  public VolumeUpdateRequest spec(ClusterVolumeSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
  @Valid 
  @Schema(name = "Spec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Spec")
  public ClusterVolumeSpec getSpec() {
    return spec;
  }

  public void setSpec(ClusterVolumeSpec spec) {
    this.spec = spec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeUpdateRequest volumeUpdateRequest = (VolumeUpdateRequest) o;
    return Objects.equals(this.spec, volumeUpdateRequest.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeUpdateRequest {\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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

