package Methods;
import java.util.Scanner;


public class HomeAreaCalculator {


    private Scanner scanner = new Scanner(System.in);





        public static void main(String args[]){

            HomeAreaCalculator calculator = new HomeAreaCalculator();
            Rectengle kitchen = calculator.getRoom();
            Rectengle bathroom = calculator.getRoom();

            double area = calculator.calculateTotalArea(kitchen, bathroom);

            System.out.println("The total area is: " + area);

            calculator.scanner.close();

        }

        public Rectengle getRoom(){

            System.out.println("Enter the length of your room:");
            double length = scanner.nextDouble();

            System.out.println("Enter the width of your room:");
            double width = scanner.nextDouble();

            return new Rectengle(length, width);
        }

        public double calculateTotalArea(Rectengle rectangle1, Rectengle rectangle2){
            return rectangle1.calculateArea() + rectangle2.calculateArea();
        }

    }

