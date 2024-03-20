package com.tgf.vm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ExecStartConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class ExecStartConfig {

  private Boolean detach;

  private Boolean tty;

  @Valid
  private JsonNullable<List<@Min(0)Integer>> consoleSize = JsonNullable.<List<@Min(0)Integer>>undefined();

  public ExecStartConfig detach(Boolean detach) {
    this.detach = detach;
    return this;
  }

  /**
   * Detach from the command.
   * @return detach
  */
  
  @Schema(name = "Detach", description = "Detach from the command.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Detach")
  public Boolean getDetach() {
    return detach;
  }

  public void setDetach(Boolean detach) {
    this.detach = detach;
  }

  public ExecStartConfig tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Allocate a pseudo-TTY.
   * @return tty
  */
  
  @Schema(name = "Tty", description = "Allocate a pseudo-TTY.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tty")
  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }

  public ExecStartConfig consoleSize(List<@Min(0)Integer> consoleSize) {
    this.consoleSize = JsonNullable.of(consoleSize);
    return this;
  }

  public ExecStartConfig addConsoleSizeItem(Integer consoleSizeItem) {
    if (this.consoleSize == null || !this.consoleSize.isPresent()) {
      this.consoleSize = JsonNullable.of(new ArrayList<>());
    }
    this.consoleSize.get().add(consoleSizeItem);
    return this;
  }

  /**
   * Initial console size, as an `[height, width]` array.
   * @return consoleSize
  */
  @Size(min = 2, max = 2) 
  @Schema(name = "ConsoleSize", description = "Initial console size, as an `[height, width]` array.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ConsoleSize")
  public JsonNullable<List<@Min(0)Integer>> getConsoleSize() {
    return consoleSize;
  }

  public void setConsoleSize(JsonNullable<List<@Min(0)Integer>> consoleSize) {
    this.consoleSize = consoleSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecStartConfig execStartConfig = (ExecStartConfig) o;
    return Objects.equals(this.detach, execStartConfig.detach) &&
        Objects.equals(this.tty, execStartConfig.tty) &&
        equalsNullable(this.consoleSize, execStartConfig.consoleSize);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(detach, tty, hashCodeNullable(consoleSize));
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
    sb.append("class ExecStartConfig {\n");
    sb.append("    detach: ").append(toIndentedString(detach)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    consoleSize: ").append(toIndentedString(consoleSize)).append("\n");
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

