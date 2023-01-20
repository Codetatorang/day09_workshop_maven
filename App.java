package sg.edu.nus.iss;

import java.util.Random;
import java.util.Scanner;

public final class App {
    public static void main(String[] args) {
        Random rand = new Random();
        Integer guessNum = rand.nextInt(100);
        //show the guessNum
        System.out.println("The number to guess: " + guessNum);
        Integer myGuess = 0;

        //using scanner
        Scanner input = new Scanner(System.in);
        while(myGuess!=guessNum){
            myGuess = input.nextInt();
            if(myGuess < guessNum){
                System.out.println("The number you guess is lower.");
            }else if(myGuess > guessNum){
                System.out.println("The number you guess is higher.");
            }
            else{
                System.out.println("You guess it right!");
                input.close();
                System.exit(0);
            }
        }
    }
}
