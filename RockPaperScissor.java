import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        int i = 1, compChoice;
        int userChoice;
        int userScore = 0, compScore = 0;
        System.out.println("Welcome To Stone Paper Scissor Game: ");
        System.out.println("Enter Number Of Rounds You Want to Compete With Computer.");
        int chances = scanner.nextInt();//Number Of rounds can be played according to user..

        while (i <= chances) {
            System.out.println("Round" + i);
            System.out.print("Enter Your Choice-> 1 for rock,2 for paper and 3 for Scissor: ");
            compChoice = ran.nextInt(1, 3);//Random Number Generator.. 
            userChoice = scanner.nextInt();
            if (compChoice == 1 && userChoice == 2 || compChoice == 2 && userChoice == 3
                    || compChoice == 3 && userChoice == 1) {
                userScore += 1;
                System.out.println("You Won Because " + userChoice + " Beats " + compChoice);
            } else if (compChoice == 1 && userChoice == 3 || compChoice == 2 && userChoice == 1
                    || compChoice == 3 && userChoice == 2) {
                compScore += 1;
                System.out.println("Computer Won Because " + compChoice + " Beats " + userChoice);
            } else {
                System.out.println("Its Draw!");
            }
            i++;
        }
        System.out.println("Final Score:");
        if(userScore>compScore)
        {
        System.out.println("You Won With Score of:"+ userScore);
        }else if(compScore>userScore)
        {
            System.out.println("Computer Won With The Score Of: "+compScore );
        }
        else
        {
            System.out.println("Its A DRAW!");
        }
        scanner.close();
    }
}
