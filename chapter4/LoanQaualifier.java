package chapter4;
import java.util.Scanner;
public class LoanQaualifier {

    public static void main(String args[]) {

        //Initialize what we know
        int requiredSalary = 3000;
        int requiredYearsEmployed = 2;
        Scanner scanner = new Scanner(System.in);
        //get what we don't
        System.out.println("Enter your salary");

        double salary = scanner.nextDouble();

        System.out.println("Eneter the no of years with your current employer");
        double years = scanner.nextDouble();
        scanner.close();

        //Make Decision
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats You are " +
                        "eligible for the loan.");
            }
            else
            {
                System.out.println("You must have " + requiredYearsEmployed +

                        " of experience to be eligible for loan.");
            }
        }
        else
        {

            System.out.println("You must have salary more than " +
                    requiredSalary + " to be eligibile for loan");
        }
    }
}



