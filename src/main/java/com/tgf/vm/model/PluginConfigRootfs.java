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
 * PluginConfigRootfs
 */

@JsonTypeName("Plugin_Config_rootfs")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PluginConfigRootfs {

  private String type;

  @Valid
  private List<String> diffIds;

  public PluginConfigRootfs type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", example = "layers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PluginConfigRootfs diffIds(List<String> diffIds) {
    this.diffIds = diffIds;
    return this;
  }

  public PluginConfigRootfs addDiffIdsItem(String diffIdsItem) {
    if (this.diffIds == null) {
      this.diffIds = new ArrayList<>();
    }
    this.diffIds.add(diffIdsItem);
    return this;
  }

  /**
   * Get diffIds
   * @return diffIds
  */
  
  @Schema(name = "diff_ids", example = "[sha256:675532206fbf3030b8458f88d6e26d4eb1577688a25efec97154c94e8b6b4887, sha256:e216a057b1cb1efc11f8a268f37ef62083e70b1b38323ba252e25ac88904a7e8]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("diff_ids")
  public List<String> getDiffIds() {
    return diffIds;
  }

  public void setDiffIds(List<String> diffIds) {
    this.diffIds = diffIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfigRootfs pluginConfigRootfs = (PluginConfigRootfs) o;
    return Objects.equals(this.type, pluginConfigRootfs.type) &&
        Objects.equals(this.diffIds, pluginConfigRootfs.diffIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, diffIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfigRootfs {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    diffIds: ").append(toIndentedString(diffIds)).append("\n");
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

