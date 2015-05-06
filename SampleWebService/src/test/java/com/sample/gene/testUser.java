package com.sample.gene;

import org.junit.Test;

public class testUser extends ExampleServiceTests {
	
private UserService service = new UserService();
	
	@Test
	public void test()throws Exception {
		UserDetailsData data = new UserDetailsData();
		data.firstName="Satish";
		data.lastName="Kumar";
		assertEquals("SatishKumar", service.getName(data));
	}

}
