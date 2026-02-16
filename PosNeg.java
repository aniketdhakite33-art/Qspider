import java.util.Scanner;

class PosNeg
{
  public static void main(String[]args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number");
   char ch = sc.next().charAt(0);

   String op = (ch>'0')?
               (ch+" is POSITIVE"):
               (ch+" is NEGATIVE");

   System.out.println(op);

  }

}