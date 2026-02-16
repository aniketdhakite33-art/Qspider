import java.util.Scanner;

class AlphaDigi{
	
	    public static void main(String[]args)
	    {
	     Scanner sc= new Scanner(System.in);
	     System.out.println("Enter the Value");
	     char ch = sc.next().charAt(0);

	     String op = (ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>=0 && ch<=9)?
	                 ((ch>='A'&&ch<='Z'|| ch>='a'&&ch<='z')?(ch+" is a Character"):(ch+"is not a Character")):
	                 ((ch>='0' && ch<='9') ? (ch+" is a Digit"):  (ch+" is not a digit"));

	     System.out.println(op);
	    }
}