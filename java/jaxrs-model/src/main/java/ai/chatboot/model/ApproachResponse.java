package ai.chatboot.model;

import ai.chatboot.model.ApproachResponseChoicesInner;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("approachResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-18T18:14:53.310777+01:00[Europe/Paris]")
public class ApproachResponse   {
  private List<ApproachResponseChoicesInner> choices = new ArrayList<>();
  private String _object;

  /**
   **/
  public ApproachResponse choices(List<ApproachResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  
  @JsonProperty("choices")
  public List<ApproachResponseChoicesInner> getChoices() {
    return choices;
  }

  @JsonProperty("choices")
  public void setChoices(List<ApproachResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public ApproachResponse addChoicesItem(ApproachResponseChoicesInner choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }

    this.choices.add(choicesItem);
    return this;
  }

  public ApproachResponse removeChoicesItem(ApproachResponseChoicesInner choicesItem) {
    if (choicesItem != null && this.choices != null) {
      this.choices.remove(choicesItem);
    }

    return this;
  }
  /**
   **/
  public ApproachResponse _object(String _object) {
    this._object = _object;
    return this;
  }

  
  @JsonProperty("object")
  public String getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(String _object) {
    this._object = _object;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApproachResponse approachResponse = (ApproachResponse) o;
    return Objects.equals(this.choices, approachResponse.choices) &&
        Objects.equals(this._object, approachResponse._object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(choices, _object);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApproachResponse {\n");
    
    sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

