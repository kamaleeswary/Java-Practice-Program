import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Factorial_of_64bitTest {
    Factorial_of_64bit factorial_of_64bit;
    @Before
    public void setUp() throws Exception {
        factorial_of_64bit=new Factorial_of_64bit();
    }


    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void  Factorial_of_64bit()
    {
        //arrenge
        String expected1="720";
        String expected2="out of range";
        //act
        String result1=factorial_of_64bit.factorialOf64bit(6);
        String result2=factorial_of_64bit.factorialOf64bit(21);

        //assert
        assertEquals(expected1,result1);
        assertEquals(expected2,result2);
    }
}