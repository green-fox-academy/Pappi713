package aircraft;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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

    public Integer totalDamage() {
        Integer totalDamage = 0;
        for (Aircraft aircraft : aircrafts) {
            totalDamage += aircraft.getCurrentAmmo() * aircraft.getBaseDamage();
        }
        return totalDamage;
    }

    public Integer totalAmmoNeedtoFill() {
        Integer ammoNeedToFill = 0;
        for (Aircraft aircraft : aircrafts) {
            ammoNeedToFill += (aircraft.getMaxAmmo() - aircraft.getCurrentAmmo());
        }
        return ammoNeedToFill;
    }


    public void fill() {
        if (ammo == 0) {
            System.out.println("there is no ammo to fill any aircraft");
        } else if (ammo <= totalAmmoNeedtoFill()) {
            for (Aircraft aircraft : aircrafts) {
                if (aircraft instanceof F35 && ammo >= (aircraft.getMaxAmmo() - aircraft.getCurrentAmmo())) {
                    ammo = aircraft.refill(ammo);
                } else if (aircraft instanceof F35 && ammo < (aircraft.getMaxAmmo() - aircraft.getCurrentAmmo())) {
                    ammo = aircraft.refill(ammo);
                    break;
                }
            }
            for (Aircraft aircraft : aircrafts) {
                if (aircraft instanceof F16 && ammo >= (aircraft.getMaxAmmo() - aircraft.getCurrentAmmo())) {
                    ammo = aircraft.refill(ammo);
                } else if (aircraft instanceof F35 && ammo <= (aircraft.getMaxAmmo() - aircraft.getCurrentAmmo())) {
                    ammo = aircraft.refill(ammo);
                    break;
                }
            }
        } else {
            for (Aircraft aircraft : aircrafts) {
                ammo = aircraft.refill(ammo);
            }
        }
    }


    public void getStatus() {
        if (health <= 0) {
            System.out.println("It's dead Jim :(");
        } else {
            System.out.println("HP: " + health + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + ammo + ", Total damage: " + totalDamage());
            for (Aircraft aircraft : aircrafts) {
                System.out.println(aircraft.getStatus());
            }
        }
    }


}
