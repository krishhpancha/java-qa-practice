package chapter4;
import java.util.Scanner;
public class LoginValidationMethod {


        public static void checkLogin(String username, String password) {
            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Fail");
            } else if (password.length() < 6) {
                System.out.println("Weak");
            } else {
                System.out.println("Success");
            }
        }

        public static void main(String[] args) {
            checkLogin("admin", "1234");
        }
    }