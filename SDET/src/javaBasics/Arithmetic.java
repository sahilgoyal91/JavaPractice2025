package javaBasics;

// (((((10+2)+2)-2)*2)/2)

public class Arithmetic 
{
	public int addition(int a,int b)
	{
		int c = a+b;
		return c;
	}
	
	public int difference(int a,int b)
	{
		int c = a-b;
		return c;
	}
	
	public int product(int a,int b)
	{
		int c = a*b;
		return c;
	}
	
	public void division(int a,int b)
	{
		int c = a/b;
		System.out.println("Result of expression is: "+ c);
	}
	
	public static void main(String[] args) 
	{
		Arithmetic cal = new Arithmetic();
		int sum = cal.addition(10, 2);
		int sum1 = cal.addition(sum, 2);
		int diff = cal.difference(sum1, 2);
		int prod = cal.product(diff, 2);
		cal.division(prod, 2);

	}

}
