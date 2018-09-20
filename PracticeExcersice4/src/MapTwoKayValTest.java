import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapTwoKayValTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void check() {
       // MapTwoKayVal mapTwoKayVal=new MapTwoKayVal();
        Map<String,String> expected=new HashMap<>();
        expected.put("value1"," ");
        expected.put("value2","hello");

        Map<String,String> input=new HashMap<>();
        input.put("value1","hello");
        input.put("value2","map");
        MapTwoKayVal mapTwoKayVal=new MapTwoKayVal();
        Map<String,String> result=mapTwoKayVal.check(input);
    }
}