package Loops;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String arg[]){
        System.out.println("Enter Your Grade : ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

       String message;
       switch(grade){
           case "A":
           message = "Excellent job";
           break;


           case "B":
                    message = "Great Job";
                   break;


           case "C":
                       message = "Good job";
                       break;


           case "D":
                           message = "You need to work a bit harder";
                           break;
           case "F":
               message = "uh oh you failed";
               break;
           default:
               message = "Error, Invalid Grade";
               break;


       }
       System.out.println(message);
    }
}
