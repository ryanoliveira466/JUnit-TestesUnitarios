package palindrome;

public class verifyPalindrome {

    public boolean palindrome(String palindrome) {
        boolean result;
        String inverted = "";

        for (int i = (palindrome.length() - 1); i > -1; i--) {
            char letter = palindrome.charAt(i);
            inverted += letter;
        }
        
         String palindromeFormatted = palindrome.toLowerCase().trim().replaceAll(" ", "");;
         String invertedFormatted = inverted.toLowerCase().trim().replaceAll(" ", "");;

        if(palindromeFormatted.equals(invertedFormatted)) {
            result = true;
            System.out.println(palindromeFormatted);
            System.out.println(invertedFormatted);
        } else {
            result = false;
            System.out.println(palindromeFormatted);
            System.out.println(invertedFormatted);
        }

        return result;

    }

}
