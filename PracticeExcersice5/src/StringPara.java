import java.util.*;
public class StringPara {
    public String sortPara(String str) {
        String[] order=str.split(" ");
        Arrays.sort(order);
        String result="";
       // List<String> ls=new ArrayList<>();
        for(String s:order){
            result=result+s+" ";
            }result.trim();
            return result;
    }
}
