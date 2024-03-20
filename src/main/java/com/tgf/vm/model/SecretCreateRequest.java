package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.tgf.vm.model.Driver;
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
 * SecretCreateRequest
 */

@JsonTypeName("SecretCreate_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class SecretCreateRequest {

  private String name;

  @Valid
  private Map<String, String> labels = new HashMap<>();

  private String data;

  private Driver driver;

  private Driver templating;

  public SecretCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * User-defined name of the secret.
   * @return name
  */
  
  @Schema(name = "Name", description = "User-defined name of the secret.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecretCreateRequest labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public SecretCreateRequest putLabelsItem(String key, String labelsItem) {
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
  
  @Schema(name = "Labels", example = "{com.example.some-label=some-value, com.example.some-other-label=some-other-value}", description = "User-defined key/value metadata.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Labels")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public SecretCreateRequest data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) data to store as secret.  This field is only used to _create_ a secret, and is not returned by other endpoints. 
   * @return data
  */
  
  @Schema(name = "Data", example = "", description = "Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) data to store as secret.  This field is only used to _create_ a secret, and is not returned by other endpoints. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public SecretCreateRequest driver(Driver driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  */
  @Valid 
  @Schema(name = "Driver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Driver")
  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public SecretCreateRequest templating(Driver templating) {
    this.templating = templating;
    return this;
  }

  /**
   * Get templating
   * @return templating
  */
  @Valid 
  @Schema(name = "Templating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Templating")
  public Driver getTemplating() {
    return templating;
  }

  public void setTemplating(Driver templating) {
    this.templating = templating;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretCreateRequest secretCreateRequest = (SecretCreateRequest) o;
    return Objects.equals(this.name, secretCreateRequest.name) &&
        Objects.equals(this.labels, secretCreateRequest.labels) &&
        Objects.equals(this.data, secretCreateRequest.data) &&
        Objects.equals(this.driver, secretCreateRequest.driver) &&
        Objects.equals(this.templating, secretCreateRequest.templating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels, data, driver, templating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretCreateRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    templating: ").append(toIndentedString(templating)).append("\n");
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

