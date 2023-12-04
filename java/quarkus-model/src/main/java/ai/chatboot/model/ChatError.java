package ai.chatboot.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Error sent by ChatBoot.
 **/

@org.eclipse.microprofile.openapi.annotations.media.Schema(description="Error sent by ChatBoot.")
@JsonTypeName("chatError")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-12-04T13:53:53.981110+01:00[Europe/Paris]")
public class ChatError   {
  private BigDecimal statusCode;
  private String code;
  private String error;
  private String message;

  /**
   **/
  public ChatError statusCode(BigDecimal statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(description = "")
  @JsonProperty("statusCode")
  public BigDecimal getStatusCode() {
    return statusCode;
  }

  @JsonProperty("statusCode")
  public void setStatusCode(BigDecimal statusCode) {
    this.statusCode = statusCode;
  }

  /**
   **/
  public ChatError code(String code) {
    this.code = code;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(description = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  public ChatError error(String error) {
    this.error = error;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(description = "")
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  @JsonProperty("error")
  public void setError(String error) {
    this.error = error;
  }

  /**
   **/
  public ChatError message(String message) {
    this.message = message;
    return this;
  }

  
  @org.eclipse.microprofile.openapi.annotations.media.Schema(description = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(String message) {
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
    ChatError chatError = (ChatError) o;
    return Objects.equals(this.statusCode, chatError.statusCode) &&
        Objects.equals(this.code, chatError.code) &&
        Objects.equals(this.error, chatError.error) &&
        Objects.equals(this.message, chatError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, code, error, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatError {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

