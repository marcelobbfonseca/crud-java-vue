package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dao.UserDAO;
import dto.UserDTO;
@Path("/users")
public class UserService {
	
	private UserDAO userDao;
	
	
	public UserService() {
		userDao = new UserDAO();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/getUsers")
	public Response getUsersJSON() {
		
		List<UserDTO> users = new ArrayList<UserDTO>();
		
		users = userDao.getUsers();
		
		return Response.ok().entity(users).build();
		
		
	}
}
