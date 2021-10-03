package practice.homework.ThirdHomeWork;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j

public class Animal {

    private String nickname;
    private int animalAge;
    private double animalWeight;
    public int energyCount = 4;
    private boolean isSleeping;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    public void retrieveInformation() {
        log.info("Nickname is: {}. Animal age is: {}. Animal weight is: {}.",
                nickname, animalAge, animalWeight);
    }

    public boolean checkEnergy() {
        boolean check = true;
        if (energyCount == 0) {
            log.warn("{} energy level is 0. Animal need to be feeded.",
                    nickname);
            check = false;
        }
        return check;
    }

    public void goToSleep() {
        if (!isSleeping) {
            isSleeping = true;
            log.info("{} went to sleep.",
                    nickname);
        } else {
            log.info("{} is sleeping now.",
                    nickname);
        }
    }

    public void wakeUp() {
        if (isSleeping) {
            isSleeping = false;
            log.info("{} is woken up.",
                    nickname);
        }
    }

    public void goToEat() {
        if (energyCount == 4) {
            log.info("{} energy is full. Animal should not be feeded.",
                    nickname);
        } else {
            energyCount = 4;
            log.info("{} energy is restored. Animal current energy level is: {}.",
                    nickname, energyCount);
        }
    }

    public void goToPlay() {
        if (checkEnergy()) {
            if (!isSleeping) {
                energyCount--;
                log.info("{} went to play.",
                        nickname);
            } else {
                log.info("{} is sleeping now. Please wake up the animal.",
                        nickname);
            }
        }
    }

    public void goToWalk() {
        if (checkEnergy()) {
            if (!isSleeping) {
                energyCount--;
                log.info("{} went to walk.",
                        nickname);
            } else {
                log.info("{} is sleeping now. Please wake up the animal.",
                        nickname);
            }
        }
    }

    public void goToTrain() {
        if (checkEnergy()) {
            if (!isSleeping) {
                energyCount--;
                log.info("{} went to train.",
                        nickname);
            } else {
                log.info("{} is sleeping now. Please wake up the animal.",
                        nickname);
            }
        }
    }
}
