package aircraft;

public class F16 extends Aircraft {

    public Integer getMaxAmmo() {
        return 8;
    }

    public Integer getBaseDamage() {
        return 30;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public Boolean isPriority() {
        return false;
    }

}
