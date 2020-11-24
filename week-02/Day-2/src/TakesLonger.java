public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String subStart = "";
        String subEnd;
        String subMid = "always takes longer than";
//        substring(0,..)
        subStart = quote.substring(0, quote.indexOf("It") + 2);
       System.out.println(subStart);
        int subEndPos = 0;
        subEndPos = quote.indexOf("you");
        System.out.println(subEndPos);
        subEnd = quote.substring(subEndPos);
      System.out.println(subEnd);
        quote = subStart + " " + subMid + " " + subEnd;
        System.out.println(quote);
    }
}
