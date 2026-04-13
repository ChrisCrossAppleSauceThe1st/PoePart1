import java.util.Scanner;
//Entry point of the program - execution starts here
public class Main {
    public static void main(String[] args) {
        //Create a Login object to access registration and login methods
        Login login = new Login();

        // Register the user
        System.out.println(login.Register());

        // Login the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username to login: ");
        String enteredUsername = scanner.nextLine();

        System.out.println("Please enter your password to login: ");
        String enteredPassword = scanner.nextLine();

        System.out.println(login.returnLoginUserStatus(enteredUsername, enteredPassword));
    }
}