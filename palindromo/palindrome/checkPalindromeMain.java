 
package palindrome;
 
public class checkPalindromeMain {
    
    public boolean checkPalindrome(String palindrome){
        boolean result;
        verifyPalindrome op = new verifyPalindrome();
        result = op.palindrome(palindrome);
        
        if(result == true){
            System.out.println("Palindrome");
        }
        
        else{
            System.out.println("Not Palindrome");
        }
        
        return result;
    }
    
}
