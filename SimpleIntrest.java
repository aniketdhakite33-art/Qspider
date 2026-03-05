import java.util.Scanner;

class SimpleIntrest
{
	public static void main(String[]args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Princple Amount :");
	  int amount = sc.nextInt();

	  System.out.println("Enter the rate of intrest :");
	  int intrest = sc.nextInt();

	  System.out.println("Enter the time in :");
	  int time = sc.nextInt();

	  double simpleIntrest = (amount*intrest*time)/100;
	  System.out.println("Simple Amount of the amount :"+simpleIntrest);

	}
}