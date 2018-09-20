import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordStartAndEndIndex {
    public String wordcheck(String str1, String pt) {

        StringJoiner st=new StringJoiner(" ");
        Pattern p = Pattern.compile("str1 se");
        String str = "";
        int t = 0, t1 = 0;
        Matcher matcher = p.matcher("pt");
        while (matcher.find()) {
            t = matcher.start();
            t1 = matcher.end();
            System.out.println("Found at: "+t + " - " + t1);
        }
        System.out.println(str);
return str;
    }
}