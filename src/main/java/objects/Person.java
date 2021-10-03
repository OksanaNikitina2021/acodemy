package objects;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Slf4j
public class Person {

    private String name;
    private String surname;
    private int age;
    private double weight;
    private boolean isHetero;

    public void retrieveInformation() {
        log.info("Name is: {} Surname is: {} Age is: {} Weight is: {} Is hetero: {}",
                name, surname, age, weight, isHetero);
        //System.out.printf("Name is: %s\n Surname is: %s\n Age is: %d\n Weight is: %f\n Is hetero: %s\n",
        //        name, surname, age, weight, isHetero);
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}
