package chapter2;
import java.util.Scanner;
public class Basicinfo {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = scanner.next();

        System.out.println("Your City");
        String City= scanner.next();

        System.out.println("Your Age");
        String Age= scanner.next();

        System.out.println("My name is " + name);
        System.out.println("I live in " + City);
        System.out.println("My Age is " + Age);
    }
}
