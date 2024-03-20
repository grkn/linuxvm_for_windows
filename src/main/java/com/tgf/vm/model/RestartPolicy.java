package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The behavior to apply when the container exits. The default is not to restart.  An ever increasing delay (double the previous delay, starting at 100ms) is added before each restart to prevent flooding the server. 
 */

@Schema(name = "RestartPolicy", description = "The behavior to apply when the container exits. The default is not to restart.  An ever increasing delay (double the previous delay, starting at 100ms) is added before each restart to prevent flooding the server. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class RestartPolicy {

  /**
   * - Empty string means not to restart - `no` Do not automatically restart - `always` Always restart - `unless-stopped` Restart always except when the user has manually stopped the container - `on-failure` Restart only when the container exit code is non-zero 
   */
  public enum NameEnum {
    EMPTY(""),
    
    NO("no"),
    
    ALWAYS("always"),
    
    UNLESS_STOPPED("unless-stopped"),
    
    ON_FAILURE("on-failure");

    private String value;

    NameEnum(String value) {
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
    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private NameEnum name;

  private Integer maximumRetryCount;

  public RestartPolicy name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * - Empty string means not to restart - `no` Do not automatically restart - `always` Always restart - `unless-stopped` Restart always except when the user has manually stopped the container - `on-failure` Restart only when the container exit code is non-zero 
   * @return name
  */
  
  @Schema(name = "Name", description = "- Empty string means not to restart - `no` Do not automatically restart - `always` Always restart - `unless-stopped` Restart always except when the user has manually stopped the container - `on-failure` Restart only when the container exit code is non-zero ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public RestartPolicy maximumRetryCount(Integer maximumRetryCount) {
    this.maximumRetryCount = maximumRetryCount;
    return this;
  }

  /**
   * If `on-failure` is used, the number of times to retry before giving up. 
   * @return maximumRetryCount
  */
  
  @Schema(name = "MaximumRetryCount", description = "If `on-failure` is used, the number of times to retry before giving up. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaximumRetryCount")
  public Integer getMaximumRetryCount() {
    return maximumRetryCount;
  }

  public void setMaximumRetryCount(Integer maximumRetryCount) {
    this.maximumRetryCount = maximumRetryCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestartPolicy restartPolicy = (RestartPolicy) o;
    return Objects.equals(this.name, restartPolicy.name) &&
        Objects.equals(this.maximumRetryCount, restartPolicy.maximumRetryCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, maximumRetryCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestartPolicy {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    maximumRetryCount: ").append(toIndentedString(maximumRetryCount)).append("\n");
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

