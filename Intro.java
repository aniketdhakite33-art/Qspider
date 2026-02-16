import java.util.Scanner;

class Intro
{
	public static void main(String[]args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the name :");
	   String name = sc.nextLine();
	         


	  System.out.println("Enter the age :");
      int age = sc.nextInt();
      Scanner c = new Scanner(System.in);

      System.out.println("Enter the city :");
      String loc = c.nextLine();
      Scanner q = new Scanner(System.in);

      System.out.println("Enter Qualification :");
      String qualification = q.nextLine();
      Scanner d = new Scanner(System.in);

      System.out.println("Enter the Domain:");
      String domain = d.nextLine();

      System.out.println("Enter your mobile no. :");
      int no = sc.nextInt();
 	}
}