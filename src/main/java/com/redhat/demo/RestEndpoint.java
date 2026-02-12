package com.redhat.demo;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ejb.EJB;


@Path("/check")
public class RestEndpoint {

	@EJB
    PodCheck podCheck; // Injecting the EJB locally

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String check() {
        return "REST Gateway -> " + podCheck.getIdentity();
    }
}