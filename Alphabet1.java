import java.util.Scanner;

class Alphabet1{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the VALUE: ");
		char ch = sc.next().charAt(0);

		String op =(ch>='A'&& ch<='Z' || ch>='a'&& ch<='z') ? 
		           ((ch>='A'&&ch<='Z')?(ch+" is a UPPERCASE Character"):(ch+" is a LOWERCASE Character")):
		           ((ch>='0'&& ch<='9')?(ch+" is a Digit") : (ch+" is a Special Character"));

		           System.out.println(op);
	}
}