package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * BuildCache contains information about a build cache record. 
 */

@Schema(name = "BuildCache", description = "BuildCache contains information about a build cache record. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class BuildCache {

  private String ID;

  private JsonNullable<String> parent = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> parents = JsonNullable.<List<String>>undefined();

  /**
   * Cache record type. 
   */
  public enum TypeEnum {
    INTERNAL("internal"),
    
    FRONTEND("frontend"),
    
    SOURCE_LOCAL("source.local"),
    
    SOURCE_GIT_CHECKOUT("source.git.checkout"),
    
    EXEC_CACHEMOUNT("exec.cachemount"),
    
    REGULAR("regular");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String description;

  private Boolean inUse;

  private Boolean shared;

  private Integer size;

  private String createdAt;

  private JsonNullable<String> lastUsedAt = JsonNullable.<String>undefined();

  private Integer usageCount;

  public BuildCache ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Unique ID of the build cache record. 
   * @return ID
  */
  
  @Schema(name = "ID", example = "ndlpt0hhvkqcdfkputsk4cq9c", description = "Unique ID of the build cache record. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public BuildCache parent(String parent) {
    this.parent = JsonNullable.of(parent);
    return this;
  }

  /**
   * ID of the parent build cache record.  > **Deprecated**: This field is deprecated, and omitted if empty. 
   * @return parent
  */
  
  @Schema(name = "Parent", example = "", description = "ID of the parent build cache record.  > **Deprecated**: This field is deprecated, and omitted if empty. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Parent")
  public JsonNullable<String> getParent() {
    return parent;
  }

  public void setParent(JsonNullable<String> parent) {
    this.parent = parent;
  }

  public BuildCache parents(List<String> parents) {
    this.parents = JsonNullable.of(parents);
    return this;
  }

  public BuildCache addParentsItem(String parentsItem) {
    if (this.parents == null || !this.parents.isPresent()) {
      this.parents = JsonNullable.of(new ArrayList<>());
    }
    this.parents.get().add(parentsItem);
    return this;
  }

  /**
   * List of parent build cache record IDs. 
   * @return parents
  */
  
  @Schema(name = "Parents", example = "[hw53o5aio51xtltp5xjp8v7fx]", description = "List of parent build cache record IDs. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Parents")
  public JsonNullable<List<String>> getParents() {
    return parents;
  }

  public void setParents(JsonNullable<List<String>> parents) {
    this.parents = parents;
  }

  public BuildCache type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Cache record type. 
   * @return type
  */
  
  @Schema(name = "Type", example = "regular", description = "Cache record type. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BuildCache description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the build-step that produced the build cache. 
   * @return description
  */
  
  @Schema(name = "Description", example = "mount / from exec /bin/sh -c echo 'Binary::apt::APT::Keep-Downloaded-Packages \"true\";' > /etc/apt/apt.conf.d/keep-cache", description = "Description of the build-step that produced the build cache. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BuildCache inUse(Boolean inUse) {
    this.inUse = inUse;
    return this;
  }

  /**
   * Indicates if the build cache is in use. 
   * @return inUse
  */
  
  @Schema(name = "InUse", example = "false", description = "Indicates if the build cache is in use. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("InUse")
  public Boolean getInUse() {
    return inUse;
  }

  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
  }

  public BuildCache shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

  /**
   * Indicates if the build cache is shared. 
   * @return shared
  */
  
  @Schema(name = "Shared", example = "true", description = "Indicates if the build cache is shared. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Shared")
  public Boolean getShared() {
    return shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  public BuildCache size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Amount of disk space used by the build cache (in bytes). 
   * @return size
  */
  
  @Schema(name = "Size", example = "51", description = "Amount of disk space used by the build cache (in bytes). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public BuildCache createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date and time at which the build cache was created in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return createdAt
  */
  
  @Schema(name = "CreatedAt", example = "2016-08-18T10:44:24.496525531Z", description = "Date and time at which the build cache was created in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreatedAt")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public BuildCache lastUsedAt(String lastUsedAt) {
    this.lastUsedAt = JsonNullable.of(lastUsedAt);
    return this;
  }

  /**
   * Date and time at which the build cache was last used in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return lastUsedAt
  */
  
  @Schema(name = "LastUsedAt", example = "2017-08-09T07:09:37.632105588Z", description = "Date and time at which the build cache was last used in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastUsedAt")
  public JsonNullable<String> getLastUsedAt() {
    return lastUsedAt;
  }

  public void setLastUsedAt(JsonNullable<String> lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }

  public BuildCache usageCount(Integer usageCount) {
    this.usageCount = usageCount;
    return this;
  }

  /**
   * Get usageCount
   * @return usageCount
  */
  
  @Schema(name = "UsageCount", example = "26", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UsageCount")
  public Integer getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(Integer usageCount) {
    this.usageCount = usageCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildCache buildCache = (BuildCache) o;
    return Objects.equals(this.ID, buildCache.ID) &&
        equalsNullable(this.parent, buildCache.parent) &&
        equalsNullable(this.parents, buildCache.parents) &&
        Objects.equals(this.type, buildCache.type) &&
        Objects.equals(this.description, buildCache.description) &&
        Objects.equals(this.inUse, buildCache.inUse) &&
        Objects.equals(this.shared, buildCache.shared) &&
        Objects.equals(this.size, buildCache.size) &&
        Objects.equals(this.createdAt, buildCache.createdAt) &&
        equalsNullable(this.lastUsedAt, buildCache.lastUsedAt) &&
        Objects.equals(this.usageCount, buildCache.usageCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, hashCodeNullable(parent), hashCodeNullable(parents), type, description, inUse, shared, size, createdAt, hashCodeNullable(lastUsedAt), usageCount);
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
    sb.append("class BuildCache {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
    sb.append("    usageCount: ").append(toIndentedString(usageCount)).append("\n");
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

