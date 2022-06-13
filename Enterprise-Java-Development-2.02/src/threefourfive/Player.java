package threefourfive;

public class Player {
    private String name;
    private int health;
    private int initHealth;
    private int strength;
    private int lives;

    public Player(String name, int health, int strength, int lives) {
        this.name = name;
        this.health = health;
        initHealth = health;
        this.strength = strength;
        this.lives = lives;
    }

    public int reduceLive() {
        if (lives > 0) {
            lives -= 1;
            health = initHealth;
        }
        return lives;
    }

    public void attackPlayer(Player player) {
        player.setHealth(player.getHealth() - strength);
        player.checkHealth();
    }

    public static Player transformToElf(Player player) {
        if (player instanceof Warrior) {
            return new Elf(player.getName(), player.getHealth() - 100, player.getStrength(), player.getLives());
        }
        if (player instanceof Wizard) {
            return new Elf(player.getName(), player.getInitHealth(), player.getStrength() - 10, player.getLives());
        }
        return player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void checkHealth() {
        if (this.health <= 0) {
            reduceLive();
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getInitHealth() {
        return initHealth;
    }

    public void setInitHealth(int initHealth) {
        this.initHealth = initHealth;
    }
}