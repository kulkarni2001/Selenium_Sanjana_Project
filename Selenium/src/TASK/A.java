package TASK;

public class A {
	public static void main(String[] args) {
		String s = "1000";
		int a = Integer.parseInt(s);
		System.out.println(a);
		
		String p1="₹22,999";
		String p2="₹64,999";
		String p3="₹17,999";
		p1=p1.replaceAll("[^0-9]", "");
		p2=p2.replaceAll("[^0-9]", "");
		p3=p3.replaceAll("[^0-9]", "");
		
		int price1=Integer.parseInt(p1);
		int price2=Integer.parseInt(p2);
		int price3=Integer.parseInt(p3);
		
		System.out.println(price1+"  "+price2+"  "+price3);
		
		if(price1>price2 && price3>price2)
		{
			System.out.println(price2);
		}else if(price1>price3)
		{
			System.out.println(price3);
		}else
		{
			System.out.println(price1);
		}
		
	}
}
