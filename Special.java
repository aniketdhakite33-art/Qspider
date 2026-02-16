import java.util.Scanner;

class Special
{
	  public static void main(String[]args)
	  {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Value : ");
	    char ch = sc.next().charAt(0);

	    String op = ((ch>='A'&&ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='0'))?
	                (ch+" is not a Special Character"):
	                (ch+" is a Special Character");

	         System.out.println(op);

	  }
}