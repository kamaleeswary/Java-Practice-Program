import java.util.*;

public class Firstjava {
    public static void main(String[] args) {
        int n,rev,rev1=0,n1,i,k=0,sum=0;
    Scanner sc=new Scanner(System.in);
        n=sc.nextInt();i=n;
        int a[]=new int[50];
               while(n>0)
               {
                   rev=n%10;
                   if(rev%2==0)
                   {
                       a[k]=rev;
                       k++;
                   }
                   rev1=rev1*10+rev;
                   n=n/10;
               }if(i==rev1)
        {
            while(k>=0)
            {
                sum=sum+a[k];
                k--;
            }

            if(sum>25)
                System.out.println("The given number"+i+" is pallindrom and the sum of even number is greater than 25");
            else
                System.out.println("The given number"+i+" is pallindrom and the sum of even number is NOT greater than 25");

        }
        else
        System.out.println("The given number is not pallindrom");
                }
                }
