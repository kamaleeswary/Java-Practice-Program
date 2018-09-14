import java.util.*;

public class niteration {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(i+" ");
            }
        }

    }
}
