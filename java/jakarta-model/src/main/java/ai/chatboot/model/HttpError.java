package ai.chatboot.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("httpError")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-18T18:40:39.953789+01:00[Europe/Paris]")
public class HttpError   {
  private BigDecimal statusCode;
  private String code;
  private String error;
  private String message;

  /**
   **/
  public HttpError statusCode(BigDecimal statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  
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
  public HttpError code(String code) {
    this.code = code;
    return this;
  }

  
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
  public HttpError error(String error) {
    this.error = error;
    return this;
  }

  
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
  public HttpError message(String message) {
    this.message = message;
    return this;
  }

  
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
    HttpError httpError = (HttpError) o;
    return Objects.equals(this.statusCode, httpError.statusCode) &&
        Objects.equals(this.code, httpError.code) &&
        Objects.equals(this.error, httpError.error) &&
        Objects.equals(this.message, httpError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, code, error, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpError {\n");
    
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

