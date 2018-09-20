public class Exception {
    public static void main(String[] args) {
     try{   int[] a=new int[]{1,2,3};
    String s=null;
     a[5]=3;
     int[] b=new int[-1];}
     catch (NullPointerException e)
     {
         System.out.println(e.getMessage());
     } catch (ArrayIndexOutOfBoundsException e)
     {
         System.out.println(e.getMessage());
     } catch (NegativeArraySizeException e)
     {
         System.out.println(e.getMessage());
     }
}}
