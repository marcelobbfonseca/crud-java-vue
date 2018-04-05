package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dto.UserDTO;

@Path("/hello")
public class Hello {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/sayPlainText")
	public String sayPlainText() {
		return "Hello Jersey";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("/sayXMLHello")
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?> " + "<hello> Hello Jersey </hello>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/sayHTMLHello")
	public String sayHTMLHello() {
		return "<html> " + "<title>" + "Hello Jersey" + "</title>" + 
				"<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/sayAfonsoJSON")
	public Response sayAfonsoJSON() {
		UserDTO usuario = new UserDTO();
		usuario.setName("Afonso fonso");
		usuario.setAge(25);
		
		return Response.ok().entity(usuario).build();
	}
	
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/getUserJSON")
	public UserDTO getUserJSON() {
		UserDTO user = new UserDTO();
		user.setName("Afonso fonso");
		user.setAge(25);
		return user;
	}
	
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/createUser")
	public Response createUser(@PathParam("name") String name, @PathParam("age")  Integer age) {
		UserDTO user = new UserDTO(3,name,"generate@mail.com" , age);
		return Response.status(Status.CREATED).entity(user).build();
	}
	
	
	@PUT
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/updateUser")
	public Response updateUser(String name) {
		UserDTO user = new UserDTO(1,"name","mymail@mail.com" , 25);
		user.setName(name);
		return Response.accepted().entity(user).build();
	}
	
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/getUsers")
	public Response getUsers() {
		List<UserDTO> users = new ArrayList<UserDTO>();
		users.add(new UserDTO( 1,"John Snow","john@castleblack.com", 25));
		users.add(new UserDTO(2,"Pessoa","people@castleblack.com", 25));
		users.add(new UserDTO(3,"Arnaldo","naldo@mail.com", 25));
		return Response.ok().entity(users).build();
	}
	
	
	
}

