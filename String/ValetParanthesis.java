import java.util.*;
public class ValetParanthesis {
    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++) 
            {
            char ch = str.charAt(i);
            if (ch == '(')
             {
                count++;
             } 
            else if (ch == ')') 
            {
             count--;
             if (count < 0)
             {
                    System.out.println("Invalid parentheses");
                    return;
                }
            }
        }
        if(count == 0)
          {
            System.out.println("Valid parentheses");
          } 
         else
          {
            System.out.println("Invalid parentheses");
          }
    }    
}
