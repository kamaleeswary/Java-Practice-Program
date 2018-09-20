import java.util.*;

class InitializeVariable
{   String Name;
    Scanner sc=new Scanner(System.in);
   double Salary;int Age;
    String setName()
    {
      Name=sc.nextLine();

        return Name;
    }
    double setSalary()
    {
        Salary=sc.nextInt();

        return Salary;
    }
    int setAge()
    {
       Age=sc.nextInt();

        return Age;
    }


}
public class ObjectIntialize {

    public static void main(String[] args) {
        InitializeVariable  It=new InitializeVariable();
        System.out.println("Member Name "+It.setName());
        System.out.println("Member Salary "+It.setSalary());
        System.out.println("Member Age "+It.setAge());
    }
}
