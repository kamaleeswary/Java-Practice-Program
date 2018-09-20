import static org.junit.Assert.*;

public class OccurenceOfCharecterInStringTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void stringCount() {
        //act
        int expected=3;
        //arrenge
        OccurenceOfCharecterInString occurenceOfCharecterInString=new OccurenceOfCharecterInString();
       int result= occurenceOfCharecterInString.StringCount("hi i am kamalee","a");
        //assert
        assertEquals(expected,result);
    }

}