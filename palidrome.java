import java.util.Scanner;
public class palidrome 
{
    public static void main(String[] args) 
    {
        Scanner scar=new Scanner(System.in);
        System.out.println("Enter a Word:");
        String plag=scar.next();
        char[] letter=plag.toCharArray();
        boolean palidrome=true;
        for(int i=0;i<letter.length/2;i++)
        {
            if(letter[i]!=letter[letter.length-1-i])
            {
                System.out.println("The word: "+ plag+" is not a palidrome.");
                palidrome=false;
                break;
            }
    
        }
        if(palidrome)
        {
        System.out.println("The word: "+ plag+" is palidrome.");
        }
        scar.close();
    }
    
}
