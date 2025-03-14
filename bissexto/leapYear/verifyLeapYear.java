package leapYear;

public class verifyLeapYear {

    public boolean verifyLeap(int number) {

        boolean result;
        String numberToString = Integer.toString(number);

        if ((numberToString.endsWith("00") == false && (number % 4 == 0) == true) || (numberToString.endsWith("00") == true && (number % 400 == 0) == true)) {
            System.out.println("A leap year");
            result = true;
        } else {
            System.out.println("Not a leap year");
            result = false;
        }

        return result;

    }

}
