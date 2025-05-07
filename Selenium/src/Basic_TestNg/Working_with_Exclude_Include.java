package Basic_TestNg;

import org.testng.annotations.Test;

public class Working_with_Exclude_Include {
	@Test
	public  void login()
	{
		System.out.println("Login");
	}
	
	@Test
	public  void create()
	{
		System.out.println("Create");
	}
	
	@Test
	public  void update()
	{
		System.out.println("Update");
	}
	
	@Test
	public  void logout()
	{
		System.out.println("Logout");
	}

}
