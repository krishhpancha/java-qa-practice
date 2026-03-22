package chapter2;
import java.util.Scanner;
public class CalculateArea {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length");
        double length = scanner.nextDouble();

        System.out.println("Enter Breadth");
        double breadth = scanner.nextDouble();
scanner.close();
    double Area = length * breadth;
        System.out.println("Area of rectangle is " + Area);

    }
}
