package javaBasics;

/* 3 parameter constructor
 * default
 * one parameter
 * two parameter
 */

public class Constructor_Basics 
{
	public Constructor_Basics()
	{
		this(1,2,3);
		System.out.println("This is default constructor");
	}
	public Constructor_Basics(int a)
	{
		this();
		System.out.println("This is 1 parameterized constructor");
	}
	public Constructor_Basics(int a,int b)
	{
		this(1);
		System.out.println("This is 2 parameterized constructor");
	}
	public Constructor_Basics(int a,int b,int c)
	{
		System.out.println("This is 3 parameterized constructor");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Constructor_Basics constr = new Constructor_Basics(1,2);

	}

}
