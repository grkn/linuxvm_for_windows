package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * Information about the image&#39;s RootFS, including the layer IDs. 
 */

@Schema(name = "ImageInspect_RootFS", description = "Information about the image's RootFS, including the layer IDs. ")
@JsonTypeName("ImageInspect_RootFS")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ImageInspectRootFS {

  private String type;

  @Valid
  private List<String> layers;

  public ImageInspectRootFS() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ImageInspectRootFS(String type) {
    this.type = type;
  }

  public ImageInspectRootFS type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "Type", example = "layers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ImageInspectRootFS layers(List<String> layers) {
    this.layers = layers;
    return this;
  }

  public ImageInspectRootFS addLayersItem(String layersItem) {
    if (this.layers == null) {
      this.layers = new ArrayList<>();
    }
    this.layers.add(layersItem);
    return this;
  }

  /**
   * Get layers
   * @return layers
  */
  
  @Schema(name = "Layers", example = "[sha256:1834950e52ce4d5a88a1bbd131c537f4d0e56d10ff0dd69e66be3b7dfa9df7e6, sha256:5f70bf18a086007016e948b04aed3b82103a36bea41755b6cddfaf10ace3c6ef]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Layers")
  public List<String> getLayers() {
    return layers;
  }

  public void setLayers(List<String> layers) {
    this.layers = layers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageInspectRootFS imageInspectRootFS = (ImageInspectRootFS) o;
    return Objects.equals(this.type, imageInspectRootFS.type) &&
        Objects.equals(this.layers, imageInspectRootFS.layers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, layers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageInspectRootFS {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
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

