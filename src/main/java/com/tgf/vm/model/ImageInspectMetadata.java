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
 * Additional metadata of the image in the local cache. This information is local to the daemon, and not part of the image itself. 
 */

@Schema(name = "ImageInspect_Metadata", description = "Additional metadata of the image in the local cache. This information is local to the daemon, and not part of the image itself. ")
@JsonTypeName("ImageInspect_Metadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ImageInspectMetadata {

  private JsonNullable<String> lastTagTime = JsonNullable.<String>undefined();

  public ImageInspectMetadata lastTagTime(String lastTagTime) {
    this.lastTagTime = JsonNullable.of(lastTagTime);
    return this;
  }

  /**
   * Date and time at which the image was last tagged in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  This information is only available if the image was tagged locally, and omitted otherwise. 
   * @return lastTagTime
  */
  
  @Schema(name = "LastTagTime", example = "2022-02-28T14:40:02.623929178Z", description = "Date and time at which the image was last tagged in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  This information is only available if the image was tagged locally, and omitted otherwise. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastTagTime")
  public JsonNullable<String> getLastTagTime() {
    return lastTagTime;
  }

  public void setLastTagTime(JsonNullable<String> lastTagTime) {
    this.lastTagTime = lastTagTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageInspectMetadata imageInspectMetadata = (ImageInspectMetadata) o;
    return equalsNullable(this.lastTagTime, imageInspectMetadata.lastTagTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(lastTagTime));
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
    sb.append("class ImageInspectMetadata {\n");
    sb.append("    lastTagTime: ").append(toIndentedString(lastTagTime)).append("\n");
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

