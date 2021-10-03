package practice.homework;

import java.util.Arrays;

public class SecondHomeWork {
    public static void main(String[] args) {
        //1 task
        /*
        Если переменная типа int = 10, выведите на экран: “Integer value is 10”
         */
        int number = 10;
        if(number == 10){
            System.out.printf("Integer value is %s\n", number);
        }
        else{
            System.out.println("Entered number is not 10.");
        }


        //2 task
        /*
         В переменной типа int хранится любое число от 18 до 65.
         Скидку в химчистке можно получить группе лиц от 18-21 лет в размере 10 процентов.
         Группе лиц от 22 до 65 лет можно получить скидку в размере 15%.
         Группе лиц от 65 можно получить скидку в размере 20%.
         Написать программу необходимо таким образом, чтобы изменяя значения переменной,
         можно было бы попасть в определенную группу и получить сообщение на экран о том,
         в какой возрастной группе вы находитесь и на какую скидку можете расчитывать.
         */
        int age = 65;
        if(age >=18 && age<=21){
            System.out.println("You get 10% discount.");
        }
        else if(age > 21 && age < 65){
            System.out.println("You get 15% discount.");
        }
        else if(age > 64) {
            System.out.println("You get 20% discount.");
        }
        else{
            System.out.println("Discount is not available.");
        }

        //3 task
        /*
        Создать массив String и добавить в него 10 наименований животных.
        Пройтись циклом по массиву, найти и распечатать любого животного.
         */
        String[] animalArray = {"Camel", "Zebra", "Tiger", "Giraffe", "Monkey", "Dog", "Cat", "Lion", "Horse", "Panda"};
        //System.out.println(Arrays.toString(animalArray));
        for(int i = 0; i < animalArray.length; i++) {
            if (animalArray[i].equals("Dog")) {
                System.out.println("I found dog.");
                //System.out.println(animalArray[5]);
            }
        }

        //4 task
        /*
        Создать массив с числами от 0 до 10 и распечатать только не четные числа.
         */
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int oddNumber = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2 != 0){
                oddNumber = numbers[i];
                System.out.println("Odd number: " + oddNumber);
            }
        }

        //5 task
        /*
        Предположим что мы хотим выбрать транспортное средство на котором сегодня поедем в офис.
        Транспортом может быть (машина, автобус, такси и т.д)
        Относительно значения, которое храниться в переменной используя оператор switch
        научить программу выводить на экран то, каким образом планируете добраться до работы.
         */
        String transport = "Helicopter";
        switch (transport){
            case "Bus":
                System.out.println("Today you will get to the office by bus.");
                break;
            case "Car":
                System.out.println("Today you will get to the office by car.");
                break;
            case "Motorcycle":
                System.out.println("Today you will get to the office by motorcycle.");
                break;
            case "Bicycle":
                System.out.println("Today you will get to the office by bicycle.");
                break;
            case "Train":
                System.out.println("Today you will get to the office by train.");
                break;
            case "Scooter":
                System.out.println("Today you will get to the office by scooter.");
                break;
            case "Taxi":
                System.out.println("Today you will get to the office by taxi.");
                break;
            case "Tram":
                System.out.println("Today you will get to the office by tram.");
                break;
            default:
                System.out.println("No match has been found.");
        }

        //6 task
        /*
        Распечатать на экране числа от 1 до 100.
         */
        for(int i = 1; i <=100; i++){
            System.out.println(i);
        }

        //7 task
        /*
        Распечатать на экране числа от 50 до 1
         */
        for(int i = 50; i >= 1; i--){
            System.out.println(i);
        }

        //8 task
        /*
         Распечатайте на экране таблицу умножения.
         */
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "  ");
            }
            System.out.println("");
        }
    }
}
