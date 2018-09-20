import java.util.*;
public class Factorial_of_64bit {
    public String factorialOf64bit(int num) {
        int number;String fact="";long ft=1;
       // Scanner sc=new Scanner(System.in);
        number=num;
      //  int[] a=new int[100];
        for(int i=1;i<=number;i++)
        {
            ft=ft*i;
            fact=""+ft;

        }

        if(fact.length()<20)
            return fact;
        else
            return "out of range";
    }
}
