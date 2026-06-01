import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
            r=r+s.charAt(i);
        }
        if(s.equals(r))
        {
            System.out.println(s+" is a palindrome");
        }
        else
        {
            System.out.println(s+" is not a palindrome");
        }
    }
    
}
