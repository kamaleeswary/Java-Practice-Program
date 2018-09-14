import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPowerOf4Test {
    CheckPowerOf4 checkPowerOf4;
    @Before
    public void setUp() throws Exception {
        checkPowerOf4=new CheckPowerOf4();
    }

    @After
    public void tearDown() throws Exception {
    }


    /**
     * To Check the input is power of four or not
     */

    @Test
    public void validatingPowerOfFourtest()
    {
        //arrange
        String expected="The given number is power of 4";
        String expected1="The given number is NOT a power of 4";

        //act
        String result=checkPowerOf4.validatingPowerOfFour(16);
        String result1=checkPowerOf4.validatingPowerOfFour(8);

        //assert
        assertEquals(expected,result);
        assertEquals(expected1,result1);
    }
}