package leapYear;

public class verifyDigitLeapYear {

    public boolean checkDigital(String number) {

        boolean result;

        try {

            int realNumber;
            realNumber = Integer.parseInt(number);

            if (number.length() == 2) {
                String formatedString = "2" + "0" + number;
                number = formatedString;
                System.out.println(number);
                result = true;
            } 
            else {
                number = number;
                result = true;
            }
        } catch (Exception e) {
            System.out.println("Numbers only, please!");
            result = false;
        }

        return result;

    }

}
