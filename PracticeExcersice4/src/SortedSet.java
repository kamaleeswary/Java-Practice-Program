import java.util.*;
public class SortedSet {
    public static void main(String[] args) {
        String str="Harry Olive Alice Bluto Eugene";
        String[] split=str.split(" ");
        Set<String> set=new HashSet<>();
        for(String s:split)
            set.add(s);
        TreeSet<String> sortedString=new TreeSet<>(set);
        System.out.println(sortedString);
    }}
