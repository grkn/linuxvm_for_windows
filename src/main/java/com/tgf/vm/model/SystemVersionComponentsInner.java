package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SystemVersionComponentsInner
 */

@JsonTypeName("SystemVersion_Components_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SystemVersionComponentsInner {

  private String name;

  private String version;

  private JsonNullable<Object> details = JsonNullable.<Object>undefined();

  public SystemVersionComponentsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SystemVersionComponentsInner(String name, String version) {
    this.name = name;
    this.version = version;
  }

  public SystemVersionComponentsInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the component 
   * @return name
  */
  @NotNull 
  @Schema(name = "Name", example = "Engine", description = "Name of the component ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SystemVersionComponentsInner version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the component 
   * @return version
  */
  @NotNull 
  @Schema(name = "Version", example = "19.03.12", description = "Version of the component ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SystemVersionComponentsInner details(Object details) {
    this.details = JsonNullable.of(details);
    return this;
  }

  /**
   * Key/value pairs of strings with additional information about the component. These values are intended for informational purposes only, and their content is not defined, and not part of the API specification.  These messages can be printed by the client as information to the user. 
   * @return details
  */
  
  @Schema(name = "Details", description = "Key/value pairs of strings with additional information about the component. These values are intended for informational purposes only, and their content is not defined, and not part of the API specification.  These messages can be printed by the client as information to the user. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Details")
  public JsonNullable<Object> getDetails() {
    return details;
  }

  public void setDetails(JsonNullable<Object> details) {
    this.details = details;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemVersionComponentsInner systemVersionComponentsInner = (SystemVersionComponentsInner) o;
    return Objects.equals(this.name, systemVersionComponentsInner.name) &&
        Objects.equals(this.version, systemVersionComponentsInner.version) &&
        equalsNullable(this.details, systemVersionComponentsInner.details);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, hashCodeNullable(details));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemVersionComponentsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

