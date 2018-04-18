package org.eclipse.jersey.issue.i3796;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class MyContainerRequestFilterProvider implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        System.out.println("MyContainerRequestFilterProvider.this = " + this);
    }
}
