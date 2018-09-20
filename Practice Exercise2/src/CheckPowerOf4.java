import java.util.*;
import java.math.*;
public class CheckPowerOf4 {
    public String validatingPowerOfFour(int number){
        double n,n1;int t=0;
       // Scanner sc=new Scanner(System.in);
        n=number;
        for(int i=1;i<n;i++){
        n1=Math.pow(4,i);
        if(n1==n){t++;
            }}
   if(t==1)

       return  "The given number is power of 4";

   else
    return "The given number is NOT a power of 4";


    }
}
