import java.util.*;
class Program6
{
    public static void main(String args[])
    {
        int a,b,sum=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is a armstrong number or not:");
        n=sc.nextInt();
        b=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            sum+=Math.pow(a, 3);
        }
        if(sum==b)
        {
            System.out.println("The given number "+b+" is a armstrong  number.");
        }
        else
        {
            System.out.println("The given number "+b+" is not a armstrong number.");
        }
    }
}