package ai.chatboot.api;

import ai.chatboot.model.ChatRequest;
import ai.chatboot.model.HttpError;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/chat")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-22T12:21:09.080530+01:00[Europe/Paris]")
public class ChatAPI {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response chat(ChatRequest chatRequest) {
        return Response.ok().entity("magic!").build();
    }
}
