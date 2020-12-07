package gardenplanter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Plant> plants = new ArrayList<>();
        plants.add(new Flower("yellow"));
        plants.add(new Flower("Blue"));
        plants.add(new Tree("purple"));
        plants.add(new Tree("orange"));

        plantStatuses(plants);
        waterPlants(plants, 40);
        plantStatuses(plants);
        waterPlants(plants, 70);
        plantStatuses(plants);


    }

    public static int numberPlantsNeedWater(List<Plant> plants) {
        int plantcounter = 0;
        for (Plant p : plants) {
            if (p.isNeedWater()) {
                plantcounter++;
            }
        }
        return plantcounter;
    }

    public static void waterPlants(List<Plant> plants, int amountOfWater) {
        System.out.println("Watering with " + amountOfWater);
        for (Plant p : plants) {
            if (p.needWater()) {
                p.waterlevel = p.waterlevel + (int) ((amountOfWater / numberPlantsNeedWater(plants)) * p.getAbsorbtionRate());
            }
            p.isNeedWater();
        }
    }

    public static void plantStatuses(List<Plant> plants) {
        for (Plant plant : plants) {
            plant.plantStatus();
        }
    }

}

