package ai.chatboot;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition(
    info = @org.eclipse.microprofile.openapi.annotations.info.Info(
        version="0.0.1"
        ,title = "ChatBootAI"
        ,description = "This is ChatBootAI specification described as OpenAPI 3.0.  ChatBoot AI allows you to interact with several user interface and back-ends following the same OpenAPI contract."
        ,license = @org.eclipse.microprofile.openapi.annotations.info.License(name = "Apache 2.0", url = "http://www.apache.org/licenses/LICENSE-2.0.html")
        
))
@ApplicationPath(RestResourceRoot.APPLICATION_PATH)
public class RestApplication extends Application {

}
