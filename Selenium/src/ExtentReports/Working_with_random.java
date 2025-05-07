package ExtentReports;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Working_with_random {
	public static void main(String[] args) {
		Random r=new Random();
		int num = r.nextInt(200);
		System.out.println(num);
		
		String date=LocalDate.now().toString().replace("-", "");
		System.out.println(date);
		
		String time=LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(",", "");
	
		System.out.println(time);
	}

}
