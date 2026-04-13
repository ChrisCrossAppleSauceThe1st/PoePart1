
    import org.junit.Test;
    import static org.junit.Assert.*;
    //Test class used to verify that validation methods work correctly
    public class LoginTest {

    @Test
    public void testCheckUsername(){
        Login login = new Login();

        login.username="kyl_1";
        assertTrue(login.checkUsername("kyl_1"));


        login.username="kyle!!!!!!!";
        assertFalse(login.checkUsername("kyle!!!!!!!"));
    }
    @Test
    public void testCheckPasswordComplexity() {
        Login login = new Login ();

        login.password = "Ch&&sec@ke99!";
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99!"));

        login.password = "password";
        assertFalse(login.checkPasswordComplexity("password"));
    }
    @Test
    public void testCheckCellPhoneNumber() {
        Login login = new Login();

        login.PhoneNumber = "+27838968976";
        assertTrue(login.checkCellPhoneNumber());

        login.PhoneNumber = "08966553";
        assertFalse(login.checkCellPhoneNumber());
    }
    @Test
    public void testLoginUser() {
        Login login = new Login();
        login.username = "kyl_1";
        login.password = "Ch&&sec@ke99!";

        assertTrue(login.loginUser("kyl_1", "Ch&&sec@ke99!"));
        assertFalse(login.loginUser("kyl_1", "wrongpassword"));
    }
    //Used for Debugging and ensuring methods return expected results
}
