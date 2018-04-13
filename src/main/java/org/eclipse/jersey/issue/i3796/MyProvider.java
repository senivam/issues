package org.eclipse.jersey.issue.i3796;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

@Provider
public class MyProvider implements Feature, ContainerRequestFilter, ContainerResponseFilter {

    @Override
    public boolean configure(FeatureContext context) {
        System.out.println("Feature.this = " + this);
        return true;
    }

    @Override
    public void filter(ContainerRequestContext requestContext) {
        System.out.println("ContainerRequestFilter.this = " + this);
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) {
        System.out.println("ContainerResponseFilter.this = " + this);
    }

}

