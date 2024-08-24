import java.util.*;
public class Program5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        checkNumber(number);
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
            return true;
        }
        public static boolean isPalindrome(int n)
        {
            String str=Inteer.toString(n);
            String reversedStr=new StringBuilder(str).reverse().toString();
            return str.equals(reversedStr);
        }
        public static int nextPalindrome(int n)
        {
            n++;
            while(!isPalindrome(n))
            {
                n++;
            }
            return n;
        }
        public static void checkNumber(int n)
        {
            if(!isPrime(n))
            {
                System.out.println("not prime number");
            }
            else{
                System.out.println(nextPalindromw(n));
            }
        }
    }
}