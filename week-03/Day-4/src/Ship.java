import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

    List<Pirate> ship = new ArrayList<>();
    private int pirateOnBoard = 1;
    private Pirate captain;
    private boolean isWinnerShip;

    public Pirate getCaptain() {
        return captain;
    }

    public Ship(Pirate captain) {
        this.captain = captain;
    }


    public int getPirateOnBoard() {
        return ship.size()+1;
    }

    public void setPirateOnBoard(int change) {
        pirateOnBoard -= change;
    }


    public void setCaptainConsumedRum(int quantity) {
        captain.drinkMuchRum(quantity);
    }

    public boolean getIsWinnerShip() {
        return isWinnerShip;
    }

    public void setIswinnerShip(boolean isWinnerShip) {
        this.isWinnerShip = isWinnerShip;
    }


    public void fillShip() {
        Random random = new Random();
        int crewSize = random.nextInt(10 - 2 + 1) + 2;
        for (int i = 0; i < crewSize; i++) {
            ship.add(new Pirate(false));
            pirateOnBoard++;
        }
    }

    public boolean battle(Ship otherShip) {
        Random random = new Random();
        int crewAliveCurrentShip = getPirateOnBoard();
        int crewAliveOtherShip = otherShip.getPirateOnBoard();
        int currentCaptainConsumedRum = captain.getToxinLevel();
        int otherCaptainConsumedRum = otherShip.captain.getToxinLevel();
        if (crewAliveCurrentShip - currentCaptainConsumedRum > crewAliveOtherShip - otherCaptainConsumedRum) {
            isWinnerShip = true;

        } else if (crewAliveCurrentShip - currentCaptainConsumedRum < crewAliveOtherShip - otherCaptainConsumedRum) {
            isWinnerShip = false;
            otherShip.setIswinnerShip(true);
        } else {
            int decider = random.nextInt(2 - 1 + 1) + 1;
            isWinnerShip = decider == 1;
        }
        return isWinnerShip;
    }


    public static void afterBattle(Ship winnerShip, Ship loserShip) {
        Random random = new Random();
        int randomRum = random.nextInt(5 - 1 + 1) + 1;
        winnerShip.captain.drinkMuchRum(randomRum);
        int randomOtherloss = random.nextInt(loserShip.getPirateOnBoard() - 1 + 1) + 1;
        for (int i = 0; i < randomOtherloss - 1; i++) {
            loserShip.ship.get(loserShip.ship.size()-i-1).setDead(true);
        }
    }
}
