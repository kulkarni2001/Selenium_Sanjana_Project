package Basic_TestNg;

import org.testng.annotations.Test;

public class Working_with_Test2_config extends Working_with_Config {
	@Test
	public void createAccount()
	{
		System.out.println("Create Account");
	}
	@Test
	public void delete()
	{
		System.out.println("Delete Account");
	}

}
