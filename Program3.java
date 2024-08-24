import java.util.*;
class Program3
{
public static void main(String args[])
{
int a,b,i,j;
int flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range between which we want to find the prime number:");
a=sc.nextInt();
b=sc.nextInt();
for(i=a;i<=b;i++)
 if (isPrime (i))
        System.out.println (i);
   }

   static boolean isPrime (int n)
   {
    if (n < 2)
       return false;
     for (int i = 2; i <= Math.sqrt(n); i++)
       {
      if (n % i == 0)
        return false;
       }
     return true;
   }
 }