package practice.homework.ThirdHomeWork;

import java.util.Random;

public class Execution {

    public static void main(String[] args) {

        Animal dog = new Animal("Torus");
        dog.setAnimalAge(3);
        dog.setAnimalWeight(15.7);

        Animal cat = new Animal("Funtik");
        Animal wolf = new Animal();
        Animal parrot = new Animal("Kesha");
        Animal turtle = new Animal("Leonardo");
        Animal hamster = new Animal("Fomka");

        Animal[] animalArray = {dog, cat, wolf, parrot, turtle, hamster};
        Random randomizerAnimal = new Random();
        int animalLimit = animalArray.length - 1;

        Random randomizerAction = new Random();
        int actionLimit = 6;

        for (Animal animal : animalArray
        ) {
            animal.retrieveInformation();
        }

        for (int i = 0; i < 10; i++) {
            int randomAnimalIndex = randomizerAnimal.nextInt(animalLimit);
            int randomActionIndex = randomizerAction.nextInt(actionLimit);

            makeAction(animalArray[randomAnimalIndex], randomActionIndex);
        }
    }

    private static void makeAction(Animal animal, int randomActionIndex) {
        switch (randomActionIndex) {
            case 0:
                animal.checkEnergy();
                break;
            case 1:
                animal.goToSleep();
                break;
            case 2:
                animal.wakeUp();
                break;
            case 3:
                animal.goToPlay();
                break;
            case 4:
                animal.goToWalk();
                break;
            case 5:
                animal.goToTrain();
                break;
            case 6:
                animal.goToEat();
                break;
        }
        if (animal.energyCount == 0) {
            animal.checkEnergy();
            animal.goToEat();
        }
        if(animal.isSleeping() && randomActionIndex != 1){
            animal.wakeUp();
        }
    }
}
