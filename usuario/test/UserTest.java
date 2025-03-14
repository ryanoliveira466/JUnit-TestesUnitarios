/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package usuario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.RepeatedTest;

/**
 *
 * @author Aluno
 */
public class UserTest {

    public UserTest() {
    }

    @Test
    public void testGetEmail() {
    }

    //SET EMAIL
    @Test
    public void testSetEmail() {
        User usuario = new User();
        boolean resultado = usuario.setEmail("ryan@gmail.com");
        boolean resultado2 = usuario.setEmail("@yahoo.com");
        boolean resultado3 = usuario.setEmail("@outlook.com");
        boolean resultado4 = usuario.setEmail("@hotmail.com");
        assertEquals(true, resultado);
        assertEquals(true, resultado2);
        assertEquals(true, resultado3);
        assertEquals(true, resultado4);
    }

    @Test
    public void testSetEmailCapsLock() {
        User usuario = new User();
        boolean resultado = usuario.setEmail("ryan@GMAIL.COM");
        boolean resultado2 = usuario.setEmail("@YAHOO.COM");
        boolean resultado3 = usuario.setEmail("@OUTLOOK.COM");
        boolean resultado4 = usuario.setEmail("@HOTMAIL.COM");
        assertEquals(true, resultado);
        assertEquals(true, resultado2);
        assertEquals(true, resultado3);
        assertEquals(true, resultado4);
    }

    @Test
    public void testSetEmailSemProvedor() {
        User usuario = new User();
        boolean resultado = usuario.setEmail("ryan");
        assertEquals(false, resultado);
    }

    //SET EMAIL
    @Test
    public void testGetName() {
    }

    @Test
    public void testSetName() {
    }

    @Test
    public void testGetPassword() {
    }

    //SET PASSWORD
    @Test
    public void testSetPassword() {
        User usuario = new User();
        boolean resultado = usuario.setPassword("12345678");
        assertEquals(true, resultado);
    }

    @Test
    public void testSetPasswordMenos8Char() {
        User usuario = new User();
        boolean resultado = usuario.setPassword("1234567");
        assertEquals(false, resultado);
    }

    //SET PASSWORD
}
