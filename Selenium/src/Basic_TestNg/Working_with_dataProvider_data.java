package Basic_TestNg;

import org.testng.annotations.DataProvider;

public class Working_with_dataProvider_data {
	@DataProvider(name="dataProvider")
	public Object[][] testData()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="qspider51@gmail.com";
		obj[0][1]="Qsp@1234";
		
		obj[1][0]="qspiders2596@gmail.com";
		obj[1][1]="Qsp@1234";
		
		obj[2][0]="qspjsp@gmail.com";
		obj[2][1]="Qsp@1234";
		
		return obj;
		
	}

}
