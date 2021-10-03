package practice.classroom;

public class LoopSecondPractice {
    public static void main(String[] args) {

        /*
        //condition - true/false
        while(condition){
        //code block
        counter update
        }
         */

        int i = 1;
        while(i < 10) {
            System.out.println("Hello world");
            i++;
        }

        boolean isStudent = false;
        while(!isStudent){
            System.out.println("Is not the student");
            isStudent = true;
        }

        String[] animals = {"cat", "dog", "elephant", "panda", "monkey"};
        boolean isFound = false;
        while(!isFound){
            for (String animal: animals){
                if(animal.equals("panda")){
                    System.out.println("Panda found");
                    isFound = true;
                }
            }
        }

        int x = 5;
        while(x >= 0){
            System.out.println(x);
            x--;
        }

        for(int y = 5; y >= 0; y--){
            System.out.println(y);
        }

        // --y уменьшает i на 1, а затем дает значение 4
        // y-- дает значение 5, и только потом уменьшает на 1

        int[] nums = {30, 10, 20, 10, 40}; //110
        int b = 0;
        int sum = 0;
        while(b < nums.length){
            sum += nums[b];
            b = b + 1;
        }
        System.out.println("Sum of the numbers: " + sum);

        /*
        do {
        // do something
        } while (condition)
         */

        int counter = 20;
        do{
            System.out.println("Current number is:" + counter);
            counter--;
        }
        while (counter > 0);
    }
}
