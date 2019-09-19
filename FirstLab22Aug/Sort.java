/*1. Write a Java program to sort a numeric array and a string array.*/

import java.util.*;

public class Sort 
{
	public static void main(String[] args){
		int n,s; //size of arrays
		int a[]; 
		String b[];
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of integer array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.print("Enter size of string array: ");
		s=sc.nextInt();
		b=new String[s];
		System.out.println("Enter elements into integer array\n");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter elements into string array\n");
		for(int i=0;i<s;i++)
		{
			b[i]=sc.next();
		}
		Arrays.sort(a);
		System.out.println("After sorting integer array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		Arrays.sort(b);
		System.out.println("\nAfter sorting string array: ");
		for(int i=0;i<s;i++)
		{
			System.out.print(b[i]+" ");
		}	
	}	
}
