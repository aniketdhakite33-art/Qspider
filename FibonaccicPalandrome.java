import java.util.Scanner;

class FibonaccicPalandrome
{
	public static void main(String[]args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Number :");
	  int num = sc.nextInt();

	  int n1=0,n2=1,ans;

	  while(true)
	  {
        ans = n1+n2;

          if(n1==num || n1>num)
          {
           break;
          }
           n1 = n2;
           n2=ans;
	  }

	  if(n1==num)
	  {
	     int rev =0;

	     for(int i=num;i!=0;i/=10)
	     {
	       rev = rev*10+(i%10);
	     }
	     if(num==rev)
	     {
	       System.out.println("It is Fibonaccic Palandrome");
	     }
	     else
	     {
	       System.out.println("It is Fibonaccic but not a Palandrome");
	     }
	  }
	  else 
	  {
	    System.out.println("It is not a Fibonaccic number");
	  }
	}
}