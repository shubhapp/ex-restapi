package com.mmt.shubh.rest.providers;

import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Created by Subham Tyagi
 * On 8/7/2015.
 * <p>
 * TODO: Add class comments
 */
@Provider
@Slf4j
public class ExpenseManagerExceptionMapper implements ExceptionMapper<Exception> {

    @Context
    HttpHeaders httpHeaders;

    @Inject
    ExceptionMapperDeligator mDeligator;

    @Override
    public Response toResponse(Exception exception) {

        log.debug("Responding with this exception" + exception.getMessage());
        if (exception.getClass().equals(javax.ws.rs.WebApplicationException.class)) {
            javax.ws.rs.WebApplicationException e = (javax.ws.rs.WebApplicationException) exception;
            return Response
                    .status(e.getResponse().getStatus())
                    .entity(e.getMessage())
                    .type(httpHeaders.getMediaType())
                    .build();
        } else if (exception.getClass().equals(com.fasterxml.jackson.core.JsonParseException.class)) {
            return Response.status(400)
                    .entity("Invalid Input")
                    .type(httpHeaders.getMediaType())
                    .build();
        } else if (exception.getClass().equals(NotFoundException.class)) {
            return Response
                    .status(Response.Status.NOT_FOUND)
                    .entity("Resource Not Found")
                    .type(httpHeaders.getMediaType())
                    .build();
        } else if (exception.getClass().equals(BadRequestException.class)) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity("Invalid Request")
                    .type(httpHeaders.getMediaType())
                    .build();
        } else {
            return mDeligator.deligateException(exception);
        }
    }
}
