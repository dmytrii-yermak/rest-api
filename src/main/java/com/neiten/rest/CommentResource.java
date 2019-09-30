package com.neiten.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/comments")
public class CommentResource {
    SomeService service;


    @Inject
    public void setService(SomeService service) {
        this.service = service;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Comment> getComments() {

        service.doMethod();

        return Arrays.asList(
                Comment.builder().text("comment1").build(),
                Comment.builder().text("com33333").build());
    }
}
