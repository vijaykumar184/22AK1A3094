import java.util.*;
class Program2
{
	public static void main(String args[])
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
			sum+=i;
			}
		}
		System.out.println("The value of sum is "+sum);
		if(sum==n)
		{
			System.out.println(n+" is a perfect number, as sum of the factors is equal "+n);
		}
		else if(sum<n)
		{
			System.out.println(n+" is a deficit number, as sum of the factors is less than "+n);
		}
		else
		{
			System.out.println(n+" is a abundant number, as sum of the fctors is greater than "+n);
		}
	}
}