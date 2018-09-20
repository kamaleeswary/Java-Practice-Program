
import java.util.*;
public class SeriesOfSevenDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] a=new int[]{ 98,96,95,94,93};
int last=a[a.length-1];
int first=a[0],t=first;int temp=0;
        for(int i=0;i<a.length;i++)
        {
            if(first<last)
            {
                //System.out.println("first");
            for (int j = first; j < first + a.length; j++)
            {
                if (a[i] == j)
                {
                    temp++;
                    System.out.println(a[i] + " " + t);
                }

        }}else
            {
               // System.out.println("second");
                for (int j = first; j > first - a.length; j--)
                {
                    if (a[i] == j)
                    {
                        temp++;
                      //  System.out.println(a[i] + " " + t);
                    }

                }
            }
            }
        if(temp==a.length){
            for(int i=0;i<a.length;i++)
            {
            System.out.print(a[i]+" ");
            }
            System.out.println(" are consecutive numbers");
        }else
        {
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println(" are non-consecutive numbers");
        }
    }
}
