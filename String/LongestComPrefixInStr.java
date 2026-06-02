import java.util.*;
public class LongestComPrefixInStr {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String result = "";

        int min = Math.min(str1.length(), str2.length());

        for (int i = 0; i < min; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                result = result + str1.charAt(i);
            } else {
                break;
            }
        }

        System.out.println("Common Prefix: " + result);
    }
}
