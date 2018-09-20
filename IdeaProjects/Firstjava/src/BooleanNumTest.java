import java.io.*;
import java.util.*;
class EvenNumTest
{
    public static boolean isEven(int number)
    {
        if(number%2==0)
            return true;
        else
            return false;
    }
}
public class BooleanNumTest {
    public static void main(String[] args) {
       EvenNumTest et=new EvenNumTest();
       int n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
        System.out.println(et.isEven(n));

    }
}
