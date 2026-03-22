package Loops;

public class RetryLogic {


        public static void main(String[] args) {

            String username = "admin";
            String password = "123"; // weak
            int attempts = 3;

            while (attempts > 0) {

                if (!username.isEmpty() && password.length() >= 6) {
                    System.out.println("Login Success");
                    break;
                } else {
                    attempts--;
                    if (attempts == 0) {
                        System.out.println("Locked");
                    } else {
                        System.out.println("Retrying...");
                    }
                }
            }
        }
    }
