import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TranspouseStringTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() {
        String expected="ih siht si eht gnirtS lacitebahpla redro margorp ";
        TranspouseString transpouseString=new TranspouseString();
        String result=transpouseString.reverse("hi this is the String alphabetical order program");
        assertEquals(expected,result);
    }
}