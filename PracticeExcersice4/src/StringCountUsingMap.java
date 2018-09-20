import java.util.*;
public class StringCountUsingMap {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        String[] words = str.split(",| |-|@|\\*|\\?|_");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int count;
        for (String word : words) {
            if (map.get(word) == null) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        System.out.println(map);




    }
}