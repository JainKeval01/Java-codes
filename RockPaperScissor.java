import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static String choice(int a)
    {
        if(a==1)
        {
            return "Rock";
        }
        else if(a==2)
        {
            return "Paper";
        }
        else
        {
            return "Scissor";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        int i = 1, compChoice;
        int userChoice;
        int userScore = 0, compScore = 0;
        System.out.println("Welcome To Stone Paper Scissor Game: ");
        System.out.print("Enter Number Of Rounds You Want to Compete With Computer.");
        int chances = scanner.nextInt();//Number Of rounds can be played according to user..

        while (i <= chances) {
            System.out.println("\n");
            System.out.println("Round" + i);
            System.out.println("Enter Your Choice Accordingly:\n1 Rock\n2 Paper\n3 Scissor ");
            compChoice = ran.nextInt(1, 4);//Random Number Generator.. 
            userChoice = scanner.nextInt();
            if(userChoice>3||userChoice<1)
            {
                System.out.println("Invalid Choice!");
                continue;
            }
            if (compChoice == 1 && userChoice == 2  
                || compChoice == 2 && userChoice == 3
                || compChoice == 3 && userChoice == 1) 
            {
                System.out.println("\nYour Choice: "+choice(userChoice));
                System.out.println("Computer  Choice: "+choice(compChoice));
                System.out.println("You Won Because " + choice(userChoice) + " Beats " + choice(compChoice));
                userScore += 1;
            } 
            else if (compChoice == 1 && userChoice == 3 
                    || compChoice == 2 && userChoice == 1
                    || compChoice == 3 && userChoice == 2) 
            {
                System.out.println("\nYour Choice: "+choice(userChoice));
                System.out.println("Computer  Choice: "+choice(compChoice));
                System.out.println("Computer Won Because " + choice(compChoice) + " Beats " + choice(userChoice));
                compScore += 1;
            } else {
                System.out.println("\nYour Choice: "+choice(userChoice));
                System.out.println("Computer  Choice: "+choice(compChoice));
                System.out.println("Its Draw!");
            }
            i++;
        }
        System.out.println("\nFinal Score:");
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
