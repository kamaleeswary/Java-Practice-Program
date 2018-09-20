import static org.junit.Assert.*;

public class StudentMarksTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void checkGradeValue() {
        //arrange
        String expected="true";
        String expected1="error";
        //act
        StudentMarks studentMarks=new StudentMarks(1, new int[]{50});
        StudentMarks studentMarks1=new StudentMarks(2, new int[]{-50,20});
       // String result=studentMarks.checkGradeValue();
        //assert
        assertEquals(expected,studentMarks.checkGradeValue());
        assertEquals(expected1,studentMarks1.checkGradeValue());
    }
}