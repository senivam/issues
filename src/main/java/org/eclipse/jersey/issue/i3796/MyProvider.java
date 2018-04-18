package org.eclipse.jersey.issue.i3796;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

@Provider
@Priority(Priorities.USER + 2)
public class MyProvider implements Feature, ContainerRequestFilter, ContainerResponseFilter {

    private Boolean sameInstance;

    @Override
    public boolean configure(FeatureContext context) {
        System.out.println("Feature.this = " + this);
        return true;
    }

    @Override
    public void filter(ContainerRequestContext requestContext) {
        System.out.println("ContainerRequestFilter.this = " + this);
        sameInstance = Boolean.TRUE; //initialising variable in request
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
        System.out.println("ContainerResponseFilter.this = " + this);
        System.out.println("Same Instance = " + sameInstance); //accessing variable in response
    }

}

