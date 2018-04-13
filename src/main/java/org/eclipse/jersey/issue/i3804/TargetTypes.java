package org.eclipse.jersey.issue.i3804;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/targetTypes")
public class TargetTypes {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public PublicType types() {
        final PublicType type =  new PublicType();
        type.setId(1234567890l);
        type.setName("Name");

        return type;
    }


}
