import java.util.*;
public class LongSubStringWithoutRepeatChar {
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            String temp = "";

            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (temp.indexOf(ch) != -1) {
                    break;
                }

                temp = temp + ch;

                if (temp.length() > longest.length()) {
                    longest = temp;
                }
            }
        }

        System.out.println("Longest substring: " + longest);
        System.out.println("Length: " + longest.length());
    }
}
    

