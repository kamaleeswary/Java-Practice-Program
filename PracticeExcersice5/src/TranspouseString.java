import java.util.*;
class TranspouseString {
    public String reverse(String string) {
        String str=string;
        String[] order=str.split(" ");
        String result="";
        StringBuilder input1 = new StringBuilder();
        for(String str1:order)
        {
         for(int j=str1.length()-1;j>=0;j--){
             result=result+str1.charAt(j);
         }result=result+" ";
        }
        return result;

    }
}
