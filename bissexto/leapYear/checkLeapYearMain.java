package leapYear;

public class checkLeapYearMain {

    public boolean checkLeapYear(String number) {

        boolean result;
        boolean resultDigit;
        boolean resultCharacters;

        try {
            verifyDigitLeapYear op = new verifyDigitLeapYear();
            resultDigit = true;
            resultCharacters = op.checkDigital(number);

            if (resultCharacters == true) {
                result = true;
            } else {
                result = false;
            }

        } catch (Exception e) {
            result = false;
            resultDigit = false;
            resultCharacters = false;

        }

        if (resultDigit == true && resultCharacters == true) {

            try {
                int realNumber;
                realNumber = Integer.parseInt(number);
                verifyLeapYear op = new verifyLeapYear();
                result = op.verifyLeap(realNumber);

            } catch (Exception e) {
                result = false;
            }

        }

        return result;
    }

}
