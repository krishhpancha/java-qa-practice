package Loops;
import java.util.Scanner;

public class MiniBankingSystem {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Account Balance");
        int AB = scanner.nextInt();

        System.out.println("Withdrawal Amount");
        int WA = scanner.nextInt();




        if (WA <= AB - 1000) {

            System.out.println("Withdraw Successful");
            if (WA >= 10000) {
                System.out.println("Congrats you got " + (WA * 15) / 100 + " cashback");
            }
            else if (WA >= 5000) {
                System.out.println("Congrats you got " + (WA * 7) / 100 + " cashback");

            }
            else {
                System.out.println("No Cashback");
            }



        System.out.println("Loan Required (Yes/No)");
        String ST = scanner.next();

        if (ST.equalsIgnoreCase("Yes")) {
            // 2. Ask for marks only if they are a student
            System.out.println("Enter your Credit Score ");
            int creditscore = scanner.nextInt();

            if (creditscore >= 750) {
                System.out.println("Loan Approved");
            }
            else if (creditscore >= 600) {
                System.out.println("Loan Under Review");
            }

            else {
                System.out.println("Loan rejected");
            }
        }
    }
else {
            System.out.println("Cannot withdraw");
        }

scanner.close();
        }

        }



