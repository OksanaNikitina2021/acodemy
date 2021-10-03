package practice.classroom;

public class MethodOverloading {
    public static void main(String[] args) {
        printInformation("Oksana");
        printInformation("John", 36);
        printInformation("Mike", 25, "Virgo");
    }

    public static void printInformation(String name){
        System.out.println("Your name is: " + name);
    }

    public static void printInformation(String name, int age){
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
    }

    public static void printInformation(String name, int age, String horoscopes){
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your horoscope is: " + horoscopes);
    }
}
