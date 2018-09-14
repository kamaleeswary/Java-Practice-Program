import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n= Integer.parseInt(sc.nextLine());
        if(n%2==0&&n>20&&n<30)
        {
            System.out.println("Jerry");
        }else  if(n%2!=0&&n>20&&n<30)
        {
            System.out.println("Tom");
        }
    }
}
