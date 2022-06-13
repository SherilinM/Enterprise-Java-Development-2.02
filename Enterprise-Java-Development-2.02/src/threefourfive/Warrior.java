package threefourfive;

public class Warrior extends Player {

    public Warrior(String name, int health, int strength, int lives) {
        super(name, health, strength, lives);
        int healthIncrease = 100;
        setInitHealth(getHealth() + healthIncrease);
        setHealth(getInitHealth());
    }
}