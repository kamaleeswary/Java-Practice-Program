import java.util.*;
public class nonincrement {
    public static void main(String[] args) {
        int sum=0,t;
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {

                    t=a[i];
                    a[i]=a[j];
                    a[j]=(char)t;
                }

            }
        } for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
            if (a[i] % 2 == 0) {
                sum = sum + Character.getNumericValue(a[i]);
            }
        }
      if(sum>15)
        {
            System.out.println("sum of even numbers is "+sum+" its greater than 15 ,so its true");
        }else
        {
            System.out.println("sum of even numbers is "+sum+" its less than 15 ,so its false");
        }


    }
}
