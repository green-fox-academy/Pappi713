package aircraft;

public class Aircraft {


    protected Integer currentAmmo = 0;

    public Integer getMaxAmmo() {
        return null;
    }

    public Integer getBaseDamage() {
        return null;
    }

    public String getType() {
        return null;
    }

    public String getStatus() {
        return "Type " + getType() + ", Ammo: " + currentAmmo + ", Base damage: " + getBaseDamage() + ": All Damage: " + fight();
    }

    public Boolean isPriority() {
        return true;
    }

    public Integer fight() {
        int Damage = currentAmmo * getBaseDamage();
        currentAmmo = 0;
        return Damage;
    }
    public Integer refill(Integer allAmmo){
        currentAmmo =getMaxAmmo();
        allAmmo-=getMaxAmmo();
        return allAmmo;
    }

}
