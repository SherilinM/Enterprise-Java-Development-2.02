package threefourfive;

import threefourfive.Player;

public class Elf extends Player {

    public Elf(String name, int health, int strength, int lives) {
        super(name, health, strength, lives);
        int healthIncrease = 50;
        setInitHealth(getHealth() + healthIncrease);
        setHealth(getInitHealth());
        int strengthIncrease = 5;
        setStrength(getStrength() + strengthIncrease);
    }
}