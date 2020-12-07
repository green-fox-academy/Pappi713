package aircraft;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    protected List<Aircraft> aircrafts = new ArrayList<>();
    protected Integer ammo;
    protected Integer health;

    public Carrier(Integer ammo, Integer health) {
        this.ammo = ammo;
        this.health = health;
    }

    public void add(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    //abadoned process at fill method
    public static int ammoNeed(Carrier carrier) {
        int ammoNeed = 0;
        for (Aircraft aircraft : carrier.aircrafts) {
            ammoNeed += aircraft.getMaxAmmo();
        }
        return ammoNeed;

    }


}
