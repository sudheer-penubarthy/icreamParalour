package com.services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Class for icreamParalour project
 * Created by sudheer on 16/2/17.
 */
@Path ( "/customer" )
public class CustomerServices {

    @Path ( "/viewMenu" )
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response viewMenu(){
        String result = "This is the menu";
        return Response.status(200).entity(result).build();
    }

    @POST
    @Path ( "/addItem/item={item}" )
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addItem(@PathParam ( "item" ) String item){
        String result = "Added item "+item;
        return Response.status(200).entity(result).build();
    }
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path ( "/editItem/item={item}/qty={qty}" )
    @Consumes(MediaType.APPLICATION_JSON)
    public Response editItem(@PathParam ( "item" ) String item, @PathParam ( "qty" ) int qty){
        String result="edited item"+item+" and qty "+qty;
        return Response.status ( 200 ).entity ( result ).build ();
    }

}
