import java.util.Scanner;
import java.util.Random;
 class GuessNumber 
{
    int noOfGusses=0;
    int compNumber,userNumber;
    boolean gussed=false;
    public GuessNumber()
    {
        Random random=new Random();
        compNumber=random.nextInt(1,50);
    }
    public void checkTheNumber()
    {
      do
       {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A number to guess:");
        int userNumber=scanner.nextInt();
            if(userNumber==compNumber)
            {
                System.out.println("You Guessed the Number Right in "+ noOfGusses + " Guesses");
                break;
                
            }
            else if(userNumber>compNumber)
            {
                System.out.println("The Number "+ userNumber + " is Bigger then the computer Number..");

            }
            else if(userNumber<compNumber)
            {
                System.out.println("The Number "+ userNumber + " is Smaller then the computer Number..");
            }
            noOfGusses++;

       }while(userNumber!=compNumber);
       
    }
    
}

public class GuessNumberUsingOops {
    public static void main(String[] args) 
    {
        GuessNumber guessnumber=new GuessNumber();
        guessnumber.checkTheNumber();
       
        
    }
}
