package Loops;
import java.util.Scanner;
public class Retrylogi2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

       /* do{
            System.out.println("Enter your username");
            username = scanner.nextLine();

            System.out.println("Enter your password");
            password= scanner.nextLine();

            attempts--;



                if (attempts == 0){
                    System.out.println("Locked");
                    break;
                }
            else  {
                ;
                System.out.println("Retry");
            }

        }while(attempts < 3);



    }
}*/
        for (int attempts = 1; attempts <= 3; attempts++)
            if (attempts < 3) {
                System.out.

                        println("Retry");
            } else {
                System.out.println("Locked");
            }
    }
}