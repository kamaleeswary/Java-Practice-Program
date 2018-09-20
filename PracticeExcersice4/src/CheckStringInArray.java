import java.util.*;
public class CheckStringInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] a=new String[]{"a","b","c","d","a","c","c"};
        Map<String,Boolean> map=new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        for (String word : a) {
            if (map1.get(word) == null) {
                map1.put(word, 1);
            } else {
                map1.put(word, map1.get(word) + 1);
            }
        }
        System.out.println(map1);int i=2;
        Set<String> keys = map1.keySet();
        for(String key: keys){
            if(map1.get(key)>2)
map.put(key,true);
            else
                map.put(key,false);}
            System.out.println(map);


    }
}
