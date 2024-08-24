import java.util.Scanner;
public class Program4
{
    public staic void main(String args[])
    {
        System.out.println("Enter a String:");
        String input=sc.nextLine();
        System.out.println("Reveresed words:"+reverseEachword(input));
    }
    public static Sring reverseEachWord(?Sring str)
    {
        String[] words=str.split("\\s"+);
        StringBuilder reversedString=new StringBuilder(word);
        for(String word:words)
        {
        reversedString.append(reversedword.reverse().toString()).append(" ");
        }
        return reversedstring.toString()trim();
    }

}