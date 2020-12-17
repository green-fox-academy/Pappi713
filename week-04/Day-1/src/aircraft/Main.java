package aircraft;

public class Main {
    public static void main(String[] args) {
        Carrier carrier=new Carrier(80,3000);
        for(int i=0;i<5;i++){
            carrier.add(new F16());
            carrier.add(new F35());
        }
        carrier.fill();
        carrier.getStatus();
    }
}
