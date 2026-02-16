import java.util.Scanner;

class EvenOdd
{
  public static void main(String[]args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number");
   int a = sc.nextInt();

   String op = (a%2==0)?
               (a+" is even"):
               (a+" is odd");

   System.out.println(op);

  }

}