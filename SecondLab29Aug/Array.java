/*Write a Java program that tests all important methods (two variants of add
and remove methods, set, get, indexOf, contains methods) of ArrayList class.
Test your program with user input and strings.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		ArrayList<String> alphabets = new ArrayList<String>();
		int n,i;
		String rem;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number of elements you want in array list: ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
			alphabets.add(sc.next());
		//alphabets.add("A");
		//alphabets.add("B");
		//alphabets.add("C");
		//alphabets.add("D");
		//alphabets.add("E");
		System.out.println("Array formed: "+alphabets);
		System.out.print("Enter string you want to remove: ");
		rem=sc.next();
		alphabets.remove(rem); 
		System.out.println("After removing string "+rem+": "+alphabets);
		System.out.println("Index of D is "+alphabets.indexOf("D"));
		System.out.println("Alphabets contains C: "+alphabets.contains("C"));
		System.out.println("Alphabets contains D: "+alphabets.contains("D"));
		alphabets.set(2,"F");
		System.out.println("After adding F at position 2: "+alphabets);
		System.out.println("Alphabet at position 1: "+alphabets.get(1));
	}
}
