import java.util.Scanner;

public class Login {
    //Scanner object used to read user input from the console
    Scanner scanner = new Scanner(System.in);

    //Variables to store user personal details and login credentials
    public String username;
    public String password;
    public String PhoneNumber;
    public String firstName;
    public String lastName;


    //Method to check username contains an underscore and is no longer than 5 characters
    public boolean checkUsername(String Username) {
        return Username.contains("_") && Username.length() <= 5;

    }
    // Method to validate South African phone number format starting with +27
    public boolean checkCellPhoneNumber() {
        return PhoneNumber.matches("\\+27[0-9]{9}");

    }

    //Method to ensure password meets complexity requirements (length,capital letter, number, special character)
    public boolean checkPasswordComplexity(String Password) {
        return Password.length() >= 8 &&
                Password.matches(".*[A-Z].*") &&
                Password.matches(".*[0-9].*") &&
                Password.matches(".*[!@#$%^&*()].*");
    }

    //Method to check if user login details are available
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword.equals(password);

    }
    //Method that handles the full user registration processss
    public String Register() {

        //Prompt to enter users first and last name
        System.out.println("please enter first name: ");
        firstName = scanner.nextLine();

        System.out.println("please enter last name: ");
        lastName = scanner.nextLine();

        //Loop continues until a valid username is entered
        do {
            System.out.println("Please enter your username: (Username must contain and underscores and be no more than 5 characters long ");
            username = scanner.nextLine();

        } while (!checkUsername(username));

        //Loop continues until a valid password is entered
        do {
            System.out.println("please enter your password: (The password be 8 characters long, contain a capital letter, contain a number and a special character) ");
            password = scanner.nextLine();

        } while (!checkPasswordComplexity(password));

        //Loop continues until a valid phone number is entered
        do {
            System.out.println("Please enter your Phone Number (must contain the international country code and be no more than 10 characters long): ");
            PhoneNumber = scanner.nextLine();

        } while (!checkCellPhoneNumber());

        //Return a success message after registration is complete
        return "User has been successfully registered";
    }

    //Checks that both username and password are not empty (user has entered login details)
    public boolean loginUser() {
        return username !=null && password != null;

    }
    //Returns a welcome message if login is successful, otherwise an error message
    public String returnLoginUserStatus(String enteredUsername, String enteredPassword) {

        if (loginUser(enteredUsername, enteredPassword)) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}