import java.util.*;


 class InitializeVariable
{    String Name;
    Scanner sc=new Scanner(System.in);
   double Salary;int Age;
    int setName()
    {
        Name=sc.nextLine();
        System.out.println(Name+"Member Name");
        return 0;
    }
    int setSalary()
    {
        Salary=sc.nextInt();
        System.out.println(Salary+"Member Salary ");
        return 0;
    }
    int setAge()
    {
        Age=sc.nextInt();
        System.out.println(Age+"Member Age");
        return 0;
    }


}
public class ObjectIntialize {

   public static void main(String[] args) {
       InitializeVariable  It=new InitializeVariable();
       It.setName();
       It.setSalary();
       It.setAge();

    }
}
