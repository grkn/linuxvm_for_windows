package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tgf.vm.model.BuildCache;
import com.tgf.vm.model.ContainerSummary;
import com.tgf.vm.model.ImageSummary;
import com.tgf.vm.model.Volume;
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
 * SystemDataUsageResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SystemDataUsageResponse {

  private Long layersSize;

  @Valid
  private List<@Valid ImageSummary> images;

  @Valid
  private List<@Valid ContainerSummary> containers;

  @Valid
  private List<@Valid Volume> volumes;

  @Valid
  private List<@Valid BuildCache> buildCache;

  public SystemDataUsageResponse layersSize(Long layersSize) {
    this.layersSize = layersSize;
    return this;
  }

  /**
   * Get layersSize
   * @return layersSize
  */
  
  @Schema(name = "LayersSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LayersSize")
  public Long getLayersSize() {
    return layersSize;
  }

  public void setLayersSize(Long layersSize) {
    this.layersSize = layersSize;
  }

  public SystemDataUsageResponse images(List<@Valid ImageSummary> images) {
    this.images = images;
    return this;
  }

  public SystemDataUsageResponse addImagesItem(ImageSummary imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @Valid 
  @Schema(name = "Images", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Images")
  public List<@Valid ImageSummary> getImages() {
    return images;
  }

  public void setImages(List<@Valid ImageSummary> images) {
    this.images = images;
  }

  public SystemDataUsageResponse containers(List<@Valid ContainerSummary> containers) {
    this.containers = containers;
    return this;
  }

  public SystemDataUsageResponse addContainersItem(ContainerSummary containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    return this;
  }

  /**
   * Get containers
   * @return containers
  */
  @Valid 
  @Schema(name = "Containers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Containers")
  public List<@Valid ContainerSummary> getContainers() {
    return containers;
  }

  public void setContainers(List<@Valid ContainerSummary> containers) {
    this.containers = containers;
  }

  public SystemDataUsageResponse volumes(List<@Valid Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public SystemDataUsageResponse addVolumesItem(Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * Get volumes
   * @return volumes
  */
  @Valid 
  @Schema(name = "Volumes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Volumes")
  public List<@Valid Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<@Valid Volume> volumes) {
    this.volumes = volumes;
  }

  public SystemDataUsageResponse buildCache(List<@Valid BuildCache> buildCache) {
    this.buildCache = buildCache;
    return this;
  }

  public SystemDataUsageResponse addBuildCacheItem(BuildCache buildCacheItem) {
    if (this.buildCache == null) {
      this.buildCache = new ArrayList<>();
    }
    this.buildCache.add(buildCacheItem);
    return this;
  }

  /**
   * Get buildCache
   * @return buildCache
  */
  @Valid 
  @Schema(name = "BuildCache", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BuildCache")
  public List<@Valid BuildCache> getBuildCache() {
    return buildCache;
  }

  public void setBuildCache(List<@Valid BuildCache> buildCache) {
    this.buildCache = buildCache;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemDataUsageResponse systemDataUsageResponse = (SystemDataUsageResponse) o;
    return Objects.equals(this.layersSize, systemDataUsageResponse.layersSize) &&
        Objects.equals(this.images, systemDataUsageResponse.images) &&
        Objects.equals(this.containers, systemDataUsageResponse.containers) &&
        Objects.equals(this.volumes, systemDataUsageResponse.volumes) &&
        Objects.equals(this.buildCache, systemDataUsageResponse.buildCache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layersSize, images, containers, volumes, buildCache);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemDataUsageResponse {\n");
    sb.append("    layersSize: ").append(toIndentedString(layersSize)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    buildCache: ").append(toIndentedString(buildCache)).append("\n");
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

