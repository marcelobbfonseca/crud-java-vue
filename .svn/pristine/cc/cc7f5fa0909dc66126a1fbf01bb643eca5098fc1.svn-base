package service;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import javax.ws.rs.core.Response;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dto.UserDTO;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

class HelloTest {
	private static Hello hello;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		hello = new Hello();
	}

	@Test
	@DisplayName("Check if method returns the string Hello Jersey")
	void helloJerseyString() {
		assertEquals("Hello Jersey", hello.sayPlainText());
	}
	
	@Test
	@DisplayName("Verify XML return output")
	void helloJerseyXML() {
		assertEquals("<?xml version=\"1.0\"?> " + "<hello> Hello Jersey </hello>", hello.sayXMLHello());
	}
	
	
	@Test
	@DisplayName("Verify HTML return output")
	void helloJerseyHTML() {
		assertEquals("<html> " + "<title>" + "Hello Jersey" + "</title>" + 
				"<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> "  , hello.sayHTMLHello());
	}
	
	
	@Test
	@DisplayName("Return Afonso user data")
	void afonsoUserData() {
		Response response = hello.sayAfonsoJSON();
		assertEquals( Response.Status.OK.getStatusCode(), response.getStatusInfo().getStatusCode() );
		UserDTO user = (UserDTO) response.getEntity();
		assertEquals(user.getName(), "Afonso fonso");
	}
	
	
	@Test
	@DisplayName("Creates user and Status response should be CREATED.")
	void createsUser() {
		Response response = hello.createUser("Mr. John", 30);
		UserDTO user = (UserDTO) response.getEntity();
		assertEquals(Response.Status.CREATED.getStatusCode(), response.getStatusInfo().getStatusCode());
		assertEquals(user.getName(), "Mr. John");
	}
	
	@Test
	@DisplayName("Update user and Status response should be ACCEPTED.")	
	void updateUser() {
		Response response = hello.updateUser("new name");
		UserDTO user = (UserDTO) response.getEntity();
		assertEquals(Response.Status.ACCEPTED.getStatusCode(), response.getStatusInfo().getStatusCode());
		assertEquals(user.getName(), "new name");
	}
	
	@Test
	@DisplayName("Return ArrayList of 3 users.")
	void getAllUsers() {
		Response response = hello.getUsers();
		
		@SuppressWarnings("unchecked")
		List<UserDTO> users = (ArrayList<UserDTO>) response.getEntity();
		assertEquals(users.size(), 3);
	}
		
	@Test
	@DisplayName("access an user from ArrayList.")
	void accessUsers() {
		Response response = hello.getUsers();
		@SuppressWarnings("unchecked")
		List<UserDTO> users = (ArrayList<UserDTO>) response.getEntity();
		assertEquals(users.size(), 3);
	}
	
	
}
