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
 * Actor describes something that generates events, like a container, network, or a volume. 
 */

@Schema(name = "EventActor", description = "Actor describes something that generates events, like a container, network, or a volume. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T01:46:20.938706300+03:00[Europe/Istanbul]", comments = "Generator version: 7.4.0")
public class EventActor {

  private String ID;

  @Valid
  private Map<String, String> attributes = new HashMap<>();

  public EventActor ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * The ID of the object emitting the event
   * @return ID
  */
  
  @Schema(name = "ID", example = "ede54ee1afda366ab42f824e8a5ffd195155d853ceaec74a927f249ea270c743", description = "The ID of the object emitting the event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public EventActor attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public EventActor putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Various key/value attributes of the object, depending on its type. 
   * @return attributes
  */
  
  @Schema(name = "Attributes", example = "{\"com.example.some-label\":\"some-label-value\",\"image\":\"alpine:latest\",\"name\":\"my-container\"}", description = "Various key/value attributes of the object, depending on its type. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventActor eventActor = (EventActor) o;
    return Objects.equals(this.ID, eventActor.ID) &&
        Objects.equals(this.attributes, eventActor.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventActor {\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

