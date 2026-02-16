import java.util.Scanner;

class Absolute
{
  public static void main(String[]args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number: ");
   int a = sc.nextInt();

   int val = (a<0)? a*-1 : a;
   System.out.println(val+" is an Absolute Value");

  }
	
}