package gardenplanter;

public class Plant {
    protected String color;
    protected Integer waterlevel;


    public String getType() {
        return null;
    }

    public void plantStatus() {
        if (needWater()) {
            System.out.println( "The " + color + getType() + " need water");
        } else {
            System.out.println("The " + color + getType() + " doesn't need water");
        }
    }


    public Plant(String color) {
        this.color = color;
        waterlevel = 0;
    }

    public String commonPlantStatus() {
        return "The" + color + " ";
    }


    public Double getAbsorbtionRate() {
        return null;
    }

    public Integer getNeedWaterAt() {
        return null;
    }

    public void watering(Integer amount) {
        waterlevel = waterlevel + amount;
    }

    public Boolean isNeedWater() {
        return true;
    }

    public Boolean needWater() {
        if (waterlevel < waterMin()) {
            return true;
        } else {
            return false;
        }
    }

    public Integer waterMin() {
        return 0;
    }
}
