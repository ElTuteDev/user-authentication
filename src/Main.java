import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //constant
        final String realUsername = "admin";
        final String realPassword = "123";


        //Data input
        System.out.print("***** Authentication System *****\n");

        System.out.print("Username: ");
        var username = sc.nextLine();

        System.out.print("Password: ");
        var password = sc.nextLine();


        //Data validation
        var validationInput = realUsername.equals(username) && realPassword.equals(password);

        //Print validation
        System.out.println("\nYour credentials are: " +validationInput);

    }
}
