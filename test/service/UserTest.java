package service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dto.UserDTO;

public class UserTest {
	
	private static UserService userService;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		userService = new UserService();
	}
	
	@Test
	@DisplayName("get all users as an ArrayList.")
	void retrieveUsers() {
		Response response = userService.getUsersJSON();
		@SuppressWarnings("unchecked")
		List<UserDTO> users = (ArrayList<UserDTO>) response.getEntity();
		assertEquals(users.size(), 2);
	}
	
}
