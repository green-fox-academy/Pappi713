import java.util.Random;

public class Pirate {


    private int toxinLevel = 0;
    private boolean isSleep;
    private boolean isDead;
    private boolean isCaptain;

    public Pirate(Boolean isCaptain) {
        this.isCaptain = isCaptain;
    }

    public int getToxinLevel() {
        return toxinLevel;
    }

    public boolean getIsSleep() {
        return isSleep;
    }

    public void setSleep(boolean sleep) {
        isSleep = sleep;
    }

    public boolean getIsDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void drinkSomeRum() {
        if (isDead) {
            System.out.println("he's dead");
        } else {
            toxinLevel++;
        }

    }

    public void drinkMuchRum(int quantity) {
        if (isDead) {
            System.out.println("he's dead)");
        } else {
            toxinLevel += quantity;
        }
    }

    public void howsItGoingMate() {
        if (toxinLevel < 0 || toxinLevel <= 4) {
            System.out.println("Pour me anudder");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            isSleep = true;
        }
    }

    public void die() {
        isDead = true;
    }

    public void brawl(Pirate otherPirate) {
        Random random = new Random();
        if (!otherPirate.isDead && !isDead) {
            int roll = random.nextInt(3 - 1 + 1) + 1;
            if (roll == 1) {
                isDead = true;
            } else if (roll == 2) {
                otherPirate.isDead = true;
            } else {
                isDead = true;
                otherPirate.isDead = true;
            }
        }
    }

}
