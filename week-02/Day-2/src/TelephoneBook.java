import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {

        Map<String, String> telephoneBook = new HashMap<>() {{
            put("John K. Miller", "405-709-1865");
            put("Hortensia E. Foster", "606-481-6467");
            put("Amanda D. Newland", "319-243-5613");
            put("Brooke P. Askew", "307-687-2982");
        }};

        System.out.println("John K. Miller's Phone number is: " + telephoneBook.get("John K. Miller"));
        String stringValue = "307-687-2982";
        String strKey = null;
        for (Map.Entry<String, String> entry : telephoneBook.entrySet()) {
            if (stringValue.equals(entry.getValue())) {
                strKey = entry.getKey();
                break;
            }
        }
        System.out.println("The owner of the number(307-687-2982) is: " + strKey);

        if (telephoneBook.containsKey("Chris E. Myers")) {
            System.out.println("Yes we know it");
        } else System.out.println("Sadly we dont know Chris E. Myers number :( ");
    }
}
