import java.util.*;
class CalculatingMarks
{ int avg=0,min,max,sum=0,t;
    void Average(int a[])
    {

        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];

        }avg=sum/a.length;
        System.out.println("The Average is "+avg);

    }
    void Minimum(int a[])
    {min=a[0];
        for(int i=0;i<a.length;i++)
        {
           if(a[i]<min)
           {
               min=a[i];
           }

        }
        System.out.println("The Minimum is "+min);


    }
    void Maximum(int a[])
    {max=a[0];
        for(int i=0;i<a.length;i++)
        {
        if(a[i]>max)
            max=a[i];

        }
        System.out.println("The Maximum is "+max);

    }

}
public class StudentMarkValidation {
    public static void main(String[] args) {
        int no_of_students,t=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        no_of_students = sc.nextInt();
         int[] a=new int[no_of_students];
        for (int i = 0; i <no_of_students; i++) {
            System.out.println("Enter the grade for student "+t+":");

            a[i]=sc.nextInt();
t++;
        }CalculatingMarks cm=new CalculatingMarks();
        cm.Average(a);
        cm.Minimum(a);
        cm.Maximum(a);
    }
}