package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Optional configuration for the &#x60;bind&#x60; type.
 */

@Schema(name = "Mount_BindOptions", description = "Optional configuration for the `bind` type.")
@JsonTypeName("Mount_BindOptions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class MountBindOptions {

  /**
   * A propagation mode with the value `[r]private`, `[r]shared`, or `[r]slave`.
   */
  public enum PropagationEnum {
    PRIVATE("private"),
    
    RPRIVATE("rprivate"),
    
    SHARED("shared"),
    
    RSHARED("rshared"),
    
    SLAVE("slave"),
    
    RSLAVE("rslave");

    private String value;

    PropagationEnum(String value) {
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
    public static PropagationEnum fromValue(String value) {
      for (PropagationEnum b : PropagationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PropagationEnum propagation;

  private Boolean nonRecursive = false;

  private Boolean createMountpoint = false;

  public MountBindOptions propagation(PropagationEnum propagation) {
    this.propagation = propagation;
    return this;
  }

  /**
   * A propagation mode with the value `[r]private`, `[r]shared`, or `[r]slave`.
   * @return propagation
  */
  
  @Schema(name = "Propagation", description = "A propagation mode with the value `[r]private`, `[r]shared`, or `[r]slave`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Propagation")
  public PropagationEnum getPropagation() {
    return propagation;
  }

  public void setPropagation(PropagationEnum propagation) {
    this.propagation = propagation;
  }

  public MountBindOptions nonRecursive(Boolean nonRecursive) {
    this.nonRecursive = nonRecursive;
    return this;
  }

  /**
   * Disable recursive bind mount.
   * @return nonRecursive
  */
  
  @Schema(name = "NonRecursive", description = "Disable recursive bind mount.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NonRecursive")
  public Boolean getNonRecursive() {
    return nonRecursive;
  }

  public void setNonRecursive(Boolean nonRecursive) {
    this.nonRecursive = nonRecursive;
  }

  public MountBindOptions createMountpoint(Boolean createMountpoint) {
    this.createMountpoint = createMountpoint;
    return this;
  }

  /**
   * Create mount point on host if missing
   * @return createMountpoint
  */
  
  @Schema(name = "CreateMountpoint", description = "Create mount point on host if missing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreateMountpoint")
  public Boolean getCreateMountpoint() {
    return createMountpoint;
  }

  public void setCreateMountpoint(Boolean createMountpoint) {
    this.createMountpoint = createMountpoint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountBindOptions mountBindOptions = (MountBindOptions) o;
    return Objects.equals(this.propagation, mountBindOptions.propagation) &&
        Objects.equals(this.nonRecursive, mountBindOptions.nonRecursive) &&
        Objects.equals(this.createMountpoint, mountBindOptions.createMountpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propagation, nonRecursive, createMountpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountBindOptions {\n");
    sb.append("    propagation: ").append(toIndentedString(propagation)).append("\n");
    sb.append("    nonRecursive: ").append(toIndentedString(nonRecursive)).append("\n");
    sb.append("    createMountpoint: ").append(toIndentedString(createMountpoint)).append("\n");
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

