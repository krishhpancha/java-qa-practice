package chapter4;
import java.util.Scanner;
public class NumberClassifier {
    public static void main(String arg[]) {
        System.out.println("Type an integer : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("Positive Even");
            } else if (num % 2 == 1) {
                System.out.println("Positive Odd");
            }
        }
            else {
                if (num < 0){
                System.out.println("Negative Number");
        }
                else {
            System.out.println("The number is Zero");

        }
    }
        scanner.close();
    }
}







