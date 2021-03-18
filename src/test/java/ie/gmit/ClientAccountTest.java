package ie.gmit;//  Jack Sheridan
//  G00326495
//  ClientAccountTest
//  18-03-21

import ie.gmit.ClientAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClientAccountTest {

    private ClientAccount a1;

    @BeforeEach
    void init() { a1 = new ClientAccount("Mr", "Jack", "1234567890", "432111111111", 20); } // Add email

    @Test
    void testTitle() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new ClientAccount("Sir", "Jack", "1234567890", "432111111111", 20) );
        assertEquals("Invalid title", e.getMessage());
    }

    @Test
    void testName() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new ClientAccount("Mr", "Ja", "1234567890", "432111111111", 20) );
        assertEquals("Invalid name", e.getMessage());
    }

    @Test
    void testId() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new ClientAccount("Mr", "Jack", "1234", "432111111111", 20) );
        assertEquals("Invalid id", e.getMessage());
    }

    @Test
    void testPhone() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new ClientAccount("Mr", "Jack", "1234567890", "4321", 20) );
        assertEquals("Invalid phone", e.getMessage());
    }

//    @Test
//    void testEmail() {
//        Exception e = assertThrows(IllegalArgumentException.class, () -> new ClientAccount("Mr", "Jack", "1234567890", "4321", 20) );
//        assertEquals("Invalid phone", e.getMessage());
//    }

    @Test
    void testAge() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new ClientAccount("Mr", "Jack", "1234567890", "432111111111", 15) );
        assertEquals("Invalid age", e.getMessage());
    }
}
