package Statements;
import java.util.Scanner;
public class Salary {

    public static void main(String args[]){
      int salary = 2000;
      int bonus = 200;

    System.out.println("How many sales did the employees make this week");
    Scanner scanner = new Scanner(System.in);
    int sales = scanner.nextInt();
    scanner.close();

    if(sales > 10){
        salary = salary + bonus;
    }

        System.out.println("The Employee's pay is " + salary);
    }
}
