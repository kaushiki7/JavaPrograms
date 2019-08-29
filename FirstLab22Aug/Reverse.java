/*(2). Write a Java program to reverse an array of integers.*/
package firstLab;

import java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args){
		int n; //size of arrays
		int a[],b[]; 
		int i,j;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size of integer array: ");
		n=sc.nextInt();
		a=new int[n];
		b=new int[n];
		System.out.println("Enter elements into integer array\n");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=n-1,j=0;i>=0;i--,j++)
		{
			b[j]=a[i];
		}
		System.out.print("\nReversed array: ");
		for(i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}	
	}
}
