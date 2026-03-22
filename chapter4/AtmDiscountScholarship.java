package chapter4;
import java.util.Scanner;

public class AtmDiscountScholarship {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Account Balance");
        int AB = scanner.nextInt();

        System.out.println("Withdrawal Amount");
        int WA = scanner.nextInt();




        if (WA <= AB) {

            System.out.println("Withdraw Successful");
            if (WA >= 5000) {
                System.out.println("Congrats you got " + (WA * 10) / 100 + " cashback");
            }
            else if (WA >= 2000) {
                System.out.println("Congrats you got " + (WA * 20) / 100 + " cashback");

            }
            else {
                System.out.println("No Cashback");
        }


        System.out.println("Are you a Student : Yes or No");
        String ST = scanner.next();
            Scanner scan = new Scanner(System.in);
        if (ST.equalsIgnoreCase("Yes")) {
            // 2. Ask for marks only if they are a student
            System.out.println("Enter Marks: ");
            int marks = scanner.nextInt();

            if (marks >= 90) {
                System.out.println("Full Scholarship");
            }
            else if (marks >= 75) {
                System.out.println("Partial Scholarship");
            }
            else if (marks >= 0) {
                System.out.println("No Scholarship");
            }
            else {
                System.out.println("You are not a student");
            }
        }
    }
else {
            System.out.println("Insufficient Balance");
        }

scanner.close();
        }

        }



