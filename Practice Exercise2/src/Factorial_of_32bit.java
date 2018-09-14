import java.util.*;
public class Factorial_of_32bit {
    public String factorialOf32bit(int num) {
        int number;String fact="";int temp=1;
       // Scanner sc=new Scanner(System.in);
        number=num;
        //int[] a=new int[100];
        for(int i=1;i<=number;i++)
        {
            temp=temp*i;
            fact=""+temp;

        }

        if(fact.length()<10)
       return fact;
        else
           return "out of range";
    }
}
