package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A descriptor struct containing digest, media type, and size, as defined in the [OCI Content Descriptors Specification](https://github.com/opencontainers/image-spec/blob/v1.0.1/descriptor.md). 
 */

@Schema(name = "OCIDescriptor", description = "A descriptor struct containing digest, media type, and size, as defined in the [OCI Content Descriptors Specification](https://github.com/opencontainers/image-spec/blob/v1.0.1/descriptor.md). ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class OCIDescriptor {

  private String mediaType;

  private String digest;

  private Long size;

  public OCIDescriptor mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * The media type of the object this schema refers to. 
   * @return mediaType
  */
  
  @Schema(name = "mediaType", example = "application/vnd.docker.distribution.manifest.v2+json", description = "The media type of the object this schema refers to. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public OCIDescriptor digest(String digest) {
    this.digest = digest;
    return this;
  }

  /**
   * The digest of the targeted content. 
   * @return digest
  */
  
  @Schema(name = "digest", example = "sha256:c0537ff6a5218ef531ece93d4984efc99bbf3f7497c0a7726c88e2bb7584dc96", description = "The digest of the targeted content. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("digest")
  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }

  public OCIDescriptor size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * The size in bytes of the blob. 
   * @return size
  */
  
  @Schema(name = "size", example = "3987495", description = "The size in bytes of the blob. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCIDescriptor ocIDescriptor = (OCIDescriptor) o;
    return Objects.equals(this.mediaType, ocIDescriptor.mediaType) &&
        Objects.equals(this.digest, ocIDescriptor.digest) &&
        Objects.equals(this.size, ocIDescriptor.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, digest, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCIDescriptor {\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

