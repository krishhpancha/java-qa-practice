package Project;

import exercises.project.Coin;
import exercises.project.Player;

import java.util.Scanner;

public class CoinTossGame {

    private Scanner scanner;

    public static void main(String[] args){
        CoinTossGame game = new CoinTossGame();
        game.scanner = new Scanner(System.in);

        exercises.project.Player player1 = new exercises.project.Player(game.askPlayerName());
        player1.setGuess(game.askGuess());

        exercises.project.Player player2 = new exercises.project.Player(game.askPlayerName());
        if(player1.getGuess().equalsIgnoreCase(exercises.project.Coin.HEADS)){
            player2.setGuess(exercises.project.Coin.TAILS);
        }else{
            player2.setGuess(exercises.project.Coin.HEADS);
        }

        System.out.println("Flipping the coin...");
        exercises.project.Coin coin = new exercises.project.Coin();
        coin.flip();
        System.out.println("The coin landed on " + coin.getSide());

        game.determineWinner(player1, player2, coin);
        game.scanner.close();
    }

    private String askPlayerName(){
        System.out.println("Enter the player's name:");
        return scanner.nextLine();
    }

    private String askGuess(){
        String prompt = String.format("%s or %s?", exercises.project.Coin.HEADS, exercises.project.Coin.TAILS);
        System.out.println(prompt);
        String guess = scanner.nextLine();

        while(!guess.equalsIgnoreCase(exercises.project.Coin.HEADS)
                && !guess.equalsIgnoreCase(exercises.project.Coin.TAILS)){
            System.out.println("Invalid guess. Try again. " + prompt);
            guess = scanner.nextLine();
        }

        return guess;
    }

    private void determineWinner(exercises.project.Player player1, Player player2, Coin coin){
        String winner;
        if(coin.getSide().equalsIgnoreCase(player1.getGuess())){
            winner = player1.getName();
        }else{
            winner = player2.getName();
        }

        System.out.println("The winner is " + winner);
    }
}
