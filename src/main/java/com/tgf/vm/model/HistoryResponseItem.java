package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * individual image layer information in response to ImageHistory operation
 */

@Schema(name = "HistoryResponseItem", description = "individual image layer information in response to ImageHistory operation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class HistoryResponseItem {

  private String id;

  private Long created;

  private String createdBy;

  @Valid
  private List<String> tags = new ArrayList<>();

  private Long size;

  private String comment;

  public HistoryResponseItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public HistoryResponseItem(String id, Long created, String createdBy, List<String> tags, Long size, String comment) {
    this.id = id;
    this.created = created;
    this.createdBy = createdBy;
    this.tags = tags;
    this.size = size;
    this.comment = comment;
  }

  public HistoryResponseItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "Id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HistoryResponseItem created(Long created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  @NotNull 
  @Schema(name = "Created", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Created")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public HistoryResponseItem createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  @NotNull 
  @Schema(name = "CreatedBy", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreatedBy")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public HistoryResponseItem tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public HistoryResponseItem addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @NotNull 
  @Schema(name = "Tags", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public HistoryResponseItem size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  @NotNull 
  @Schema(name = "Size", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public HistoryResponseItem comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  @NotNull 
  @Schema(name = "Comment", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Comment")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryResponseItem historyResponseItem = (HistoryResponseItem) o;
    return Objects.equals(this.id, historyResponseItem.id) &&
        Objects.equals(this.created, historyResponseItem.created) &&
        Objects.equals(this.createdBy, historyResponseItem.createdBy) &&
        Objects.equals(this.tags, historyResponseItem.tags) &&
        Objects.equals(this.size, historyResponseItem.size) &&
        Objects.equals(this.comment, historyResponseItem.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, createdBy, tags, size, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryResponseItem {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

