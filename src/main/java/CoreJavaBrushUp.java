public class CoreJavaBrushUp {
    public static void main(String[] args) {
        //Arrays
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;

        int[] arr = {1,2,3,4,5}; // another form to declare
//        System.out.println(arr[0]); //1

        //to print all the values
        // arr.length = 5
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[] color = {"blue", "yellow", "red", "purple", "green"};

//        for(int i = 0; i < color.length; i++) {
//            System.out.println(color[i]);
//        }

        //another form to do the same thing above
        for(String s: color) {
            System.out.println(s);
        }

    }
}
