package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Information about the storage driver used to store the container&#39;s and image&#39;s filesystem. 
 */

@Schema(name = "GraphDriverData", description = "Information about the storage driver used to store the container's and image's filesystem. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class GraphDriverData {

  private String name;

  @Valid
  private Map<String, String> data = new HashMap<>();

  public GraphDriverData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GraphDriverData(String name, Map<String, String> data) {
    this.name = name;
    this.data = data;
  }

  public GraphDriverData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the storage driver.
   * @return name
  */
  @NotNull 
  @Schema(name = "Name", example = "overlay2", description = "Name of the storage driver.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GraphDriverData data(Map<String, String> data) {
    this.data = data;
    return this;
  }

  public GraphDriverData putDataItem(String key, String dataItem) {
    if (this.data == null) {
      this.data = new HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

  /**
   * Low-level storage metadata, provided as key/value pairs.  This information is driver-specific, and depends on the storage-driver in use, and should be used for informational purposes only. 
   * @return data
  */
  @NotNull 
  @Schema(name = "Data", example = "{\"MergedDir\":\"/var/lib/docker/overlay2/ef749362d13333e65fc95c572eb525abbe0052e16e086cb64bc3b98ae9aa6d74/merged\",\"UpperDir\":\"/var/lib/docker/overlay2/ef749362d13333e65fc95c572eb525abbe0052e16e086cb64bc3b98ae9aa6d74/diff\",\"WorkDir\":\"/var/lib/docker/overlay2/ef749362d13333e65fc95c572eb525abbe0052e16e086cb64bc3b98ae9aa6d74/work\"}", description = "Low-level storage metadata, provided as key/value pairs.  This information is driver-specific, and depends on the storage-driver in use, and should be used for informational purposes only. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Data")
  public Map<String, String> getData() {
    return data;
  }

  public void setData(Map<String, String> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphDriverData graphDriverData = (GraphDriverData) o;
    return Objects.equals(this.name, graphDriverData.name) &&
        Objects.equals(this.data, graphDriverData.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphDriverData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

