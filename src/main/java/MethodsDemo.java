/*
    why method? if I have code that I want to reuse many times,
    what I can do is to wrap that length of code in one block
    And I can call that block - this is a method


    public static void main(String[] args) {
        what is inside here will be executed
    }



    To declare a method without running this method (just on demand), Java won't let to create
    any method inside the psvm

    To declare a Method:
*/


public class MethodsDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MethodsDemo callTheMethod = new MethodsDemo();
        callTheMethod.getData(); // this is the method inside the class MethodsDemo
        String name = callTheMethod.getData(); //will get the String that I returned inside the method: Kelly
        System.out.println(name);
        //it will return Hello World then Kelly

        //To access the method in another class if it is public, like MethodsDemo2 --> getUserData
        MethodsDemo2 objectIWantToDefine = new MethodsDemo2();
//        objectIWantToDefine.getUserData();
        String userData = objectIWantToDefine.getUserData();
        System.out.println(userData);

        String ivar = getData2();
        System.out.println(ivar);


    }

        // if it is public void <>, the method will return anything. It should return a String, Int, etc.
        public static String getData() {
            System.out.println("Hello World");
            return "Kelly";
        }

        //To access this method without creating an object like in the lines 23 to 26, it is necessary to mark the method as Static
        //So this will belong to the class MethodsDemo
        public static String getData2() {
            System.out.println("Thorun");
            return "Ivar";
        }
}
