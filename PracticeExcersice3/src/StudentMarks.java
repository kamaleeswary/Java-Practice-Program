public class StudentMarks {
   int numOfStudents;
   int[] stuGrades;int t=0;
    StudentMarks(int numOfStudents,int[] stuGrades){
       this.numOfStudents=numOfStudents;
       this.stuGrades=stuGrades;
   }
   public String checkGradeValue()
   {
       for(int i=0;i<stuGrades.length;i++) {
           if (stuGrades[i] >= 0 && stuGrades[i] <= 100) {
               System.out.println(" "+stuGrades[i]);
               t++;
           }
       }if(t!=stuGrades.length)
       {
           System.out.println("error");
               return "error";
       }
       else
           {
               System.out.println("true");
       return "true";
           }
   }
}
