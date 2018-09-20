import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromSringNumberTest {
PallindromSringNumber pallindromStringNumber;
    @Before
    public void setUp() throws Exception {
        pallindromStringNumber=new PallindromSringNumber();
    }


    @After
    public void tearDown() throws Exception {
    }

    /**
     * To Check the input is reversed and pallindrom
     * the input may be a string as well as a number
     */
    @Test
    public void PallindromSringNumbertest()
    {
        /* arrange */
        String expected1="palindrom";
        String expected2="not palindrom";
        String expected3="palindrom";
        String expected4="not palindrom";
        //act
        String result1=pallindromStringNumber.checkPalindrom("232");
        String result2=pallindromStringNumber.checkPalindrom("132");
        String result3=pallindromStringNumber.checkPalindrom("malayalam");
        String result4=pallindromStringNumber.checkPalindrom("inputcheck");
        //assert
        assertEquals(expected1,result1);
        assertEquals(expected2,result2);
        assertEquals(expected3,result3);
        assertEquals(expected4,result4);
    }
}