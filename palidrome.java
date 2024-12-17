import java.util.Scanner;
public class palidrome 
{
    public static void main(String[] args) 
    {
        Scanner scar=new Scanner(System.in);
        System.out.println("Enter a Word:");
        String plag=scar.next();
        char[] letter=plag.toCharArray();
        int i;
        int j;
        boolean palidrome=true;
        for(i=0;i<letter.length;i++)
        {
            for( j=letter.length-1-i;letter[j]==letter[i];j--)
            {
                
               break;
            }
            if(letter[j]!=letter[i])
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
