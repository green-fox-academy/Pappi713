import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SWMain {
    public static void main(String[] args) {

        List<SWCharacter> charList = new ArrayList();
        Path instructionPath = Paths.get("swcharacters.csv");
        try (Stream<String> lines = Files.lines(instructionPath)) {
            charList = lines
                    .map(SWMain::swchar)
                    .collect(Collectors.toList());
            Optional<Integer> optionalMax=charList.stream().filter(x-> !x.mass.equals("unknown")).map(x-> {
                try {
                    return NumberFormat.getInstance(Locale.US).parse(x.mass);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return  null;
                }
            }).max(Integer::compare);
            if(optionalMax.isPresent()){
                System.out.println(optionalMax.get());
            }else{
                System.out.println("nincsen maximum");
            }
        } catch (IOException | java.text.ParseException jtp) {
            jtp.printStackTrace();
        }

    }

    public  static SWCharacter swchar(String line) {
        String[] charDataArray = line.split(";");
        String name = charDataArray[0];
        String  height =charDataArray[1];
        String mass = charDataArray[2];
        String hairColor = charDataArray[3];
        String skinColor = charDataArray[4];
        String eyeColor = charDataArray[5];
        String birthYear = charDataArray[6];
        String gender = charDataArray[7];
        SWCharacter swc=new SWCharacter(name, height, mass, hairColor, skinColor, eyeColor, birthYear, gender);
        return swc;
    }

}
