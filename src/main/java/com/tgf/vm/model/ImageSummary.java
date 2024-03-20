package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
 * ImageSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ImageSummary {

  private String id;

  private String parentId;

  @Valid
  private List<String> repoTags = new ArrayList<>();

  @Valid
  private List<String> repoDigests = new ArrayList<>();

  private Integer created;

  private Long size;

  private Long sharedSize;

  private Long virtualSize;

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private Integer containers;

  public ImageSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ImageSummary(String id, String parentId, List<String> repoTags, List<String> repoDigests, Integer created, Long size, Long sharedSize, Map<String, String> labels, Integer containers) {
    this.id = id;
    this.parentId = parentId;
    this.repoTags = repoTags;
    this.repoDigests = repoDigests;
    this.created = created;
    this.size = size;
    this.sharedSize = sharedSize;
    this.labels = labels;
    this.containers = containers;
  }

  public ImageSummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID is the content-addressable ID of an image.  This identifier is a content-addressable digest calculated from the image's configuration (which includes the digests of layers used by the image).  Note that this digest differs from the `RepoDigests` below, which holds digests of image manifests that reference the image. 
   * @return id
  */
  @NotNull 
  @Schema(name = "Id", example = "sha256:ec3f0931a6e6b6855d76b2d7b0be30e81860baccd891b2e243280bf1cd8ad710", description = "ID is the content-addressable ID of an image.  This identifier is a content-addressable digest calculated from the image's configuration (which includes the digests of layers used by the image).  Note that this digest differs from the `RepoDigests` below, which holds digests of image manifests that reference the image. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ImageSummary parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * ID of the parent image.  Depending on how the image was created, this field may be empty and is only set for images that were built/created locally. This field is empty if the image was pulled from an image registry. 
   * @return parentId
  */
  @NotNull 
  @Schema(name = "ParentId", example = "", description = "ID of the parent image.  Depending on how the image was created, this field may be empty and is only set for images that were built/created locally. This field is empty if the image was pulled from an image registry. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ParentId")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public ImageSummary repoTags(List<String> repoTags) {
    this.repoTags = repoTags;
    return this;
  }

  public ImageSummary addRepoTagsItem(String repoTagsItem) {
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
  @NotNull 
  @Schema(name = "RepoTags", example = "[example:1.0, example:latest, example:stable, internal.registry.example.com:5000/example:1.0]", description = "List of image names/tags in the local image cache that reference this image.  Multiple image tags can refer to the same image, and this list may be empty if no tags reference the image, in which case the image is \"untagged\", in which case it can still be referenced by its ID. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("RepoTags")
  public List<String> getRepoTags() {
    return repoTags;
  }

  public void setRepoTags(List<String> repoTags) {
    this.repoTags = repoTags;
  }

  public ImageSummary repoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
    return this;
  }

  public ImageSummary addRepoDigestsItem(String repoDigestsItem) {
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
  @NotNull 
  @Schema(name = "RepoDigests", example = "[example@sha256:afcc7f1ac1b49db317a7196c902e61c6c3c4607d63599ee1a82d702d249a0ccb, internal.registry.example.com:5000/example@sha256:b69959407d21e8a062e0416bf13405bb2b71ed7a84dde4158ebafacfa06f5578]", description = "List of content-addressable digests of locally available image manifests that the image is referenced from. Multiple manifests can refer to the same image.  These digests are usually only available if the image was either pulled from a registry, or if the image was pushed to a registry, which is when the manifest is generated and its digest calculated. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("RepoDigests")
  public List<String> getRepoDigests() {
    return repoDigests;
  }

  public void setRepoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
  }

  public ImageSummary created(Integer created) {
    this.created = created;
    return this;
  }

  /**
   * Date and time at which the image was created as a Unix timestamp (number of seconds sinds EPOCH). 
   * @return created
  */
  @NotNull 
  @Schema(name = "Created", example = "1644009612", description = "Date and time at which the image was created as a Unix timestamp (number of seconds sinds EPOCH). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Created")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public ImageSummary size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Total size of the image including all layers it is composed of. 
   * @return size
  */
  @NotNull 
  @Schema(name = "Size", example = "172064416", description = "Total size of the image including all layers it is composed of. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public ImageSummary sharedSize(Long sharedSize) {
    this.sharedSize = sharedSize;
    return this;
  }

  /**
   * Total size of image layers that are shared between this image and other images.  This size is not calculated by default. `-1` indicates that the value has not been set / calculated. 
   * @return sharedSize
  */
  @NotNull 
  @Schema(name = "SharedSize", example = "1239828", description = "Total size of image layers that are shared between this image and other images.  This size is not calculated by default. `-1` indicates that the value has not been set / calculated. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SharedSize")
  public Long getSharedSize() {
    return sharedSize;
  }

  public void setSharedSize(Long sharedSize) {
    this.sharedSize = sharedSize;
  }

  public ImageSummary virtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
    return this;
  }

  /**
   * Total size of the image including all layers it is composed of.  In versions of Docker before v1.10, this field was calculated from the image itself and all of its parent images. Images are now stored self-contained, and no longer use a parent-chain, making this field an equivalent of the Size field.  Deprecated: this field is kept for backward compatibility, and will be removed in API v1.44.
   * @return virtualSize
  */
  
  @Schema(name = "VirtualSize", example = "172064416", description = "Total size of the image including all layers it is composed of.  In versions of Docker before v1.10, this field was calculated from the image itself and all of its parent images. Images are now stored self-contained, and no longer use a parent-chain, making this field an equivalent of the Size field.  Deprecated: this field is kept for backward compatibility, and will be removed in API v1.44.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VirtualSize")
  public Long getVirtualSize() {
    return virtualSize;
  }

  public void setVirtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
  }

  public ImageSummary labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ImageSummary putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * User-defined key/value metadata.
   * @return labels
  */
  @NotNull 
  @Schema(name = "Labels", example = "{\"com.example.some-label\":\"some-value\",\"com.example.some-other-label\":\"some-other-value\"}", description = "User-defined key/value metadata.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public ImageSummary containers(Integer containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Number of containers using this image. Includes both stopped and running containers.  This size is not calculated by default, and depends on which API endpoint is used. `-1` indicates that the value has not been set / calculated. 
   * @return containers
  */
  @NotNull 
  @Schema(name = "Containers", example = "2", description = "Number of containers using this image. Includes both stopped and running containers.  This size is not calculated by default, and depends on which API endpoint is used. `-1` indicates that the value has not been set / calculated. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Containers")
  public Integer getContainers() {
    return containers;
  }

  public void setContainers(Integer containers) {
    this.containers = containers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSummary imageSummary = (ImageSummary) o;
    return Objects.equals(this.id, imageSummary.id) &&
        Objects.equals(this.parentId, imageSummary.parentId) &&
        Objects.equals(this.repoTags, imageSummary.repoTags) &&
        Objects.equals(this.repoDigests, imageSummary.repoDigests) &&
        Objects.equals(this.created, imageSummary.created) &&
        Objects.equals(this.size, imageSummary.size) &&
        Objects.equals(this.sharedSize, imageSummary.sharedSize) &&
        Objects.equals(this.virtualSize, imageSummary.virtualSize) &&
        Objects.equals(this.labels, imageSummary.labels) &&
        Objects.equals(this.containers, imageSummary.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, repoTags, repoDigests, created, size, sharedSize, virtualSize, labels, containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    repoTags: ").append(toIndentedString(repoTags)).append("\n");
    sb.append("    repoDigests: ").append(toIndentedString(repoDigests)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
    sb.append("    virtualSize: ").append(toIndentedString(virtualSize)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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

