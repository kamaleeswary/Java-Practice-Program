import java.util.*;
public class OccurenceOfCharecterInString {
    public  int StringCount(String s,String a){
        String str=s;
       // System.out.println("Length Of String:" + str.length());
      //  System.out.println("Length Of String Without a :" + str.replace("a", "").length());
        int charcount = str.length() - str.replaceAll(a, "").length();
        return charcount;
    }
}
