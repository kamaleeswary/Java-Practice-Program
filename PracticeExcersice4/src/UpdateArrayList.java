import java.util.*;public class UpdateArrayList {
    public static void main(String[] args) {
        List<String> arrayList=new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");
        System.out.println(arrayList);
        arrayList.remove(0);
        arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.add(0,"Kiwi");
        arrayList.add(2,"Mango");
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);


    }
}
