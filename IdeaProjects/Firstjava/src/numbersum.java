import java.util.*;
public class numbersum {
    public static void main(String[] args) {
        int[] a = new int[5];
        int i = 0, sum = 0,n;
        Scanner sc = new Scanner(System.in);
        int k = a.length;
        while ((n=sc.nextInt()) !=0)  {

            if(n>64&&n<91||n>96&&n<123)
            {
                System.out.println("Its String ERROR");
            }
            else
                sum=sum+n;

        }
        System.out.println("sum of the numbers is "+sum);
        }
    }
