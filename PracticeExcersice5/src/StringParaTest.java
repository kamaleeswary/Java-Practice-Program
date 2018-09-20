import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StringParaTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortPara() {
      String expected=  "alphabetical hi is order program string the this ";
      StringPara stringPara=new StringPara();
        assertEquals(expected,stringPara.sortPara("hi this is the string alphabetical order program"));
    }
}