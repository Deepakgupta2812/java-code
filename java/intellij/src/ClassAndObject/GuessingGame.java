package ClassAndObject;

import java.util.Scanner;

public class GuessingGame {
    int random;
    GuessingGame(){
        random=(int)Math.ceil(Math.random()*100);
    }
    /**
    * @param guessNumber the number that player guessed
     * @return Negative if the guessed number is smaller.
     * -0 if the guessed number is correct .
     * -positive if the guessed number if higher.
    * */

    int guess(int guessNumber){
        return guessNumber-random;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the guessing game . Guess the number between 1 to 100 :");
        int guess;
        int result;
        do {
            System.out.println("Guess the number :");
            guess=sc.nextInt();
            result=game.guess(guess);
            if (result==0){
                System.out.println("Congrats, Your guess is correct");
            } else if (result<0) {
                System.out.println("Please Guess Higher ");

            }else {
                System.out.println("Please guess the number lower");
            }
        }while (result!=0);

    }
}
