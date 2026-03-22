package chapter4;
import java.util.Scanner;
public class PositiveNumber {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
int no;

do {
    System.out.println("Enter a number");
     no = scanner.nextInt();
    if (no <= 0) {

        System.out.println("Invalid number. Please enter a positive number.");
        no--;
    }

}while(no <= 0);

        System.out.println("valid number entered");
    }
}
