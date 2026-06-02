import java.util.*;
public class GroupAnagram {
    
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String word : arr) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        System.out.println("Grouped Anagrams:");
        for (ArrayList<String> group : map.values()) {
            System.out.println(group);
        }
    }
}
    

