package javaBasics;

// (((((10*3)+2)*4)-4)/2)

public class Arithmetic_2 
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
		Arithmetic_2 cal = new Arithmetic_2();
		int prod = cal.product(10, 3);
		int sum = cal.addition(prod, 2);
		int prod1 = cal.product(sum, 4);
		int diff = cal.difference(prod1, 4);
		cal.division(diff, 2);

	}

}
