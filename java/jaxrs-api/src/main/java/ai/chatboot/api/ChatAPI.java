package ai.chatboot.api;

import ai.chatboot.model.ChatRequest;
import ai.chatboot.model.HttpError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;


@Path("/chat")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-11-22T12:21:08.828185+01:00[Europe/Paris]")
public class ChatAPI {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    public Response chat(ChatRequest chatRequest) {
        return Response.ok().entity("magic!").build();
    }
}
