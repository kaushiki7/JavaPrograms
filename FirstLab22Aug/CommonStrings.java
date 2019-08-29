package firstLab;

import java.util.Scanner;

public class CommonStrings
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n;
		int i,j;
		String c[];
		System.out.print("Enter size of array1: ");
		m=sc.nextInt();
		String a[]=new String[m];
		System.out.print("Enter size of array2: ");
		n=sc.nextInt();
		String b[]=new String[n];
		System.out.print("Enter elements in array1: ");
		for(i=0;i<m;i++)
		{
			a[i]=sc.next();
		}
		System.out.print("Enter elements in array2: ");
		for(i=0;i<n;i++)
		{
			b[i]=sc.next();
		}
		if(m>=n)
			c=new String[n];
		else 
			c=new String[m];
		for(i=0;i<m;i++)
		{	
			for(j=0;j<n;j++)
			{	
				if(a[i].equals(b[j]))
				{	
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
