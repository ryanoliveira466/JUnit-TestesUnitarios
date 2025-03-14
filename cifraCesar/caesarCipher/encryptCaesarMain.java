package caesarCipher;

import java.util.ArrayList;

public class encryptCaesarMain {

    public String encryptCaesar(int number, String message) {

        int numberToJump = number;
        String messageOficial = message;
        String encryptedMessage = "";
        ArrayList<String> alphabetListLower = new ArrayList<>();
        ArrayList<String> alphabetListUpper = new ArrayList<>();
        ArrayList<String> alphabetList = new ArrayList<>();
        ArrayList<String> charList = new ArrayList<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            String letter = String.valueOf(c);
            alphabetListUpper.add(letter);
            alphabetList.add(letter);
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            String letter = String.valueOf(c).toLowerCase();
            alphabetListLower.add(letter);
            alphabetList.add(letter);
        }

        for (int i = 0; i < messageOficial.length(); i++) {
            charList.add(String.valueOf(messageOficial.charAt(i)));
        }

        //contains
        //boolean flagContinueLoop = true;
        boolean containsInvalid = false;
        for (int o = 0; o < messageOficial.length(); o++) {

            String chara = charList.get(o);

            //if(flagContinueLoop){
            for (int g = 0; g < alphabetList.size(); g++) {
                containsInvalid = true;

                if (alphabetList.get(g).equals(chara) || chara.equalsIgnoreCase(" ")) {
                    System.out.println("Found It");
                    containsInvalid = false;
                    break;
                }

            }
            //}
            //if    

            if (containsInvalid == true) {
                //flagContinueLoop = false;
                break;
            }

        }
        //contains
        if (containsInvalid == true) {
            System.out.println("Please, only letters");
        } else {

            ///Main
            for (int i = 0; i < messageOficial.length(); i++) {
                String letter = charList.get(i);

                if (letter.equalsIgnoreCase(" ")) {
                    encryptedMessage += " ";
                }

                char letterUpperOrLower = 0;
                char[] charArray = letter.toCharArray();
                for (char c : charArray) {
                    letterUpperOrLower = c;
                }

                if (Character.isUpperCase(letterUpperOrLower)) {
                    for (int x = 0; x < alphabetListUpper.size(); x++) {

                        if (alphabetListUpper.get(x).equals(letter)) {
                            int index;
                            outOfBondariesMain op = new outOfBondariesMain();
                            index = op.outOfBondariesEncrypt(numberToJump, x, alphabetListUpper.size());

                            String jumpLetter = alphabetListUpper.get(index);
                            encryptedMessage = encryptedMessage + jumpLetter;

                        }

                    }
                } else {
                    for (int x = 0; x < alphabetListLower.size(); x++) {

                        if (alphabetListLower.get(x).equals(letter)) {
                            int index;
                            outOfBondariesMain op = new outOfBondariesMain();
                            index = op.outOfBondariesEncrypt(numberToJump, x, alphabetListLower.size());

                            String jumpLetter = alphabetListLower.get(index);
                            encryptedMessage = encryptedMessage + jumpLetter;

                        }

                    }
                }

            }
            ///Main
        }
        //else
        

        System.out.println(alphabetListLower);
        System.out.println(alphabetListUpper);
        //System.out.println(charList.get(4).equalsIgnoreCase(" "));
        //System.out.println(charList);
        //System.out.println(alphabetListLower);
        System.out.println(encryptedMessage);

        return encryptedMessage;

    }

}
