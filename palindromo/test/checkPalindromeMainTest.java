/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package palindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ryan Oliveira
 */
public class checkPalindromeMainTest {
    
    public checkPalindromeMainTest() {
    }

    @Test
    public void testCheckPalindrome() {
        checkPalindromeMain op = new checkPalindromeMain();
        boolean resultadoBoolean = op.checkPalindrome("Otto");
        assertEquals(true, resultadoBoolean);
    }
    
}
