 
package usuario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 
public class RegisterTest {

    public RegisterTest() {
    }

    //EMAIL
    @Test
    public void testRegistering() {
        Register registro = new Register();
        int resultado = registro.registering("ryan@gmail.com", "Gmail", "12345678");
        int resultado2 = registro.registering("ryan@yahoo.com", "Yahoo", "12345678");
        int resultado3 = registro.registering("ryan@outlook.com", "OutLook", "12345678");
        int resultado4 = registro.registering("ryan@hotmail.com", "HotMail", "12345678");
        assertEquals(1, resultado);
        assertEquals(1, resultado2);
        assertEquals(1, resultado3);
        assertEquals(1, resultado4);
    }

    @Test
    public void testRegisteringCapsLock() {
        Register registro = new Register();
        int resultado = registro.registering("ryan@GMAIL.COM", "Gmail", "12345678");
        int resultado2 = registro.registering("ryan@YAHOO.COM", "Yahoo", "12345678");
        int resultado3 = registro.registering("ryan@OUTLOOK.COM", "OutLook", "12345678");
        int resultado4 = registro.registering("ryan@HOTMAIL.COM", "HotMail", "12345678");
        assertEquals(1, resultado);
        assertEquals(1, resultado2);
        assertEquals(1, resultado3);
        assertEquals(1, resultado4);
    }

    @Test
    public void testRegisteringEmailSemProvedor() {
        Register registro = new Register();
        int resultado = registro.registering("ryan", "ryan", "12345678");
        assertEquals(-1, resultado);

    }
    //EMAIL

    //PASSWORD
    @Test
    public void testRegisteringSenhaMenor8Char() {
        Register registro = new Register();
        int resultado = registro.registering("ryan@gmail.com", "Gmail", "1234567");
        assertEquals(-2, resultado);

    }
    //PASSWORD
    
    //NAME
    @Test
    public void testRegisteringEmptyName() {
        Register registro = new Register();
        int resultado = registro.registering("ryan@gmail.com", " ", "12345678");
        assertEquals(-3, resultado);

    }
    //NAME

}
