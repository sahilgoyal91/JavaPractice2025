package javaBasics;

public class Student 
{
	int age, rollno;
	public void Display1()
	{
		System.out.println("This is method Display1.");
	}
	public void Display2()
	{
		System.out.println("This is method Display2.");
	}

	public static void main(String[] args) 
	{
		Student Sahil = new Student();
		int x = Sahil.age;
		x = 34;
		int y = Sahil.rollno;
		y = 78;
		System.out.println("Age = " + x + " ; " + "Roll No. = " + y);
		Sahil.Display1();
		Sahil.Display2();
	}

}
