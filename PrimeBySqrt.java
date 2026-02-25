import java.util.Scanner;

class PrimeBySqrt
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    
    int num = sc.nextInt();

    if(num==2)
    {
      System.out.println("It's a Prime");
    }
    else if(num==1 || num %2==0)
    {
      System.out.println("It's not a Prime");
    }
    else
    {
      int i=3;

      for(;i<=num;i++)
      {
        if(num%i==0)
        {
          break;
        }
      }
      if(i*i>num)
      {
        System.out.println("It's a Prime");
      }
      else
      {
        System.out.println("It's not a Prime");
      }
      
    }

  }
	
}