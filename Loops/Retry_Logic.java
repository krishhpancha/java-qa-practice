package Loops;
import java.util.Scanner;
public class Retry_Logic {
    public static void checkLogin(String username, String password) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        do{
            System.out.println("Enter your username");
            username = scanner.nextLine();

            System.out.println("Enter your password");
            password= scanner.nextLine();

            attempts--;
            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Fail");

                if (password.length() < 6) {
                    ;
                    System.out.println("Weak");
                }
                System.out.println("Retry");

            }
            else {
                System.out.println("Success");
                break;
            }
        }while(attempts < 3);
        System.out.println("Locked after 3 Fails");

    }
}