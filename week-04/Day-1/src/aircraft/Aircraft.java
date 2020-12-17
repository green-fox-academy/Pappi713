package aircraft;

public class Aircraft {


    protected Integer currentAmmo = 0;

    public Integer getMaxAmmo() {
        return null;
    }
    public void setCurrentAmmo(Integer currentAmmo){
        this.currentAmmo=currentAmmo;
    }

    public Integer getBaseDamage() {
        return null;
    }

    public String getType() {
        return null;
    }

    public String getStatus() {
        return "Type " + getType() + ", Ammo: " + currentAmmo + ", Base damage: " + getBaseDamage() + ": All Damage: " + (currentAmmo*getBaseDamage());
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
        if(allAmmo>=getMaxAmmo()-currentAmmo){
            currentAmmo+=getMaxAmmo();
            return allAmmo-getMaxAmmo();
        }
        else{
            currentAmmo=currentAmmo+allAmmo;
            return 0;
        }
    }

    public Integer getCurrentAmmo() {
        return currentAmmo;
    }
}
