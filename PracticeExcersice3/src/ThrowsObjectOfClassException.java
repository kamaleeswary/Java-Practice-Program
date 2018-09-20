import java.util.*;
public class ThrowsObjectOfClassException {
    public static void main(String[] args) {
       int a=10,b=30; try{
            if(a<30)
                a=b;
            throw  new Exception("If is not work");
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("reached finally");
        }
    }
}
