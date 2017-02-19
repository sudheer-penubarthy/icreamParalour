package com.services;

import com.entity.Employees;
import com.impl.EmployeeOperations;
import org.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Class for icreamParalour project
 * Created by sudheer on 19/2/17.
 */
@Path ( "/employee" )
public class EmployeeServices {

    @GET
    @Path ("/getEmployee/id={id} ")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getEmployee(@PathParam ( "id" ) String id){
        EmployeeOperations employeeOperations = new EmployeeOperations ();
        Employees emp = employeeOperations.getEmployee ( id );
        JSONObject jsonObject = new JSONObject (  );
        jsonObject.put ( "name" , emp.getLastName ());
        return Response.status(200).entity(jsonObject.toString ()).build();
    }

}
