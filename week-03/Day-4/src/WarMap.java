public class WarMap {
    public static void main(String[] args) {
        Armada armada1 = new Armada(10);
        Armada armada2 = new Armada(10);
        boolean warResult=(armada1.war(armada2));

        if(warResult){
            System.out.println("The first armada won this colossal battle!!!");
        }
        else {
            System.out.println("The second armada won this colossal battle!!!");
        }
    }
}
