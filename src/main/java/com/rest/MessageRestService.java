package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

//http://localhost:8080/RESTfulExample/rest/message/hello%20world

@Path("/message")
public class MessageRestService {

	public String msg1 = "this is a restful example by NP the ";
	
		@GET
		@Path("/{param}")
		public Response printMessage(@PathParam("param") String msg) {	

	
		
			String result = "a simple Restful example for James Thompson: " + msg1 + " " + msg;

			return Response.status(200).entity(result).build();

	}

}













//when run copy into address bar at the end rest/message/mkyong or rest/message/hello%20world

//resource from http://www.mkyong.com/webservices/jax-rs/resteasy-hello-world-example
//url is either http://localhost:8080/RESTfulExample/rest/message/hello%20world .......... or.......http://localhost:8080/RESTfulExample/rest/message/mykong

//run on tomcat server7.0