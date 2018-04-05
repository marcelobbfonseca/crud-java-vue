package service;

import static org.junit.Assert.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RESTMainServiceTest {

	private static RESTMainService service;
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BEFORE");
		
		service = new RESTMainService();
	}

	@Test
	public void retornaStringTestNull() {
		String s = service.retornaString();
		
		assertNotNull(s);
	}
	
	@AfterAll
	public static void doAfter() {
		System.out.println("AFTER");
	}
	

}
