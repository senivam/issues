package org.eclipse.jersey.issue.i3796;

import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;

@Provider
public class MyFeatureProvider implements Feature {
    @Override
    public boolean configure(FeatureContext context) {
        System.out.println("MyFeatureProvider.this = " + this);
        return true;
    }
}
