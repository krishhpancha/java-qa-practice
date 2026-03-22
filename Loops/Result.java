package Loops;

import java.util.Scanner;
    public class Result {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks:");
            int marks = sc.nextInt();






            if (marks >= 35) {

                System.out.println("Pass");
                if (marks >= 90) {

                    System.out.println("Outstanding");
                } else if (marks >= 75) {

                    System.out.println("Distinction");

                } else if (marks >= 60) {

                    System.out.println("First Class");

                } else {
                    System.out.println("Second Class");
                }
            } else {
                System.out.println("Fail");


            }

            sc.close();
        }
    }








