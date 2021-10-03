package practice.classroom;

import java.util.Arrays;

public class ArrayPractise {
    public static void main(String[] args) {
        //arrays
        //data type
        //[]
        //name

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int firstNumber = numbers[0];
        System.out.println(firstNumber);

        int[] arrayOfNumbers = new int[3]; //empty array for 3 numbers
        arrayOfNumbers[0] = 1;
        arrayOfNumbers[1] = 2;
        arrayOfNumbers[2] = 3;
        System.out.println(Arrays.toString(arrayOfNumbers));

        String[] names = {"Oksana", "John", "Marcus", "Andrew"};
        System.out.println(names[1]);

        String[] emptyArray = new String[4];
        emptyArray[0] = "Nicole";
        emptyArray[1] = "Max";
        emptyArray[2] = "John";
        emptyArray[3] = "Alex";
        System.out.println(Arrays.toString(emptyArray));

        boolean[] booleanArray = {true, false, false, true};
        boolean isAutumn = booleanArray[0];
        boolean isHotOutside = booleanArray[1];
        System.out.printf("Outside is quite hot: %s", isHotOutside);
    }
}
