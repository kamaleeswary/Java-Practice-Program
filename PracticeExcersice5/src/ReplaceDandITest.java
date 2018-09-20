import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceDandITest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void replace() {
        //act
        String expected="faity fry";

        //arrenge
        ReplaceDandI replaceDandI=new ReplaceDandI();
        String result=replaceDandI.replace("daily dry");
        //assert
        assertEquals(expected,result);
    }
}