package com.library.rest.application;

import javax.ws.rs.core.Application;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

@Component(
    property = {
        JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/library-rest",
        JaxrsWhiteboardConstants.JAX_RS_NAME + "=library-rest"
    },
    service = Application.class
)
public class LibraryRestApplication extends Application {
}
