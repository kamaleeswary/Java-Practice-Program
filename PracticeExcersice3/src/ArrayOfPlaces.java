import java.util.*;
public class ArrayOfPlaces {
    public static void main(String[] args) {
      int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of places ");
        n=sc.nextInt();
        String[] places=new String[n];String str="";
        for(int i=0;i<n;i++) {
            places[i] = sc.next();

        }
        for(int i=0;i<n;i++) {
           places[i] =places[i].replaceAll("[aeiou]", "");
        }
            for(int j=0;j<places.length;j++)
            {
                System.out.println("Place Name without Vowels:"+j+" "+places[j]);

            }
        }

    }

