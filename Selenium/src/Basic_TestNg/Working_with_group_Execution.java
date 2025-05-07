package Basic_TestNg;

import org.testng.annotations.Test;

public class Working_with_group_Execution {
	
	@Test(groups ="smoke")
	public void register()
	{
		System.out.println("Register");
	}
	@Test(groups ="system")
	public void login()
	{
		System.out.println("Login");
	}
	@Test(groups ="system")
	public void update()
	{
		System.out.println("Update");
	}
	
	@Test(groups ="smoke")
	public void delete()
	{
		System.out.println("delete");
	}
	
	@Test(groups ="integration")
	public void remove()
	{
		System.out.println("Remove");
	}
	




}
