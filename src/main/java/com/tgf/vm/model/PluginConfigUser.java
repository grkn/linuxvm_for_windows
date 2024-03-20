package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PluginConfigUser
 */

@JsonTypeName("Plugin_Config_User")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class PluginConfigUser {

  private Integer UID;

  private Integer GID;

  public PluginConfigUser UID(Integer UID) {
    this.UID = UID;
    return this;
  }

  /**
   * Get UID
   * @return UID
  */
  
  @Schema(name = "UID", example = "1000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UID")
  public Integer getUID() {
    return UID;
  }

  public void setUID(Integer UID) {
    this.UID = UID;
  }

  public PluginConfigUser GID(Integer GID) {
    this.GID = GID;
    return this;
  }

  /**
   * Get GID
   * @return GID
  */
  
  @Schema(name = "GID", example = "1000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GID")
  public Integer getGID() {
    return GID;
  }

  public void setGID(Integer GID) {
    this.GID = GID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfigUser pluginConfigUser = (PluginConfigUser) o;
    return Objects.equals(this.UID, pluginConfigUser.UID) &&
        Objects.equals(this.GID, pluginConfigUser.GID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(UID, GID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfigUser {\n");
    sb.append("    UID: ").append(toIndentedString(UID)).append("\n");
    sb.append("    GID: ").append(toIndentedString(GID)).append("\n");
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

