package chapter5;
import java.util.Scanner;
public class Methods {

    public static void main(String[] arg) {
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter you Name");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            greetUser(name);
        }
    }

    public static void greetUser(String name){


            System.out.println("Hi There, " + name);

    }
}