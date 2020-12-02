package petrolstation;

public class PetrolStation {
    public static void main(String[] args) {
        Station station=new Station();
        Car car =new Car();
        station.gasAmount=500;
        System.out.println(station.gasAmount);
        System.out.println(car.gasAmount);
        station.refill(car);
        System.out.println(station.gasAmount);
        System.out.println(car.gasAmount);
    }




}
