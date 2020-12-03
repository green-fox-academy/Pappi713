import java.util.ArrayList;
import java.util.List;

public class Armada {

    List<Ship> ships = new ArrayList<>();
    private int sizeOfArmada;
    private boolean isWinner;

    public void setWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }

    public Armada(int sizeOfArmada) {
        this.sizeOfArmada = sizeOfArmada;
        for (int i = 0; i < sizeOfArmada; i++) {
            Ship ship = new Ship(new Pirate(true));
            ship.fillShip();
            ships.add(ship);
        }
    }

    public boolean war(Armada otherArmada) {
        int remainingShipArmada1 = this.sizeOfArmada;
        int remainingShipArmada2 = otherArmada.sizeOfArmada;

        while (remainingShipArmada1  > 0 && remainingShipArmada2  > 0) {
            if (ships.get(remainingShipArmada1 - 1).battle(otherArmada.ships.get(remainingShipArmada2 - 1))) {
                Ship.afterBattle(ships.get(remainingShipArmada1 - 1), otherArmada.ships.get(remainingShipArmada2 - 1));
                remainingShipArmada2--;
            } else {
                Ship.afterBattle(otherArmada.ships.get(remainingShipArmada2 - 1), ships.get(remainingShipArmada1 - 1));
                remainingShipArmada1--;
            }
        }
        return remainingShipArmada2 - 1 == 0;
    }

}
