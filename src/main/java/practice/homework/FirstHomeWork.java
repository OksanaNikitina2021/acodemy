package practice.homework;

public class FirstHomeWork {

    public static void main(String[] args) {
        //Primitive type - Integer
        int numberOfStudentsEconomyFaculty = 57;
        int numberOfEventParticipants = 205;
        int yearOfBirth = 1984;
        int yearOfGraduate = 2004;
        int numberOfPeopleInQueue = 7;
        String primitiveTypeInteger = String.format("Primitive type Integer: %d, %d, %d, %d, %d",
                numberOfStudentsEconomyFaculty,
                numberOfEventParticipants,
                yearOfBirth,
                yearOfGraduate,
                numberOfPeopleInQueue);
        System.out.println(primitiveTypeInteger);

        //Primitive type - double
        double budgetOfProject = 215500.55;
        double piNumber = 3.14159265359;
        double roomAreaInSquareMeters = 125.77;
        double totalAmountOfPurchase = 1058.99;
        double speedOfCar = 55.7;
        String primitiveTypeDouble = String.format("Primitive type Double: %.2f; %.11f; %.2f; %.2f; %.2f",
                budgetOfProject,
                piNumber,
                roomAreaInSquareMeters,
                totalAmountOfPurchase,
                speedOfCar);
        System.out.println(primitiveTypeDouble);

        //Primitive type - float
        float distanceFromRigaToDaugavpils = 226.92F;
        float marathonDistance = 42.2F;
        float julyAverageTemperature = 17.7F;
        float mobilePhonePrice = 650.70F;
        float priceOfComputer = 1800.50F;
        String primitiveTypeFloat = String.format("Primitive type Float: %.2f; %.2f; %.2f; %.2f; %.2f",
                distanceFromRigaToDaugavpils,
                marathonDistance,
                julyAverageTemperature,
                mobilePhonePrice,
                priceOfComputer);
        System.out.println(primitiveTypeFloat);

        //Primitive type - Boolean
        boolean isJavaFun = true;
        boolean isAppleTasty = false;
        boolean isTestPassed = true;
        boolean isCarColorBlack = false;
        boolean isPhoneCheaperThanPC = true;
        String primitiveTypeBoolean = String.format("Primitive type Boolean: %s; %s; %s %s; %s",
                isJavaFun,
                isAppleTasty,
                isTestPassed,
                isCarColorBlack,
                isPhoneCheaperThanPC);
        System.out.println(primitiveTypeBoolean);

        //String and information about me
        String myName = "Oksana";
        String myLastName = "Nikitina";
        String currentLivingCity = "Riga";
        String currentWorkPlace = "Banka Citadele";
        String currentEveningClass = "Test Automation";
        String myStory = String.format("My name is %s %s. " +
                "Curently I am living in %s and working for %s. " +
                "On Tuesdays and Thursdays evenings I am participating in %s training.",
                myName, myLastName, currentLivingCity, currentWorkPlace, currentEveningClass);
        System.out.println(myStory);
    }
}
