package practice;

public class PrimitiveType {

    public static void main(String[] args) {
        //Double primitive type practice
        /*
        Comments
         */

        double doubleMinValue = Double .MIN_VALUE;
        System.out.println(doubleMinValue);

        double doubleMaxValue = Double .MAX_VALUE;
        System.out.println(doubleMaxValue);

        double doubleValue = 1337.13;
        System.out.println(doubleValue);

        float floatMinValue = Float.MIN_VALUE;
        System.out.println(floatMinValue);

        float floatMaxValue = Float.MAX_VALUE;
        System.out.println(floatMaxValue);

        float floatValue = 100.13F;
        System.out.println(floatValue);

        int minIntValue = Integer.MIN_VALUE;
        System.out.println(minIntValue);

        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(maxIntValue);

        int firstVariable = 200;
        int secondVariable = 400;

        System.out.println(Integer.max(firstVariable, secondVariable));

        //Method call
        printHelloWorld();

        //String
        String myName = "Oksana";
        String lastName = "Nikitina";
        //String nameAndLastName = myName + lastName;
        System.out.println(myName + " " + lastName);
        System.out.printf("%s %s\n", myName, lastName);

        String nameAndLastName = String.format("%s %s\n", myName, lastName);
        System.out.println(nameAndLastName);

        boolean isStudent = true;
    }
    //Method declaration
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }
}
