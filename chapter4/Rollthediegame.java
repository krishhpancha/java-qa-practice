package chapter4;
import  java.util.Random;
public class Rollthediegame {

    public static void main(String arg[]){
        Random random = new Random();
int roll = 0;


        for(int i=0; i < 5; i++){

            int die = random.nextInt(6) + 1;
            roll = roll + die;





                if (roll == 20) {
                    System.out.println("You've rolled a " + die + " You're on roll " + roll + " Congrats, you win!");
                    break;
                }

                else if (roll > 20){
                    System.out.println("You've rolled a " + die + " You're on "  + (20 - roll) + "Your score is exceeded you loose");

                }
               else {
                        System.out.println("You've rolled a " + die + " You're on roll " + roll + " and " + (20 - roll) + " to go ");

               }




            }

if ((roll<20)){
    System.out.println("You loose the game. Your attempts are over");
}
        }
    }

