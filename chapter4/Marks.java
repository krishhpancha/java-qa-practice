package chapter4;
//User પાસેથી marks input લો અને grade print કરો:
//
//90+ → A
//
//80–89 → B
//
//70–79 → C
//
//60–69 → D
//
//Below 60 → F
import java.util.Scanner;
public class Marks {
    public static void main(String arg[]){
           System.out.println("Enter your Score");
           Scanner scanner = new Scanner(System.in);
           int Score = scanner.nextInt();
scanner.close();
           char grade;

           if (Score >= 90){
               grade = 'A';
           }
        else if (Score >= 80){
            grade = 'B';
        }
           else if (Score >= 70){
               grade = 'C';
           }
           else if (Score >= 60){
               grade = 'D';
           }
           else{
               grade = 'F';
           }

        System.out.println("Grade = "  + grade);
    }
}
