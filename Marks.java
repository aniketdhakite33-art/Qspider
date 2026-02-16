import java.util.Scanner;

class Marks
{
	public static void main()
	{
	 Scanner a = new Scanner(System.in);
	 System.out.println("Enter Subject name :");
	 String sn1 = a.nextLine();

	 System.out.println("Enter marks for first subject :");
	 int sm1 = a.nextInt();

	 Scanner b = new Scanner(System.in);
	 System.out.println("Enter the Subject name :");
	 String sn2 = b.nextLine();

	 System.out.println("Enter marks for Second Subject : ");
	 int sm2 = b.nextInt();

	 Scanner c = new Scanner(System.in);
	 System.out.println("Enter the Subject name :");
	 String sn3 = c.nextLine();
	 

	 System.out.println("Enter marks for third Subject :");
	 int sm3 = c.nextInt();
	}
}