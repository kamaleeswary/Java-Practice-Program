import java.util.*;
public class StringCheck {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>64&&a[i]<91||a[i]>96&&a[i]<123){
            if(a[i]==97||a[i]==101||a[i]==105||a[i]==111||a[i]==117||a[i]==65||a[i]==69||a[i]==73||a[i]==79||a[i]==85)
            {
                System.out.println(a[i]+"is vowel");
            }
            else
            {
                System.out.println(a[i]+"Consonant");
            }

        }else
        {
            System.out.println("error it is a number");
        }
    }}
}
