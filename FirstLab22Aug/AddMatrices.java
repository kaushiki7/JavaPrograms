package firstLab;

import java.util.Scanner;

public class AddMatrices {

	public static void main(String[] args) {
		int n,m,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dimensions of matrices: ");
		m=sc.nextInt();
		n=sc.nextInt();
		int f[][]=new int[m][n];
		int s[][]=new int[m][n];
		int sum[][]=new int[m][n];
		System.out.println("Enter elements of 1st matrix: ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				f[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements of 2nd matrix: ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				s[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				sum[i][j]=f[i][j]+s[i][j];
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	
	}
}
