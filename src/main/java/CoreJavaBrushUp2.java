import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {
        //Arrays

        int[] arr2 = {1,2,3,4,5,6,7,8,9,535,86786,324};

        //2,3,4,6, 8, 86786, 324
        //only evens numbers
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
            } else {
                System.out.printf("It is an odd number: %d%n", arr2[i]);
            }
        }

        List<String> name = new ArrayList<String>(); //is another class in Java6
        // a. I can acess the methods inside the ArrayList class
        name.add("Kelly");
        name.add("Ivy");
        name.add("Nala");
        name.add("Ivar");
        name.add("Thorun");
        name.remove(2);
        System.out.println(name.get(1));

        for(int i = 0; i < name.size() ; i++){
            System.out.println(name.get(i));
        }
        System.out.println("*****************");
        for ( String val: name) {
            System.out.println((val));
        }

        //check if item is present in ArrayList, this method is only in ArrayList
        System.out.println(name.contains("Kelly")); //true

        String[] names = {"Kelly", "Ivy", "Nala", "Ivar", "Thorun"};
        List<String> namesArrayList = Arrays.asList(names);
        System.out.println(namesArrayList.contains("Ivar"));
    }






}
