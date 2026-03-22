package Basics;
import java.util.Scanner;
public class GrossPayCalculator {

    public static void main(String arg[]){

        //Get the no of hours an employee worked
        System.out.println("Enter the no of hours the employee worked.");
        Scanner scanner= new Scanner(System.in);
        int hours = scanner.nextInt();

  //Get the hourly pay rate
        System.out.println("Enter the employee's payrate.");
        double rate = scanner.nextDouble();
        scanner.close();

  //Multiply hours and pay rate
        double grossPay = hours * rate;

  //4. Display Result
        System.out.println("The employee's gross pay is " + grossPay);

}
}

