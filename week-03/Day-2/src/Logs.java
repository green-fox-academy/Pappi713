import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.


        //WIP project

        System.out.println(Arrays.toString(uniqIPs("log.txt")));
        System.out.println("The get/past ratio is: " + ratio("log.txt"));
    }

    public static Double ratio(String location) {
        int getCounter = 0;
        int postCounter = 0;
        try {
            List<String> lines = Files.readAllLines(Paths.get(location));
            List<String> getSet = new ArrayList<>();
            for (String line : lines) {
                String[] lineParts = line.split("   ");
                getSet.add(lineParts[2]);
            }
            for (int i = 0; i < getSet.size(); i++) {
                if (getSet.get(i).contains("GET")) {
                    getCounter++;
                } else postCounter++;
            }
        } catch (IOException ex) {
            System.out.println("Unable to open the file");
        }
        return (double) getCounter / postCounter;
    }


    public static String[] uniqIPs(String location) {
        boolean isUnique = true;

        try {
            List<String> lines = Files.readAllLines(Paths.get(location));
            List<String> allIPs = new ArrayList<>();
            List<String> uniqueIPs = new ArrayList<>();

            for (String line : lines) {
                String[] lineParts = line.split("   ");
                allIPs.add(lineParts[1]);
            }
            for (int i = 0; i < allIPs.size(); i++) {
                isUnique = true;
                for (int j = i + 1; j < allIPs.size(); j++) {
                    if (allIPs.get(i).equals(allIPs.get(j))) {
                        isUnique = false;
                    }
                }
                if (isUnique) {
                    uniqueIPs.add(allIPs.get(i));
                }
            }
            int arraySize = uniqueIPs.size();
            System.out.println(arraySize);
            String[] IPArray = new String[arraySize];
            for (int i = 0; i < arraySize; i++) {
                IPArray[i] = uniqueIPs.get(i);
            }
            return IPArray;
        } catch (IOException ex) {
            System.out.println("Unable to open the file");
        }
        return null;
    }
}
