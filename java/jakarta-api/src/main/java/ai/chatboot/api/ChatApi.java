package ai.chatboot.api;

import ai.chatboot.model.ChatRequest;
import ai.chatboot.model.HttpError;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/chat")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-18T18:40:39.899367+01:00[Europe/Paris]")
public class ChatApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response chatPost(ChatRequest chatRequest) {
        return Response.ok().entity("magic!").build();
    }
}
