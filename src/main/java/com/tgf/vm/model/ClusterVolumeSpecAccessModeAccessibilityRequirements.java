package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
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
 * Requirements for the accessible topology of the volume. These fields are optional. For an in-depth description of what these fields mean, see the CSI specification. 
 */

@Schema(name = "ClusterVolumeSpec_AccessMode_AccessibilityRequirements", description = "Requirements for the accessible topology of the volume. These fields are optional. For an in-depth description of what these fields mean, see the CSI specification. ")
@JsonTypeName("ClusterVolumeSpec_AccessMode_AccessibilityRequirements")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ClusterVolumeSpecAccessModeAccessibilityRequirements {

  @Valid
  private List<Map<String, String>> requisite;

  @Valid
  private List<Map<String, String>> preferred;

  public ClusterVolumeSpecAccessModeAccessibilityRequirements requisite(List<Map<String, String>> requisite) {
    this.requisite = requisite;
    return this;
  }

  public ClusterVolumeSpecAccessModeAccessibilityRequirements addRequisiteItem(Map<String, String> requisiteItem) {
    if (this.requisite == null) {
      this.requisite = new ArrayList<>();
    }
    this.requisite.add(requisiteItem);
    return this;
  }

  /**
   * A list of required topologies, at least one of which the volume must be accessible from. 
   * @return requisite
  */
  @Valid 
  @Schema(name = "Requisite", description = "A list of required topologies, at least one of which the volume must be accessible from. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Requisite")
  public List<Map<String, String>> getRequisite() {
    return requisite;
  }

  public void setRequisite(List<Map<String, String>> requisite) {
    this.requisite = requisite;
  }

  public ClusterVolumeSpecAccessModeAccessibilityRequirements preferred(List<Map<String, String>> preferred) {
    this.preferred = preferred;
    return this;
  }

  public ClusterVolumeSpecAccessModeAccessibilityRequirements addPreferredItem(Map<String, String> preferredItem) {
    if (this.preferred == null) {
      this.preferred = new ArrayList<>();
    }
    this.preferred.add(preferredItem);
    return this;
  }

  /**
   * A list of topologies that the volume should attempt to be provisioned in. 
   * @return preferred
  */
  @Valid 
  @Schema(name = "Preferred", description = "A list of topologies that the volume should attempt to be provisioned in. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Preferred")
  public List<Map<String, String>> getPreferred() {
    return preferred;
  }

  public void setPreferred(List<Map<String, String>> preferred) {
    this.preferred = preferred;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterVolumeSpecAccessModeAccessibilityRequirements clusterVolumeSpecAccessModeAccessibilityRequirements = (ClusterVolumeSpecAccessModeAccessibilityRequirements) o;
    return Objects.equals(this.requisite, clusterVolumeSpecAccessModeAccessibilityRequirements.requisite) &&
        Objects.equals(this.preferred, clusterVolumeSpecAccessModeAccessibilityRequirements.preferred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requisite, preferred);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterVolumeSpecAccessModeAccessibilityRequirements {\n");
    sb.append("    requisite: ").append(toIndentedString(requisite)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
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

