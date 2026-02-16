import java.util.Scanner;

class UpperOrNot{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the VALUE: ");
		char ch = sc.next().charAt(0);

		String op =(ch>='A'&& ch<='Z' ) ? 
		           (ch+" is a UPPERCASE Character"):
		           ((ch>='a'&&ch<='z')?(ch+" is a LOWERCASE Character") : (ch+" is not a Character"));

		           System.out.println(op);
	}
}