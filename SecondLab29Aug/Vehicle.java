import java.util.Scanner;

/*(4). Write a Java program that has a base class called Vehicle. Each Vehicle
has two properties (private data members) registration number and number
of wheels. Write methods to set and get these data members. Inherit three
subclasses from this class to represent buses, cars, and three-wheelers. For
each subclass find two unique properties and define data members to denote
these properties, and also define methods to set and get these properties. Your
program should make use the keywords this, and super.*/

public class Vehicle {
	long reg_no;
	int no_of_wheels;
	Scanner sc=new Scanner(System.in);
	public void set(long reg,int w)
	{
		this.reg_no=reg;
		this.no_of_wheels=w;
	}
	public void get()
	{
		System.out.println("Registration number is "+this.reg_no);
		System.err.println("Number of wheels is "+this.no_of_wheels);
	}
}

class Buses extends Vehicle{
	
	
}
class Cars extends Vehicle{
	
}
class ThreeWheelers extends Vehicle{
	
}

