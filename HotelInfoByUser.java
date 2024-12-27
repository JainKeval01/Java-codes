import java.util.Scanner;

public class HotelInfoByUser 
{
    public static boolean contains(int[][] arr,int roomnumber)
    {
        for(int[] i:arr)
        {
            for(int j:i)
            {
                if(roomnumber==j)
                {
                    return true;
                }
            }
            
        }
        return false;
    }
    public static int floorChecker(int [][] arr,int roomnumber)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(roomnumber==arr[i][j])
                {
                    return i+1;
                }
            }
        }
        return 0;
    }

    public static String roomDirection(int [][] arr,int roomnumber)
    {
        

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length/2;j++)
            {
                if(roomnumber==arr[i][j])
                {
                    return "Left Side";
                }
            }
        }
        return "Right Side";
    }
    public static void main(String[] args) 
    {
        
    
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter BUilding Name:");
        String name=scanner.next();
        System.out.println("Enter Number of Floors:");
        int floors=scanner.nextInt();
        System.out.println("Enter Number of Rooms in Floor:");
        int totalRooms=scanner.nextInt();
        int [][] hotel=new int[floors][totalRooms];

        for(int i=0;i<=floors-1;i++)
        {
            System.out.println("\nEnter Rooms For Floor "+(i+1));
            for(int j=0;j<=totalRooms-1;j++)
            {
                System.out.println("Enter Room Number for Room "+ (j+1) +" in Floor "+(i+1));
                hotel[i][j]=scanner.nextInt();
            }
        }
        
        for(int i=0;i<=floors-1;i++)
        {
            for(int j=0;j<=totalRooms-1;j++)
            {
                System.out.print(hotel[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter Room Number");
        int room=scanner.nextInt();
        if(contains(hotel, room))
        {
            int f=floorChecker(hotel, room);
            String direction =roomDirection(hotel, room);
            System.out.println("Your Room Is On the "+ direction + " of "+ f + " Floor of "+ name );
        }
        else
        {
            System.out.println("Not Such Room");
        }
        scanner.close();
    }
}
