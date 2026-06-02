import java.util.*;
public class MinimumWindowSubstring
     {
    static boolean containsAll(String window, String target)
     {
        for (int i = 0; i < target.length(); i++) 
        {
            if (window.indexOf(target.charAt(i)) == -1)
                return false;
         }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter target string: ");
        String target = sc.nextLine();

        String minWindow = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);

                if (containsAll(sub, target)) {
                    if (minWindow.equals("") || sub.length() < minWindow.length()) {
                        minWindow = sub;
                    }
                }
            }
        }

        if (minWindow.equals(""))
            System.out.println("No window found");
        else
            System.out.println("Minimum Window Substring: " + minWindow);
    }
}

    

