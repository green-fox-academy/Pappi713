public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        int a = 10;
        int b = 23;
        int c = 31;

        int surface;
        int vol;

        surface = 2 * ((a * b) + (a * c) + (b * c));
        vol = a * b * c;

        System.out.println("Surface Area is: " + surface);
        System.out.println("Volume is: " + vol);

    }
}