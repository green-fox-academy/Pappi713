public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main` method
        // - Download those, use those
        // - In the main method create a fleet
        // - Achieve this output:
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        Thing thg1 = new Thing("Get milk");
        Thing thg2 = new Thing("Remove the obstacles");
        Thing thg3 = new Thing("Stand up");
        thg3.complete();
        Thing thg4 = new Thing("Eat lunch");
        thg4.complete();

        Fleet fleet1 = new Fleet();
        fleet1.add(thg1);
        fleet1.add(thg2);
        fleet1.add(thg3);
        fleet1.add(thg4);

        System.out.println(fleet1);
    }
}
