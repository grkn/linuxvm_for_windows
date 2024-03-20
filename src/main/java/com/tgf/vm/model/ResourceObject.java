package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.GenericResourcesInner;
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
 * An object describing the resources which can be advertised by a node and requested by a task. 
 */

@Schema(name = "ResourceObject", description = "An object describing the resources which can be advertised by a node and requested by a task. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ResourceObject {

  private Long nanoCPUs;

  private Long memoryBytes;

  @Valid
  private List<@Valid GenericResourcesInner> genericResources;

  public ResourceObject nanoCPUs(Long nanoCPUs) {
    this.nanoCPUs = nanoCPUs;
    return this;
  }

  /**
   * Get nanoCPUs
   * @return nanoCPUs
  */
  
  @Schema(name = "NanoCPUs", example = "4000000000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NanoCPUs")
  public Long getNanoCPUs() {
    return nanoCPUs;
  }

  public void setNanoCPUs(Long nanoCPUs) {
    this.nanoCPUs = nanoCPUs;
  }

  public ResourceObject memoryBytes(Long memoryBytes) {
    this.memoryBytes = memoryBytes;
    return this;
  }

  /**
   * Get memoryBytes
   * @return memoryBytes
  */
  
  @Schema(name = "MemoryBytes", example = "8272408576", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MemoryBytes")
  public Long getMemoryBytes() {
    return memoryBytes;
  }

  public void setMemoryBytes(Long memoryBytes) {
    this.memoryBytes = memoryBytes;
  }

  public ResourceObject genericResources(List<@Valid GenericResourcesInner> genericResources) {
    this.genericResources = genericResources;
    return this;
  }

  public ResourceObject addGenericResourcesItem(GenericResourcesInner genericResourcesItem) {
    if (this.genericResources == null) {
      this.genericResources = new ArrayList<>();
    }
    this.genericResources.add(genericResourcesItem);
    return this;
  }

  /**
   * User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`). 
   * @return genericResources
  */
  @Valid 
  @Schema(name = "GenericResources", example = "[{DiscreteResourceSpec={Kind=SSD, Value=3}}, {NamedResourceSpec={Kind=GPU, Value=UUID1}}, {NamedResourceSpec={Kind=GPU, Value=UUID2}}]", description = "User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GenericResources")
  public List<@Valid GenericResourcesInner> getGenericResources() {
    return genericResources;
  }

  public void setGenericResources(List<@Valid GenericResourcesInner> genericResources) {
    this.genericResources = genericResources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceObject resourceObject = (ResourceObject) o;
    return Objects.equals(this.nanoCPUs, resourceObject.nanoCPUs) &&
        Objects.equals(this.memoryBytes, resourceObject.memoryBytes) &&
        Objects.equals(this.genericResources, resourceObject.genericResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nanoCPUs, memoryBytes, genericResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceObject {\n");
    sb.append("    nanoCPUs: ").append(toIndentedString(nanoCPUs)).append("\n");
    sb.append("    memoryBytes: ").append(toIndentedString(memoryBytes)).append("\n");
    sb.append("    genericResources: ").append(toIndentedString(genericResources)).append("\n");
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

