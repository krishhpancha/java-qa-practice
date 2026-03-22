package chapter4;
import java.util.Scanner;

public class Addnumbersdowhile {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        boolean again;

        do{
            System.out.println("Enter the first no");
            double no1 = scanner.nextDouble();

            System.out.println("Enter the second no");
            double no2 = scanner.nextDouble();

            double sum = no1 + no2;
            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over?");
            again = scanner.nextBoolean();
        }while(again);
    }
}

