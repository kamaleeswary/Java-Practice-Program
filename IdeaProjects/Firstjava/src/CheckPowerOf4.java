import java.util.*;
import java.math.*;
public class CheckPowerOf4 {
    public static void main(String[] args) {
        double n,n1;int t=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<n;i++){
        n1=Math.pow(4,i);
        if(n1==n){t++;
            }}
   if(t==1)
   {
       System.out.println("The given number "+n+" is power of Four");
   }
   else
   {
       System.out.println("The given number "+n+" is NOT power of Four");
   }
    }
}
