public class BattleApp {
    public static void main(String[] args) {

        Ship ship1 =new Ship(new Pirate(true));
        Ship ship2 = new Ship(new Pirate(true));
        ship1.fillShip();
        ship2.fillShip();

        System.out.println(ship1.getPirateOnBoard());
        System.out.println(ship2.getPirateOnBoard());
        if(ship1.battle(ship2)){
            Ship.afterBattle(ship1,ship2);
        }
        else{
            Ship.afterBattle(ship2,ship1);
        }
        for (int i=0;i<ship1.ship.size();i++){
            System.out.println(ship1.ship.get(i).getIsDead());
        }
        for (int i=0;i<ship2.ship.size();i++){
            System.out.println(ship2.ship.get(i).getIsDead());
        }
    }
}
