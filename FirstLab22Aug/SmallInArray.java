package firstLab;

import java.util.Scanner;
import java.util.Arrays;

public class SmallInArray 
{
	public static void main(String[] args) {
		int n,m,i,sm;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		m=sc.nextInt();
		System.out.print("Enter value of n: ");
		n=sc.nextInt();
		int a[]=new int[m];
		int b[]=new int[m];
		System.out.print("Enter elements: ");
		for(i=0;i<m;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		sm=a[n-1];
		System.out.println("nth smallest element in given array is "+sm);
	}
}
