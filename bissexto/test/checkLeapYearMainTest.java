/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package leapYear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ryan Oliveira
 */
public class checkLeapYearMainTest {
    
    public checkLeapYearMainTest() {
    }

    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
        checkLeapYearMain op = new checkLeapYearMain();
        boolean resultadoBoolean = op.checkLeapYear("2000");
        assertEquals(true, resultadoBoolean);
    }
    
}
