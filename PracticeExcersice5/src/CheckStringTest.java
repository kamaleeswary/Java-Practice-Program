import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckStringTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        boolean expected=true;
        CheckString checkString=new CheckString();
        boolean result=checkString.check("i am Harry","Harry");
        assertEquals(expected,result);

    }
}