import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanNumTestTest {
    BooleanNumTest booleanNumTest;
    @Before
    public void setUp() throws Exception {
        booleanNumTest=new BooleanNumTest();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
     public void BooleanNumTest()
    {
        //arrenge
        boolean expected1=true;
        boolean expected2=false;

        //act
        boolean result1=booleanNumTest.isEven(2);
        boolean result2=booleanNumTest.isEven(3);

        //assert
        assertEquals(expected1,result1);
        assertEquals(expected2,result2);
    }
}