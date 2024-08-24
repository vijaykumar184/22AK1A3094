import java.util.Scanner;
class A
{
	int i,j;
	void add(int a[][],int b[][],int c[][],int m,int n)
	{
		System.out.println("Addition of matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.print('\n');
		}
	}
	void sub(int a[][],int b[][],int c[][],int m,int n)
	{
		System.out.println("subtraction of matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.print('\n');
		}
	}
	void mul(int[][] a,int[][] b,int[][] c,int m,int n)
	{
		System.out.println("Multiplication of matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.print('\n');
		}
	}
	void trace(int a[][],int m,int n)
	{
		int sum=0;
		System.out.println("Trace of the matrix");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					sum+=a[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}
public class Program1
{
	public static void main(String args[])
	{
		int i,j;
		A d=new A();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no,of rows and columns");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("Enter the matrix A:");
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				 a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the matrix B:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		int [][] c=new int[m][n];
		d.add(a,b,c,m,n);
		d.sub(a,b,c,m,n);
		d.mul(a,b,c,m,n);
		d.trace(a,m,n);
	}
	
}