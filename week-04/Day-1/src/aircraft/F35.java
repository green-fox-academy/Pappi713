package aircraft;

public class F35 extends Aircraft {

    public Integer getMaxAmmo() {
        return 12;
    }

    public Integer getBaseDamage() {
        return 50;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public Boolean isPriority() {
        return true;
    }
}
