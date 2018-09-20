import java.util.*;
public class PallindromSringNumber {
    public String checkPalindrom(String input) {
        String s=input;
       // Scanner sc = new Scanner(System.in);
     //   s = sc.nextLine();
        char a[] = s.toCharArray();
        int t, t1, c = 0, l = a.length - 1, rev, rev1 = 0;
        t1 = a.length / 2;
        t = a.length - (t1);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < t1; j++) {
                for (int k = a.length - 1; k > t1; k--) {
                    if (a[j] == a[k]) {
                        // System.out.println(a[k]+" ");
                        a[k] = '\0';
                        c++;
                    }

                }
            }
        }
       // System.out.println(a.toString());
        if ((c + 1) == t)
            return "palindrom";
        else
            return "not palindrom";
    }
}