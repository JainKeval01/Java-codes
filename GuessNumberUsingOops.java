import java.util.Scanner;
import java.util.Random;
 class GuessNumber 
{
    int noOfGusses=0;
    int compNumber,userNumber;
    public GuessNumber()
    {
        Random random=new Random();
        compNumber=random.nextInt(1,50);
    }
    public void userinput(int a)
    {
        userNumber=a;
    }
    public boolean checkTheNumber()
    {
           if(userNumber>compNumber)
            {
                System.out.println("The Number  is Bigger then the computer Number..");
                noOfGusses++;
                return false;

            }
            else if(userNumber<compNumber)
            {
                System.out.println("The Number  is Smaller then the computer Number..");
                noOfGusses++;
                return false;
            }
                System.out.println("You Guessed the Number Right in "+ noOfGusses + " Guesses");
                return true;
                
            
       
    }
    
}

public class GuessNumberUsingOops {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        GuessNumber guessnumber=new GuessNumber();
        System.out.println("Enter a Number To Guess:");
        guessnumber.userinput(scanner.nextInt());
        while(!guessnumber.checkTheNumber())
        {
            System.out.println("Guess the Number again:");
            guessnumber.userinput(scanner.nextInt());
        }
       
        scanner.close();
    }
}
