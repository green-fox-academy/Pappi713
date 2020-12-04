public class SummDigit {
    public static void main(String[] args) {
        System.out.println(summOfDigits(777));
    }

    public static int summOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return ((number % 10) + summOfDigits(number / 10));
    }
}

