import java.util.Scanner;

class BuzzNumber
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int a = sc.nextInt();

        if (a%7==0 || a%10 ==7)
        {
          System.out.println("It's a BUZZ number");
        }
        else 
        {
          System.out.println("It's not a BUZZ number");
        }

    }
}

