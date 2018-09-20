import java.util.*;
public class stringreverse {
    public static void main(String[] args) {
        String s,s1="";
        Scanner sc= new Scanner(System.in);
        s=sc.nextLine();
        char a[]=s.toCharArray();
        for (int i = a.length-1; i >=0; i--) {
            s1=s1+a[i];
        }
        System.out.println("The reverse string is "+s1);
    }
}
