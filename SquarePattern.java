import java.util.Scanner;

class SquarePattern
{
	public static void main()
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the dimension of Square");
	  int n = sc.nextInt();

	  for(int i=0;i<n;i++)
	  {
	   for(int j=0;j<=i;j++)
	   {
         System.out.print("*"+" ");
	   }
	   System.out.println();
	  }
	   for(int i=0;i<n;i++)
	  {
	   for(int j=0;j<=n-1-i;j++)
	   {
         System.out.print("*"+" ");
	   }
	   System.out.println();
	  }
	}
}