// Guess The Single Digit Generated By The Computer Between 0 To 5 
import java.util.Scanner;
import java.util.Random;
public class bid_game {
    public static void main(String[] args) 
    {
        Scanner scar=new Scanner(System.in);
        Random ran=new Random();
        int num=ran.nextInt(6); //Random Digit Generator Between 0 to 5 
        int balance=5000;
        int i=1;
        System.out.println("Welcome to the biding Game:");
        System.out.println("Enter number of rounds u want to play:");
        int rounds=scar.nextInt();

        while (i<=rounds) 
        {
            System.out.println("Enter a Number u want to bid on between 0 to 5:");
            int bid_number=scar.nextInt();
            System.out.println("Enter Biding amount:");
            int amount=scar.nextInt();
            if(amount>balance)  
            {
                System.out.println("\nAukat me reke boli laga");
                return;
            }
            if (balance==0) 
            {
                System.out.println("Out of Balance");
                return;
            }
            if(bid_number==num)
            {
                System.out.println("\n\nYOU WON!!!");
                balance+=amount*2;
            }
            else
            {
                System.out.println("YOU LOSE!");
                balance -= amount;
            }
            
            i++;
        }
        System.out.println("Your balance is:"+balance);
scar.close();       
    }

}
