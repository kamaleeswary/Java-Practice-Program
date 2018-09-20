import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordStartAndEndIndexTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void wordcheck() {
        String expected="";
        WordStartAndEndIndex wordStartAndEndIndex=new WordStartAndEndIndex();
        assertEquals(expected,wordStartAndEndIndex.wordcheck("She sells seashells by the seashore","se"));
    }
}