import java.util.Scanner;

class Factors
{
   public static void main(String[]args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Number : ");
     int num = sc.nextInt();

     int den =1 , ct =1;

     while(den <=num/2)
     {
       if(num%den==0)
       {
         System.out.println(den);
         ct++;
       }
       den++;
     }
        
         System.out.println("\nNo. of digit :"+ct);

   }	

}