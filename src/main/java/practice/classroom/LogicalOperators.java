package practice.classroom;

public class LogicalOperators {
    public static void main(String[] args) {

        //Conditional statement
        //operator: if
        //switch

       /*
        boolean isStudent = true;
        //Boolean variable expression
        if (isStudent) {
            System.out.println("He can ask for ISIC card.");
        }
        else {
            System.out.println("The person is not a student.");
        }
        */

        //boolean result = 10 > 0;
        //InLine Expression
        if(10 > 0){
            System.out.println("Yes, 10 > 0");
        }

        int x = 10;
        int y = 20;
        if (x > y){
            System.out.println("x = 10 and y = 20, 10 greater then 20");
        }
        else{
            System.out.println("10 is less then 20");
        }

        /*
        if(condition) {
        //code
        }
         */

        //logical operators OR AND
        // || - OR
        // && - AND

        int speedMercedes = 40;
        int speedBmw = 50;
        int speedPorche = 200;
        //int speedMcLaren = 200;
        if(speedBmw > speedMercedes && speedBmw > speedPorche){
            System.out.println("Yes, bmw speed is greater than mercedes and greater than porche");
        }
        else{
            System.out.println("Something went wrong");
        }

        boolean isStudent = true;
        boolean isLecturer = false;
        if (isLecturer){
            System.out.println("Yes, this person is a lecturer");
        }
        else if(isStudent){
            System.out.println("Yes, this is student");
        }
        else{
            System.out.println("GTFO");
        }

        //operator: switch
        int ukSize = 6;
        int euSize;
        switch (ukSize) {
            case 6:
                euSize = 39;
                System.out.println("EU size: " + euSize);
                break;
            case 7:
                euSize = (int) 40.5;
                System.out.println("EU size: " + ukSize);
                break;
            default:
                System.out.println("Cannot find proper size");
        }

        int dayOfTheWeek = 13;
        switch (dayOfTheWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This value is not correct: " +dayOfTheWeek);
        }
        //System.getProperty("default.browser") returns Chrome (default.browser = chrome)
        System.setProperty("default.browser", "chrome");
        String currentBrowserName = System.getProperty("default.browser");

        switch (currentBrowserName){
            case "chrome":
                System.out.println("Here we will setup chrome browser configuration");
                break;
            case "firefox":
            case "opera":
                System.out.println("Here we will setup firefox/opera browser configuration");
                break;
            default:
                System.out.println("Browser with current name does not exist: " + currentBrowserName);
        }
    }
}
