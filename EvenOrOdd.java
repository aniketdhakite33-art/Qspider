import java.util.Scanner;

class EvenOrOdd{
	
	public static void main(String []args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Number: ");
	  int ch = sc.nextInt();

      if(ch%2==0){

      System.out.println(ch+" is a EVEN");
      }
      else{
      System.out.println(ch+" is a ODD");

      }

	}
}