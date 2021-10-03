package practice.classroom;

public class LoopPractise {
    public static void main(String[] args) {
        //loop statement
        //for

        /*
        for(statement 1; statement 2; statement 3){
        code block to be executed
        }
        statement 1 - is executed (one time)
        Initialize counter variable: (int i = 0);

        statement 2 - define the condition for executing the code block
        Boolean condition
        Element list = 10
        i < 10;

        statement 3 - is executed (every time) after the code block has been executed
        Increment/Decrement counter variable
         */

        for(int i = 0; i < 10; i++){
            System.out.println("Hello world");
            //i = 0;
            //i < 10 (true)
            //code is executed

            //i = 1;
            //i < 10 (true)
            //code is executed

            //.....
            //i = 10
            //10 < 10 (false)
            //stop loop
        }

        String[] names = {"Oksana", "Max", "Alex", "John", "Max"};

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i < numbers.length; i++){
            //System.out.println(numbers[i]);
            if(numbers[i] > 4){
                System.out.println(numbers[i]);
            }
            else {
                System.out.println("Number is less then 4: " + numbers[i]);
            }
        }

        for (int i = 0; i < names.length; i++) {
            if(names[i].equals("Max")){
                System.out.println("I found Max");
            }
        }

        for(String name : names){
            //System.out.println(name);
            if(names.equals("Max")){
                System.out.println("Found Max");
            }
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 4){
                System.out.println(numbers[i]);
            }
            else if(numbers[i] < 4){
                System.out.println("Number is less then 4: " + numbers[i]);
            }
        }

        for(int i = numbers.length-1; i >= 0 ; --i){
            System.out.println(numbers[i]);
        }
    }
}
