package ai.chatboot.model;

import ai.chatboot.model.Message;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@org.eclipse.microprofile.openapi.annotations.media.Schema(description="")
@JsonTypeName("approachResponse_choices_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-22T12:34:20.869454+01:00[Europe/Paris]")
public class ApproachResponseChoicesInner   {
  private BigDecimal index;
  private Message message;

  /**
   **/
  public ApproachResponseChoicesInner index(BigDecimal index) {
    this.index = index;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(required = true, description = "")
  @JsonProperty("index")
  public BigDecimal getIndex() {
    return index;
  }

  @JsonProperty("index")
  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  /**
   **/
  public ApproachResponseChoicesInner message(Message message) {
    this.message = message;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(required = true, description = "")
  @JsonProperty("message")
  public Message getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(Message message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApproachResponseChoicesInner approachResponseChoicesInner = (ApproachResponseChoicesInner) o;
    return Objects.equals(this.index, approachResponseChoicesInner.index) &&
        Objects.equals(this.message, approachResponseChoicesInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApproachResponseChoicesInner {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

