/*
Kaci Craycraft
kcraycraft45
 */


import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class Main
{
    public static Random random = new Random();
    public static int howManyGuess;
    public static int upperBound;
    public static int var;
    public static int guess;
    public static int ticker;
    public static String playBln;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to play a game? (yes/no): ");
        boooooolean();

        while(playBln.equalsIgnoreCase("yes"))
        {
            primeTheInput();

            for(int ticker = 1; ticker < howManyGuess; ticker++)
            {
                if (guess != var)
                {
                    if(guess < var)
                    {
                        System.out.print("\nYour guess is too low.  Guess again: ");
                        wrongGuess();
                    }
                    else if(guess > var)
                    {
                        System.out.print("\nYour guess is too high.  Guess again: ");
                        wrongGuess();
                    }
                }
                else
                {
                    System.out.println("\nYou guessed correctly!!");
                }
            }
            if(ticker == howManyGuess && guess != var)
            {
                System.out.println("\nYou guessed incorrectly and you are out of guesses!!\nGAME OVER");
            }
            System.out.print("\nWould you like to play another game? (yes/no): ");
            boooooolean();
        }
        System.out.println("\n\nGAME OVER\nGoodbye.");
    }
    public static void primeTheInput()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("\nHow many guesses would you like? ");
        howManyGuess = input.nextInt();
        input.nextLine();
        System.out.print("The random number will be between 1 and ");
        upperBound = input.nextInt() + 1;
        var = random.nextInt(1, upperBound);
        System.out.print("\nPick a number between 1 and " + (upperBound-1) + ": ");
        guess = input.nextInt();
        input.nextLine();
        System.out.println("You picked " + guess);
    }
    public static void wrongGuess()
    {
        Scanner input = new Scanner(System.in);

        guess = input.nextInt();
        input.nextLine();
        System.out.println("You picked " + guess);
    }
    public static void boooooolean()
    {
        Scanner input = new Scanner(System.in);

        playBln = input.nextLine();
    }
}
