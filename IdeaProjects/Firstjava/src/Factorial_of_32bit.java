import java.util.*;public class Factorial_of_32bit {
    public static void main(String[] args) {
        int number;String fact="";int ft=1;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        int[] a=new int[100];
        for(int i=1;i<=number;i++)
        {
            ft=ft*i;
            fact=""+ft;

        }

        if(fact.length()<10)
        System.out.println("The Factorial of "+number+" is "+fact);
        else
            System.out.println("The Factorial of "+number+" is out of range");
    }
}
