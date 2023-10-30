import java.util.Scanner;
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for a password to type
        System.out.print("Enter a string for password: ");
        String password = input.nextLine();
        // Call the method and check if the password is valid or invalid
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
    public static boolean isValidPassword(String password) {
        // check if the length of the password is valid
        if (password.length() < 8) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char charac = password.charAt(i);
            // check to see if the password is only letters and digits
            if (!Character.isLetter(charac) && !Character.isDigit(charac)) {
                return false;
            }   
            // count the number of digits in the password
            if (Character.isDigit(charac)) {
                count++;
            }
        }
        // check and see if password has at least two digits to be valid
        if (count < 2) {
            return false;
        }
        return true;
    }
}
