public class CoreJavaBrushUp3 {
    public static void main(String[] args) {
        //String is an object that represent sequence of characters
      //  String s = "Ivar Thorun Raga";

        //new - the value will be stored in the object variable
        String s2 = new String("Welcome");
        String s3 = new String("Welcome"); //create a space in java memory
        // no matter if the Strings have the same value, because it is explicit that I created a new object in two memory spaces

        //break that string in three peaces
        String s1 = "Ivar Thorun Raga"; //string is an object, to access the method I have to explicit the object >> s1.method

        //if I split the array in three peaces, I need to create a string object, because of the index
        String[] splittedString = s1.split(" ");
        System.out.println(splittedString[0]); //Ivar
        System.out.println(splittedString[1]); //Thorun
        System.out.println(splittedString[2]); //Raga

        String[] splittedString2 = s1.split("Thorun");
        System.out.println(splittedString2[0]); //Ivar
        System.out.println(splittedString2[1]); //Raga
        System.out.println(splittedString2[1].trim()); //will remove left and right spaces




        // String s1 = "Ivar Thorun Raga"
        // will break the string in characters like: I v a r   T h o r u n ...
        for(int i = 0; i < s1.length() ; i++) {
            //As this isn't an array
            System.out.println(s1.charAt(i));
        }

        // String s1 = "Ivar Thorun Raga"
        //to print in the reverse
        // int i = s1.length() >>> start from 0
        // int i = s1.length() - 1 >>> start from the end
        // i-- >>> the trim will start from the end
        for(int i = s1.length() - 1; i >= 0 ; i--) { //i >= 0 it will be true when I reach 0, from the reverse to the beginning
            //As this isn't an array
            System.out.println(s1.charAt(i)); //a g a R   n u r o h T r  r a v I
        }


        /*
        How to create String into different types
        How to trim the String into an array with index
        How to access a specific object
        How to trim from the beginning and from the end

        */
    }
}
