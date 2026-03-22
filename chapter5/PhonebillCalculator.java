package chapter5;
import java.util.Scanner;

public class PhonebillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter plan fee: ");
        double planFee = sc.nextDouble();

        System.out.print("Enter overage minutes: ");
        int minutes = sc.nextInt();

        // Calculations
        double overage = calculateOverage(minutes);
        double subtotal = planFee + overage;
        double tax = calculateTax(subtotal);
        double total = calculateTotal(subtotal, tax);

        // Output
        System.out.println("\n----- Phone Bill -----");
        System.out.println("Plan Fee: " + planFee);
        System.out.println("Overage Charges: " + overage);
        System.out.println("Tax: " + tax);
        System.out.println("Final Total: " + total);


    }


    public static double calculateOverage(int minutes) {
        return minutes * 0.25;
    }


    public static double calculateTax(double subtotal) {

        return subtotal * 0.15;
    }

    public static double calculateTotal(double subtotal, double tax) {
        return subtotal + tax;

    }
}