import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckString {
    public boolean check(String string,String pt) {
        Pattern p=Pattern.compile(pt);String str="";
        Matcher matcher = p.matcher(string);
        boolean found = false;
        while (matcher.find()) {
            str = str + matcher.group() + " ";
            found = true;
        }if(found==true)
        return found;
        else
            return found;
    }
}
