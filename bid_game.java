// Bid On The Random Single Digit Number  Generated By the Computer Between 0 to 5
import java.util.Scanner;
import java.util.Random;
public class bid_game {
    public static void main(String[] args) 
    {
        Scanner scar=new Scanner(System.in);
        Random ran=new Random();
        int num=ran.nextInt(6); //Random Digit Generator;
        int balance=5000;
        int i=1;
        int Chances=3;
        System.out.println("Welcome To The Biding Game:");
        System.out.println("Guess The Single Digit Number That is Gererated By the Computer Between 0 to 5.\n ");
        System.out.println("You Have three Chances To Guess the Number And Double Your Amount.\n");
        while (i<=Chances) 
        {
            if (balance==0) 
            {
                System.out.println("Out of Balance,Can't Play Further!");
                break;
            }
            System.out.println("\nRound: "+i);
            System.out.println("Your Balance is: "+ balance+"\n");
            System.out.println("Enter a Number u want to bid on between 0 to 5:");
            int bid_number=scar.nextInt();
            System.out.println("Enter Biding amount:");
            int amount=scar.nextInt();
            if(amount>balance&&balance!=0)
            {
                System.out.println("\nInsufficient Biding amount,U Have Only "+balance+" Balance");
                System.out.println("Enter Biding amount again:");
                amount=scar.nextInt();
            }
            if(bid_number==num)
            {
                System.out.println("\nYOU WON!!");
                balance+=amount*2; //Doubling The Amount In Balance.
                System.out.println("\nYour balance is:"+balance);
                System.out.println("Thanks For Playing!!!");
                return;
            }
            else
            {
                System.out.println("\nYOU GUSSED IT WRONG!!");
                balance -= amount;
            }
            
            i++;
        }
            System.out.println("\n GAME OVER");
            System.out.println("Your Final Balance is: "+balance);
            System.out.println("Thanks For Playing!!!");

scar.close();       
    }

}
