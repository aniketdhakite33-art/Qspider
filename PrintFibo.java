import java.util.Scanner;

class PrintFibo
{
	public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number: ");
       int num = sc.nextInt();

       int n1=0,n2=1,ans;

       for(int i=0;i<num;i++)
       {
         ans = n1+n2;

         System.out.println(n1);

         n1=n2;
         n2=ans;

       }     

	}
}