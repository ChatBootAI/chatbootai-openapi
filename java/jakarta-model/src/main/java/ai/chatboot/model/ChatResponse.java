package ai.chatboot.model;

import ai.chatboot.model.ChatResponseChoice;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents the chat response returned by the model, based on the provided chat request.
 **/
@ApiModel(description = "Represents the chat response returned by the model, based on the provided chat request.")
@JsonTypeName("chatResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-12-04T13:52:44.900078+01:00[Europe/Paris]")
public class ChatResponse   {
  private String id;
  private List<ChatResponseChoice> choices = new ArrayList<>();
  public enum ObjectEnum {

    CHAT(String.valueOf("chat"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static ObjectEnum fromString(String s) {
        for (ObjectEnum b : ObjectEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ObjectEnum _object;
  private Integer created;
  private String model;

  /**
   * A unique identifier for the completion.
   **/
  public ChatResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "A unique identifier for the completion.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * A list of chat completion choices. Can be more than one.
   **/
  public ChatResponse choices(List<ChatResponseChoice> choices) {
    this.choices = choices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of chat completion choices. Can be more than one.")
  @JsonProperty("choices")
  public List<ChatResponseChoice> getChoices() {
    return choices;
  }

  @JsonProperty("choices")
  public void setChoices(List<ChatResponseChoice> choices) {
    this.choices = choices;
  }

  public ChatResponse addChoicesItem(ChatResponseChoice choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }

    this.choices.add(choicesItem);
    return this;
  }

  public ChatResponse removeChoicesItem(ChatResponseChoice choicesItem) {
    if (choicesItem != null && this.choices != null) {
      this.choices.remove(choicesItem);
    }

    return this;
  }
  /**
   * The object type, which is always \&quot;chat\&quot;
   **/
  public ChatResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always \"chat\"")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The Unix timestamp (in seconds) of when the completion was created.
   **/
  public ChatResponse created(Integer created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(value = "The Unix timestamp (in seconds) of when the completion was created.")
  @JsonProperty("created")
  public Integer getCreated() {
    return created;
  }

  @JsonProperty("created")
  public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   * The model used for the chat completion.
   **/
  public ChatResponse model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(value = "The model used for the chat completion.")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  @JsonProperty("model")
  public void setModel(String model) {
    this.model = model;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatResponse chatResponse = (ChatResponse) o;
    return Objects.equals(this.id, chatResponse.id) &&
        Objects.equals(this.choices, chatResponse.choices) &&
        Objects.equals(this._object, chatResponse._object) &&
        Objects.equals(this.created, chatResponse.created) &&
        Objects.equals(this.model, chatResponse.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, _object, created, model);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

