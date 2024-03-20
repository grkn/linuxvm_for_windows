package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.ContainerConfig;
import com.tgf.vm.model.GraphDriverData;
import com.tgf.vm.model.ImageInspectMetadata;
import com.tgf.vm.model.ImageInspectRootFS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Information about an image in the local image cache. 
 */

@Schema(name = "ImageInspect", description = "Information about an image in the local image cache. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ImageInspect {

  private String id;

  @Valid
  private List<String> repoTags;

  @Valid
  private List<String> repoDigests;

  private String parent;

  private String comment;

  private String created;

  private String container;

  private ContainerConfig containerConfig;

  private String dockerVersion;

  private String author;

  private ContainerConfig config;

  private String architecture;

  private JsonNullable<String> variant = JsonNullable.<String>undefined();

  private String os;

  private JsonNullable<String> osVersion = JsonNullable.<String>undefined();

  private Long size;

  private Long virtualSize;

  private GraphDriverData graphDriver;

  private ImageInspectRootFS rootFS;

  private ImageInspectMetadata metadata;

  public ImageInspect id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID is the content-addressable ID of an image.  This identifier is a content-addressable digest calculated from the image's configuration (which includes the digests of layers used by the image).  Note that this digest differs from the `RepoDigests` below, which holds digests of image manifests that reference the image. 
   * @return id
  */
  
  @Schema(name = "Id", example = "sha256:ec3f0931a6e6b6855d76b2d7b0be30e81860baccd891b2e243280bf1cd8ad710", description = "ID is the content-addressable ID of an image.  This identifier is a content-addressable digest calculated from the image's configuration (which includes the digests of layers used by the image).  Note that this digest differs from the `RepoDigests` below, which holds digests of image manifests that reference the image. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ImageInspect repoTags(List<String> repoTags) {
    this.repoTags = repoTags;
    return this;
  }

  public ImageInspect addRepoTagsItem(String repoTagsItem) {
    if (this.repoTags == null) {
      this.repoTags = new ArrayList<>();
    }
    this.repoTags.add(repoTagsItem);
    return this;
  }

  /**
   * List of image names/tags in the local image cache that reference this image.  Multiple image tags can refer to the same image, and this list may be empty if no tags reference the image, in which case the image is \"untagged\", in which case it can still be referenced by its ID. 
   * @return repoTags
  */
  
  @Schema(name = "RepoTags", example = "[example:1.0, example:latest, example:stable, internal.registry.example.com:5000/example:1.0]", description = "List of image names/tags in the local image cache that reference this image.  Multiple image tags can refer to the same image, and this list may be empty if no tags reference the image, in which case the image is \"untagged\", in which case it can still be referenced by its ID. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RepoTags")
  public List<String> getRepoTags() {
    return repoTags;
  }

  public void setRepoTags(List<String> repoTags) {
    this.repoTags = repoTags;
  }

  public ImageInspect repoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
    return this;
  }

  public ImageInspect addRepoDigestsItem(String repoDigestsItem) {
    if (this.repoDigests == null) {
      this.repoDigests = new ArrayList<>();
    }
    this.repoDigests.add(repoDigestsItem);
    return this;
  }

  /**
   * List of content-addressable digests of locally available image manifests that the image is referenced from. Multiple manifests can refer to the same image.  These digests are usually only available if the image was either pulled from a registry, or if the image was pushed to a registry, which is when the manifest is generated and its digest calculated. 
   * @return repoDigests
  */
  
  @Schema(name = "RepoDigests", example = "[example@sha256:afcc7f1ac1b49db317a7196c902e61c6c3c4607d63599ee1a82d702d249a0ccb, internal.registry.example.com:5000/example@sha256:b69959407d21e8a062e0416bf13405bb2b71ed7a84dde4158ebafacfa06f5578]", description = "List of content-addressable digests of locally available image manifests that the image is referenced from. Multiple manifests can refer to the same image.  These digests are usually only available if the image was either pulled from a registry, or if the image was pushed to a registry, which is when the manifest is generated and its digest calculated. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RepoDigests")
  public List<String> getRepoDigests() {
    return repoDigests;
  }

  public void setRepoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
  }

  public ImageInspect parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * ID of the parent image.  Depending on how the image was created, this field may be empty and is only set for images that were built/created locally. This field is empty if the image was pulled from an image registry. 
   * @return parent
  */
  
  @Schema(name = "Parent", example = "", description = "ID of the parent image.  Depending on how the image was created, this field may be empty and is only set for images that were built/created locally. This field is empty if the image was pulled from an image registry. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Parent")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public ImageInspect comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Optional message that was set when committing or importing the image. 
   * @return comment
  */
  
  @Schema(name = "Comment", example = "", description = "Optional message that was set when committing or importing the image. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public ImageInspect created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Date and time at which the image was created, formatted in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return created
  */
  
  @Schema(name = "Created", example = "2022-02-04T21:20:12.497794809Z", description = "Date and time at which the image was created, formatted in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Created")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public ImageInspect container(String container) {
    this.container = container;
    return this;
  }

  /**
   * The ID of the container that was used to create the image.  Depending on how the image was created, this field may be empty. 
   * @return container
  */
  
  @Schema(name = "Container", example = "65974bc86f1770ae4bff79f651ebdbce166ae9aada632ee3fa9af3a264911735", description = "The ID of the container that was used to create the image.  Depending on how the image was created, this field may be empty. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Container")
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public ImageInspect containerConfig(ContainerConfig containerConfig) {
    this.containerConfig = containerConfig;
    return this;
  }

  /**
   * Get containerConfig
   * @return containerConfig
  */
  @Valid 
  @Schema(name = "ContainerConfig", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContainerConfig")
  public ContainerConfig getContainerConfig() {
    return containerConfig;
  }

  public void setContainerConfig(ContainerConfig containerConfig) {
    this.containerConfig = containerConfig;
  }

  public ImageInspect dockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
    return this;
  }

  /**
   * The version of Docker that was used to build the image.  Depending on how the image was created, this field may be empty. 
   * @return dockerVersion
  */
  
  @Schema(name = "DockerVersion", example = "20.10.7", description = "The version of Docker that was used to build the image.  Depending on how the image was created, this field may be empty. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DockerVersion")
  public String getDockerVersion() {
    return dockerVersion;
  }

  public void setDockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
  }

  public ImageInspect author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Name of the author that was specified when committing the image, or as specified through MAINTAINER (deprecated) in the Dockerfile. 
   * @return author
  */
  
  @Schema(name = "Author", example = "", description = "Name of the author that was specified when committing the image, or as specified through MAINTAINER (deprecated) in the Dockerfile. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public ImageInspect config(ContainerConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
  */
  @Valid 
  @Schema(name = "Config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Config")
  public ContainerConfig getConfig() {
    return config;
  }

  public void setConfig(ContainerConfig config) {
    this.config = config;
  }

  public ImageInspect architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Hardware CPU architecture that the image runs on. 
   * @return architecture
  */
  
  @Schema(name = "Architecture", example = "arm", description = "Hardware CPU architecture that the image runs on. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Architecture")
  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public ImageInspect variant(String variant) {
    this.variant = JsonNullable.of(variant);
    return this;
  }

  /**
   * CPU architecture variant (presently ARM-only). 
   * @return variant
  */
  
  @Schema(name = "Variant", example = "v7", description = "CPU architecture variant (presently ARM-only). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Variant")
  public JsonNullable<String> getVariant() {
    return variant;
  }

  public void setVariant(JsonNullable<String> variant) {
    this.variant = variant;
  }

  public ImageInspect os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Operating System the image is built to run on. 
   * @return os
  */
  
  @Schema(name = "Os", example = "linux", description = "Operating System the image is built to run on. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Os")
  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public ImageInspect osVersion(String osVersion) {
    this.osVersion = JsonNullable.of(osVersion);
    return this;
  }

  /**
   * Operating System version the image is built to run on (especially for Windows). 
   * @return osVersion
  */
  
  @Schema(name = "OsVersion", example = "", description = "Operating System version the image is built to run on (especially for Windows). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OsVersion")
  public JsonNullable<String> getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(JsonNullable<String> osVersion) {
    this.osVersion = osVersion;
  }

  public ImageInspect size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Total size of the image including all layers it is composed of. 
   * @return size
  */
  
  @Schema(name = "Size", example = "1239828", description = "Total size of the image including all layers it is composed of. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public ImageInspect virtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
    return this;
  }

  /**
   * Total size of the image including all layers it is composed of.  In versions of Docker before v1.10, this field was calculated from the image itself and all of its parent images. Images are now stored self-contained, and no longer use a parent-chain, making this field an equivalent of the Size field.  > **Deprecated**: this field is kept for backward compatibility, but > will be removed in API v1.44. 
   * @return virtualSize
  */
  
  @Schema(name = "VirtualSize", example = "1239828", description = "Total size of the image including all layers it is composed of.  In versions of Docker before v1.10, this field was calculated from the image itself and all of its parent images. Images are now stored self-contained, and no longer use a parent-chain, making this field an equivalent of the Size field.  > **Deprecated**: this field is kept for backward compatibility, but > will be removed in API v1.44. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VirtualSize")
  public Long getVirtualSize() {
    return virtualSize;
  }

  public void setVirtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
  }

  public ImageInspect graphDriver(GraphDriverData graphDriver) {
    this.graphDriver = graphDriver;
    return this;
  }

  /**
   * Get graphDriver
   * @return graphDriver
  */
  @Valid 
  @Schema(name = "GraphDriver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GraphDriver")
  public GraphDriverData getGraphDriver() {
    return graphDriver;
  }

  public void setGraphDriver(GraphDriverData graphDriver) {
    this.graphDriver = graphDriver;
  }

  public ImageInspect rootFS(ImageInspectRootFS rootFS) {
    this.rootFS = rootFS;
    return this;
  }

  /**
   * Get rootFS
   * @return rootFS
  */
  @Valid 
  @Schema(name = "RootFS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RootFS")
  public ImageInspectRootFS getRootFS() {
    return rootFS;
  }

  public void setRootFS(ImageInspectRootFS rootFS) {
    this.rootFS = rootFS;
  }

  public ImageInspect metadata(ImageInspectMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid 
  @Schema(name = "Metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Metadata")
  public ImageInspectMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ImageInspectMetadata metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageInspect imageInspect = (ImageInspect) o;
    return Objects.equals(this.id, imageInspect.id) &&
        Objects.equals(this.repoTags, imageInspect.repoTags) &&
        Objects.equals(this.repoDigests, imageInspect.repoDigests) &&
        Objects.equals(this.parent, imageInspect.parent) &&
        Objects.equals(this.comment, imageInspect.comment) &&
        Objects.equals(this.created, imageInspect.created) &&
        Objects.equals(this.container, imageInspect.container) &&
        Objects.equals(this.containerConfig, imageInspect.containerConfig) &&
        Objects.equals(this.dockerVersion, imageInspect.dockerVersion) &&
        Objects.equals(this.author, imageInspect.author) &&
        Objects.equals(this.config, imageInspect.config) &&
        Objects.equals(this.architecture, imageInspect.architecture) &&
        equalsNullable(this.variant, imageInspect.variant) &&
        Objects.equals(this.os, imageInspect.os) &&
        equalsNullable(this.osVersion, imageInspect.osVersion) &&
        Objects.equals(this.size, imageInspect.size) &&
        Objects.equals(this.virtualSize, imageInspect.virtualSize) &&
        Objects.equals(this.graphDriver, imageInspect.graphDriver) &&
        Objects.equals(this.rootFS, imageInspect.rootFS) &&
        Objects.equals(this.metadata, imageInspect.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, repoTags, repoDigests, parent, comment, created, container, containerConfig, dockerVersion, author, config, architecture, hashCodeNullable(variant), os, hashCodeNullable(osVersion), size, virtualSize, graphDriver, rootFS, metadata);
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
    sb.append("class ImageInspect {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repoTags: ").append(toIndentedString(repoTags)).append("\n");
    sb.append("    repoDigests: ").append(toIndentedString(repoDigests)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    containerConfig: ").append(toIndentedString(containerConfig)).append("\n");
    sb.append("    dockerVersion: ").append(toIndentedString(dockerVersion)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    virtualSize: ").append(toIndentedString(virtualSize)).append("\n");
    sb.append("    graphDriver: ").append(toIndentedString(graphDriver)).append("\n");
    sb.append("    rootFS: ").append(toIndentedString(rootFS)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

