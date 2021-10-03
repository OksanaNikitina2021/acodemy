package objects;

public class Main {
    public static void main(String[] args) {

        Person john = new Person();
        john.setName("John");
        john.setSurname("Doe");
        john.setAge(20);
        john.setWeight(70.6);
        john.setHetero(true);

        john.retrieveInformation();

        System.out.println();

        Person andrey = new Person("Andrey", "Chebupelli");
        andrey.setAge(21);
        andrey.setWeight(60.3);
        andrey.setHetero(false);
        andrey.retrieveInformation();

        System.out.println();

        Person angelica = new Person("Angelica", "Varum", 52, 70.0, true);
        angelica.retrieveInformation();

        System.out.println();

        System.out.println(angelica);
    }
}
