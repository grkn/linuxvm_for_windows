package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.GenericResourcesInnerDiscreteResourceSpec;
import com.tgf.vm.model.GenericResourcesInnerNamedResourceSpec;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GenericResourcesInner
 */

@JsonTypeName("GenericResources_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class GenericResourcesInner {

  private GenericResourcesInnerNamedResourceSpec namedResourceSpec;

  private GenericResourcesInnerDiscreteResourceSpec discreteResourceSpec;

  public GenericResourcesInner namedResourceSpec(GenericResourcesInnerNamedResourceSpec namedResourceSpec) {
    this.namedResourceSpec = namedResourceSpec;
    return this;
  }

  /**
   * Get namedResourceSpec
   * @return namedResourceSpec
  */
  @Valid 
  @Schema(name = "NamedResourceSpec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NamedResourceSpec")
  public GenericResourcesInnerNamedResourceSpec getNamedResourceSpec() {
    return namedResourceSpec;
  }

  public void setNamedResourceSpec(GenericResourcesInnerNamedResourceSpec namedResourceSpec) {
    this.namedResourceSpec = namedResourceSpec;
  }

  public GenericResourcesInner discreteResourceSpec(GenericResourcesInnerDiscreteResourceSpec discreteResourceSpec) {
    this.discreteResourceSpec = discreteResourceSpec;
    return this;
  }

  /**
   * Get discreteResourceSpec
   * @return discreteResourceSpec
  */
  @Valid 
  @Schema(name = "DiscreteResourceSpec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DiscreteResourceSpec")
  public GenericResourcesInnerDiscreteResourceSpec getDiscreteResourceSpec() {
    return discreteResourceSpec;
  }

  public void setDiscreteResourceSpec(GenericResourcesInnerDiscreteResourceSpec discreteResourceSpec) {
    this.discreteResourceSpec = discreteResourceSpec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericResourcesInner genericResourcesInner = (GenericResourcesInner) o;
    return Objects.equals(this.namedResourceSpec, genericResourcesInner.namedResourceSpec) &&
        Objects.equals(this.discreteResourceSpec, genericResourcesInner.discreteResourceSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namedResourceSpec, discreteResourceSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericResourcesInner {\n");
    sb.append("    namedResourceSpec: ").append(toIndentedString(namedResourceSpec)).append("\n");
    sb.append("    discreteResourceSpec: ").append(toIndentedString(discreteResourceSpec)).append("\n");
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

