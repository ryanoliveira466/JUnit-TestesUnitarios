/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package caesarCipher;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ryan Oliveira
 */
public class encryptCaesarMainTest {
    
    public encryptCaesarMainTest() {
    }

    @Test
    public void testEncryptCaesar() {
        encryptCaesarMain op = new encryptCaesarMain();
        op.encryptCaesar(3, "Desenvolvimento de Sistemas");
    }
    
}


