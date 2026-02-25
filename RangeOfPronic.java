import java.util.Scanner;

class RangeOfPronic 
{
	public static void main(String[]args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the starting number : ");
      int start = sc.nextInt();
      System.out.println("Enter the ending number : ");
      int end = sc.nextInt();

      for(int i=0; i*(i+1)<=end; i++)
      {
       if (i*(i+1)>=start)
       {
         System.out.println(i*(i+1));
       }

      }

	}
}