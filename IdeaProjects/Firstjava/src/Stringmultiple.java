import java.util.*;
public class Stringmultiple {
    public static void main(String[] args) {
        String s,s1=""; int n,t;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
         n=sc.nextInt();
        char a[]=s.toCharArray();
         t=(a.length-1)-n;
        if(a.length>n) {
            for (int i = a.length-1; i > t; i--) {
                 s1=s1+a[i];
            } char b[]=s1.toCharArray();
            for(int j=0;j<n;j++){
            for (int i = b.length-1; i >= 0; i--) {

                s=s+b[i];

            }}
            System.out.println(s);
        }
        else
        {
            System.out.println("Please enter the valid integer");
        }
    }
}
