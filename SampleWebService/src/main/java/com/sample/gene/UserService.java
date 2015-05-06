package com.sample.gene;

public class UserService implements User {

	public String getName(UserDetailsData data) {
		// TODO Auto-generated method stub
		return data.firstName + data.lastName;
	}	
	

}
