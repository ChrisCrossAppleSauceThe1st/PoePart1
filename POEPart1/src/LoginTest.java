import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {


    @Test
    public void testCheckUsername() {
        Login login = new Login();

        // Valid username: contains underscore and 5 or fewer characters
        login.username = "kyl_1";
        boolean validUsername = login.checkUsername("kyl_1");
        assertEquals("Username successfully added", true, validUsername);
        if (validUsername) {
            System.out.println("Username successfully added");
        }

        // Invalid username: too long and no underscore
        login.username = "kyle!!!!!!!";
        boolean invalidUsername = login.checkUsername("kyle!!!!!!!");
        assertEquals("Username does not meet requirements", false, invalidUsername);
        if (!invalidUsername) {
            System.out.println("Username does not meet requirements");
        }
    }

    @Test
    public void testCheckPasswordComplexity() {
        Login login = new Login();

        // Valid password: 8+ chars, uppercase, digit, special character
        login.password = "Ch&&sec@ke99!";
        boolean validPassword = login.checkPasswordComplexity("Ch&&sec@ke99!");
        assertEquals("Password successfully added", true, validPassword);
        if (validPassword) {
            System.out.println("Password successfully added");
        }

        // Invalid password: too simple
        login.password = "password";
        boolean invalidPassword = login.checkPasswordComplexity("password");
        assertEquals("Password does not meet requirements", false, invalidPassword);
        if (!invalidPassword) {
            System.out.println("Password does not meet requirements");
        }
    }

    @Test
    public void testCheckCellPhoneNumber() {
        Login login = new Login();

        // Valid South African phone number: starts with +27 followed by 10 digits
        login.PhoneNumber = "+27838968976";
        boolean validPhone = login.checkCellPhoneNumber();
        assertEquals("Phone number successfully added", true, validPhone);
        if (validPhone) {
            System.out.println("Phone number successfully added");
        }

        // Invalid phone number: wrong format
        login.PhoneNumber = "08966553";
        boolean invalidPhone = login.checkCellPhoneNumber();
        assertEquals("Phone number does not meet requirements", false, invalidPhone);
        if (!invalidPhone) {
            System.out.println("Phone number does not meet requirements");
        }
    }


}