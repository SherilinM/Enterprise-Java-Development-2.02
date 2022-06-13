package threefourfive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
    Player playerA;
    Player playerB;
    Player playerC;

    @BeforeEach
    public void setUp() {
        playerA = new Warrior("Andres", 200, 20, 5);
        playerB = new Elf("Isabela", 200, 20, 5);
        playerC = new Wizard("Grey", 200, 20, 5);
    }

    @Test
    void reduceLiveNoneLiveReducedByOne() {
        Assertions.assertEquals(2, playerA.reduceLive());
    }

    @Test
    void reduceLiveNoneLiveReducedUntilZero() {
        Assertions.assertEquals(2, playerA.reduceLive());
        Assertions.assertEquals(playerA.getInitHealth(), playerA.getHealth());
        Assertions.assertEquals(1, playerA.reduceLive());
        Assertions.assertEquals(0, playerA.reduceLive());
        Assertions.assertEquals(0, playerA.reduceLive());
    }

    @Test
    void reduceLiveNoneRestoreHealth() {
        playerA.setHealth(100);
        playerA.reduceLive();
        Assertions.assertEquals(playerA.getInitHealth(), playerA.getHealth());
    }

    @Test
    void attackPlayerNoneHealthReduced() {
        System.out.println("Player A has " + playerA.getStrength() + " strength points.");
        System.out.println("Player B has " + playerB.getHealth() + " health points.");
        int healthReduction = playerB.getHealth() - playerA.getStrength();
        playerA.attackPlayer(playerB);
        Assertions.assertEquals(healthReduction, playerB.getHealth());
    }


    @Test
    void transformToElfWarriorElf() {
        Player playerATransformed = Player.transformToElf(playerA);
        Assertions.assertTrue(playerATransformed instanceof Elf);
        Assertions.assertEquals(playerB.getInitHealth(), playerATransformed.getInitHealth());
        Assertions.assertEquals(playerA.getName(), playerATransformed.getName());
        Assertions.assertEquals(playerB.getHealth(), playerATransformed.getHealth());
        Assertions.assertEquals(playerA.getLives(), playerATransformed.getLives());
    }

    @Test
    void transformToElfWizardElf() {
        Player playerCTransformed = Player.transformToElf(playerC);
        Assertions.assertTrue(playerCTransformed instanceof Elf);
        Assertions.assertEquals(playerB.getInitHealth(), playerCTransformed.getInitHealth());
        Assertions.assertEquals(playerC.getName(), playerCTransformed.getName());
        Assertions.assertEquals(playerB.getHealth(), playerCTransformed.getHealth());
        Assertions.assertEquals(playerC.getLives(), playerCTransformed.getLives());
    }

    @Test
    void transformToElfElfElf() {
        Player playerBTransformed = Player.transformToElf(playerB);
        Assertions.assertTrue(playerBTransformed instanceof Elf);
        Assertions.assertEquals(playerB.getInitHealth(), playerBTransformed.getInitHealth());
        Assertions.assertEquals(playerB.getName(), playerBTransformed.getName());
        Assertions.assertEquals(playerB.getHealth(), playerBTransformed.getHealth());
        Assertions.assertEquals(playerB.getLives(), playerBTransformed.getLives());
    }

    @Test
    void checkHealthNoneHealthReducedAndLiveReduced() {
        int initLives = playerB.getLives();
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        playerA.attackPlayer(playerB);
        Assertions.assertEquals(playerB.getInitHealth(), playerB.getHealth());
        Assertions.assertEquals(initLives - 1, playerB.getLives());
    }
}