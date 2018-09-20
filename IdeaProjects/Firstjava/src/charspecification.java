import java.util.*;
public class charspecification {
    public static void main(String[] args) {
        char s;
        Scanner sc = new Scanner(System.in);

        while ((s = sc.next().charAt(0)) != 0) {
            if ((s > 64) && (s < 91)) {
                System.out.println(s + " is  a Capital Letter");
            } else if (s > 96 && s < 123) {
                System.out.println(s + " is a Small Letter");
            } else if (s > 32 && s < 48 || s > 57 && s < 65 || s > 90 && s < 97 || s > 122 && s < 126) {
                System.out.println(s + " is a Special Charecter");
            } else {
                System.out.println(s + " is a Number");
            }
        }
    }
}