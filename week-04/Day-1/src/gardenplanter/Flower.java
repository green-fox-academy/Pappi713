package gardenplanter;

import java.util.concurrent.Flow;

public class Flower extends Plant {

    public Flower(String color) {
        super(color);
    }

    public Double getAbsorbtionRate() {
        return 0.75;
    }

    public Integer getNeedWaterAt() {
        return 5;
    }

    public Integer waterMin() {
        return 5;
    }

    public String getType() {
        return "Flower";
    }
}
