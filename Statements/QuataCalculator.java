package Statements;
import java.util.Scanner;
public class QuataCalculator {
public static void main (String args[]){
    int quota = 10;
    System.out.println("How many sales did the employees make this week");
    Scanner scanner = new Scanner(System.in);
    int sales = scanner.nextInt();
    scanner.close();

    if(sales >= quota){
        System.out.println("Congrats! you've met your quota");

    }
    else{
        int salesShort = quota - sales;
        System.out.println("You did not make your quota. You were " + salesShort + " sales short");
    }
}
}
