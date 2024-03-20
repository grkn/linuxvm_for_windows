package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.OCIDescriptor;
import com.tgf.vm.model.OCIPlatform;
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
 * Describes the result obtained from contacting the registry to retrieve image metadata. 
 */

@Schema(name = "DistributionInspect", description = "Describes the result obtained from contacting the registry to retrieve image metadata. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class DistributionInspect {

  private OCIDescriptor descriptor;

  @Valid
  private List<@Valid OCIPlatform> platforms = new ArrayList<>();

  public DistributionInspect() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DistributionInspect(OCIDescriptor descriptor, List<@Valid OCIPlatform> platforms) {
    this.descriptor = descriptor;
    this.platforms = platforms;
  }

  public DistributionInspect descriptor(OCIDescriptor descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Get descriptor
   * @return descriptor
  */
  @NotNull @Valid 
  @Schema(name = "Descriptor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Descriptor")
  public OCIDescriptor getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(OCIDescriptor descriptor) {
    this.descriptor = descriptor;
  }

  public DistributionInspect platforms(List<@Valid OCIPlatform> platforms) {
    this.platforms = platforms;
    return this;
  }

  public DistributionInspect addPlatformsItem(OCIPlatform platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

  /**
   * An array containing all platforms supported by the image. 
   * @return platforms
  */
  @NotNull @Valid 
  @Schema(name = "Platforms", description = "An array containing all platforms supported by the image. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Platforms")
  public List<@Valid OCIPlatform> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<@Valid OCIPlatform> platforms) {
    this.platforms = platforms;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionInspect distributionInspect = (DistributionInspect) o;
    return Objects.equals(this.descriptor, distributionInspect.descriptor) &&
        Objects.equals(this.platforms, distributionInspect.platforms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptor, platforms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionInspect {\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
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

