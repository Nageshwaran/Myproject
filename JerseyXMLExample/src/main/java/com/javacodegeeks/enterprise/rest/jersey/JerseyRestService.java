package com.javacodegeeks.enterprise.rest.jersey;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;

import com.javacodegeeks.enterprise.rest.services.MessageService;

@Path("/xmlServices")
public class JerseyRestService {

	
	MessageService messageService = new MessageService();

	@POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public List<Result> getMessages(Student student) throws ClassNotFoundException, SQLException{
		return messageService.getAllMessages(student);
	
}
	
	@GET
	@Path("/sending")
	@Produces(MediaType.APPLICATION_XML)
	public List<Result> getInformation() throws ClassNotFoundException, SQLException{
		return messageService.getInformation();
	
}
}