import java.util.Scanner;

class FarenhietToCelcius 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        float temp = sc.nextFloat();
        System.out.println("1. Celcius to Farenhiet  2. Farenhiet to Celcius");
        int resp = sc.nextInt();
        
        switch(resp)
        {
            case 1 :
                     System.out.println("Celcius to farenhiet :"+((temp*9/5)+32));
                     break;
            case 2 : 
                     System.out.println("Farenhiet to Celsius : "+(temp-32)*5/9);
                     break;
                     
        }
    }
}