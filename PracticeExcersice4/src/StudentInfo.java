import java.util.*;
public class StudentInfo {
    public void implement() {
        List<Student> fruits = new ArrayList<>();
        Student f1 = new Student(20, 1, "selvi");
        Student f2 = new Student(18, 2, "Anjali");
        Student f3 = new Student(20, 3, "selvi");
        Student f4 = new Student(19, 4, "Rupinder");
        fruits.add(f1);
        fruits.add(f2);
        fruits.add(f3);
        fruits.add(f4);
        Collections.sort(fruits,new StudentSorter());
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Name = " + fruits.get(i).getName() + "; Age: " + fruits.get(i).getAge() + "; Stuid " + fruits.get(i).getStuid());
        }
        System.out.println();
        System.out.println();
       /* Collections.sort(fruits, Student::compareTo1);
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Name = " + fruits.get(i).getName() + "; Age: " + fruits.get(i).getAge() + "; Stuid " + fruits.get(i).getStuid());
        }
        System.out.println();
        System.out.println();
        Collections.sort(fruits, Student::compareTo2);
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Name = " + fruits.get(i).getName() + "; Age: " + fruits.get(i).getAge() + "; Stuid " + fruits.get(i).getStuid());*/
    }


    public static void main(String[] args) {

        new StudentInfo().implement();
    }

    public class Student {

        private int age;
        private String name;
        private int stuid;

        public Student() {
        }

        public Student(int age, int stuid, String name) {

            this.stuid = stuid;
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setStuid(int stuid) {
            this.stuid = stuid;
        }

        public int getStuid() {
            return stuid;
        }
    }

    class StudentSorter implements Comparator<Student> {
        public int compare(Student o, Student o1) {

            if ((o.getName().compareTo(o1.getName()) != 0)) {
                return o.getName().compareTo(o1.getName());
            }
            else {
                if ((o.getAge() - (o1.getAge())) != 0) {
                    return o.getAge() - (o1.getAge());
                }
                else
                    return o.getStuid() - (o1.getStuid());
                }
//

            }

        }
    }


/*int stuid;
        String name;
        int age;
StudentInfo(int age,int stuid,String name)
{
    this.stuid=stuid;
    this.age=age;
    this.name=name;
}
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public int getStuid() {
        return stuid;
    }
}
class StudentSorter implements Comparator<StudentInfo>
{

    @Override
    public int compare(StudentInfo studentInfo1 ,StudentInfo studentInfo2) {
        return studentInfo1.name.compareTo(studentInfo2.name.toString());
    }
}
class StudentSorter1 implements Comparator<StudentInfo>
{

    @Override
    public int compare(StudentInfo studentInfo1 ,StudentInfo studentInfo2) {
        return studentInfo1.stuid - studentInfo2.stuid;
    }
}class StudentSorter2 implements Comparator<StudentInfo>
{

    @Override
    public int compare(StudentInfo studentInfo1 ,StudentInfo studentInfo2) {
        return studentInfo1.age - studentInfo2.age;
    }
}
class Maintest{
    public static void main(String[] args) {
    StudentInfo studentInfo1=new StudentInfo(19,1,"kamal");
        StudentInfo studentInfo2=new StudentInfo(20,2,"selvi");
        StudentInfo studentInfo3=new StudentInfo(19,3,"kamal");
        StudentInfo studentInfo4=new StudentInfo(18,4,"anbu");
        StudentInfo studentInfo5=new StudentInfo(17,5,"sakthi");
        List<StudentInfo> stulist=new ArrayList<StudentInfo>();
        stulist.add(studentInfo1);
        stulist.add(studentInfo2);
        stulist.add(studentInfo3);
        stulist.add(studentInfo4);
        stulist.add(studentInfo5);*/
       /* HashSet<String> set = new HashSet<String>();
        Collections.sort(stulist, new StudentSorter());

        System.out.println("\nSorted by id");
        for (int i=0; i<stulist.size(); i++)
            System.out.println(stulist.get(i).name);
        //System.out.println(stulist);

        Collections.sort(stulist, new StudentSorter1());

        System.out.println("\nSorted by id");
        for (int i=0; i<stulist.size(); i++)
            System.out.println(stulist.get(i).stuid);

        Collections.sort(stulist, new StudentSorter2());
        System.out.println("\nSorted by age");
        for (int i=0; i<stulist.size(); i++)
            System.out.println(stulist.get(i).age);

    }}*/