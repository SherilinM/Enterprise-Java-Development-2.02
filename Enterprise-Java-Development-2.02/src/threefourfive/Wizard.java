package threefourfive;

public class Wizard extends Player {

    public Wizard(String name, int health, int strength, int lives) {
        super(name, health, strength, lives);
        int strengthIncrease = 10;
        setStrength(getStrength() + strengthIncrease);
    }
}