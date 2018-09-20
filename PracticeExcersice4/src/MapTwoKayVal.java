import java.util.Map;

public class MapTwoKayVal {
    public Map<String,String> check(Map<String,String> input)
    {
        if(input.get("value1")!=null)
        {
            input.put("value2",input.get("value1"));
            input.put("value1",null);
        }
        return input;
    }
}
