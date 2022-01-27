
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in); //ask if they want to play craps
        System.out.print("Would you like to play craps? (Y/N) ");
        String response = in.nextLine();
        while (!(response.equals("Y")) && !(response.equals("N")))
        {
            System.out.print("Only type (Y/N)");
            response = in.nextLine();
        }
        if (response.equals("Y"))
        {
            System.out.print("Do you need instructions? (Y/N) "); //ask if they need instructions
            String response1 = in.nextLine();
            while (!(response1.equals("Y")) && !(response1.equals("N")))
            {
                System.out.print("Only type (Y/N)");
                response1 = in.nextLine();
            }
            if (response1.equals("Y"))
            {
                System.out.println("Here are instructions");
                System.out.println("1. A player rolls two six-sided dice and adds the numbers rolled together.");
                System.out.println("2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point.");
                System.out.println("3. The player continues to roll the two dice again until one of two things happens: either they roll the point from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
            }
            int die1;
            int die2;
            int point;
            String response3 = "Y";
            String response4 = "";
            while (response3.equals("Y"))
            {
                System.out.print("Press <Enter> to roll your dice");
                response4 = in.nextLine();
                while (!(response4.equals("")))
                {
                    System.out.print("You didn't press <Enter> >:( Press <Enter> to roll the dice");
                    response4 = in.nextLine();
                }
                System.out.println("Rolling dice...");
                sleep(750);
                die1 = (int) (Math.random()*6) + 1;
                die2 = (int) (Math.random()*6) + 1;
                System.out.println("You rolled a " + (die1 + die2));
                if (die1+die2 == 7 || die1+die2 == 11)
                {
                    System.out.println(". You win!!!");
                    System.out.print("Would you like to play again? (Y/N)");
                    response3 = in.nextLine();
                    while (!(response3.equals("Y")) && !(response3.equals("N")))
                    {
                        System.out.println("Only type (Y/N)");
                        response3 = in.nextLine();
                    }
                }
                else if (die1+die2 == 2 || die1+die2 == 3 || die1+die2 == 12)
                {
                    System.out.println("You lose. :(");
                    System.out.print("Would you like to play again? (Y/N)");
                    response3 = in.nextLine();
                    while (!(response3.equals("Y")) && !(response3.equals("N")))
                    {
                        System.out.print("Only type (Y/N)");
                        response3 = in.nextLine();
                    }
                }
                else
                {
                    System.out.println((die1+die2) + " is your point");
                    point = (die1 + die2);
                    die1 = 0;
                    die2 = 0;
                    while ((die1+die2) != point && (die1+die2) != 7)
                    {
                        System.out.print("Press <Enter> to roll your dice");
                        response4 = in.nextLine();
                        while (!(response4.equals("")))
                        {
                            System.out.print("You didn't press <Enter> >:( Press <Enter> to roll the dice");
                            response4 = in.nextLine();
                        }
                        System.out.println("Rolling dice...");
                        sleep(750);
                        die1 = (int) (Math.random()*6) + 1;
                        die2 = (int) (Math.random()*6) + 1;
                        System.out.println("You rolled a " + (die1 + die2));
                    }
                    if ((die1 + die2) == point)
                    {
                        System.out.print("You win! Do you want to play again? (Y/N)");
                        response3 = in.nextLine();
                        while (!(response3.equals("Y")) && !(response3.equals("N")))
                        {
                            System.out.print("Only type (Y/N)");
                            response3 = in.nextLine();
                        }
                    }
                    else if ((die1 + die2) == 7)
                    {
                        System.out.print("You lose. Do you want to play again? (Y/N)");
                        response3 = in.nextLine();
                        while (!(response3.equals("Y")) && !(response3.equals("N")))
                        {
                            System.out.print("Only type (Y/N)");
                            response3 = in.nextLine();
                        }
                    }
                }
                point = -1;
                die1 = -1;
                die2 = -1;
            }

        }
        System.out.println("Bye :(");
    }

    public static void sleep(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}

/*

COMMENTS FROM THE INSTRUCTOR:

Jacob... this *is* Jacob's program, isn't it? ;)  I didn't see your name in the JavaDoc
comments up there. Fortunately, I got it from the git username included in the log. 

Really nice work on this, Jacob. The program executes the rules of the game of Craps
just as it should. You also took the trouble to include a short delay in the presentation
of the roll of the dice, almost as if the computer was waiting to see the result of the
roll--very clever!

A few things to improve on:

1. The intention was for there to be a separate Die class that would interact with the
   Craps.java main() program. That was by design, with the intention of having you
   become more familiar with that process. You should have done that! :)

2. In the handout for this assignment, there was information on how to make the Yes/No
   responses answered with a default value by simply hitting [Enter], rather than having
   to press "Y" or "N" for every answer. That's a useful strategy, and one that you
   should know how to use. Be sure to check it out.

3. You did some error-checking with the user input which is a really nice touch. That
   *does* add a lot of code to your program, so in the future, you might consider
   writing a separate `Response` class that would allow you to call a method in that
   utility for performing that same function. That has the effect of simplifying your
   code in the main(). Something to consider in subsequent projects!

Overall, though, this is very nicely executed. Looking forward to seeing more of your
work this semester!

SCORE: 47/50

*/

