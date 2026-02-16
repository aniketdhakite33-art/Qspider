import java.util.Scanner;

class CurrencyConvertor{
	
	public static void main(String[]args)
	{
     Scanner sc =new Scanner(System.in);
     infiniteloop:

     for( ; ;)
     {
     System.out.println("\n*********** WELCOME TO CURRENCY CONVERTOR ************");

     System.out.println("************ CURRENCY CONVERTOR **************");
     System.out.println("Enter the amount(INR) : ");
     double amount = sc.nextDouble();

     System.out.println(" 1.USD \n 2.EURO \n 3.KWD \n 4.GBP \n 5.OMR \n 6.KYD \n 7.CHF \n 8.SGD \n 9.CAD \n 10.AUD");
     System.out.println("Enter your response: ");
     String resp = sc.next().toUpperCase();

     boolean assump = true;
     double convertedAmount= 0;
     if(resp.equals("USD"))
     {
        convertedAmount = amount/90.21;

     }
     else if(resp.equals("EURO"))
     {
        convertedAmount = amount/104.88;
        
     }
      else if(resp.equals("KWD"))
     {
        convertedAmount = amount/292.95;
        
     }
      else if(resp.equals("GBP"))
     {
        convertedAmount = amount/119.93;
        
     }
      else if(resp.equals("OMR"))
     {
        convertedAmount = amount/233.75;
        
     }
      else if(resp.equals("KYD"))
     {
        convertedAmount = amount/107.87;
        
     }
      else if(resp.equals("CHF"))
     {
        convertedAmount = amount/112.73;
        
     }
      else if(resp.equals("SGD"))
     {
        convertedAmount = amount/69.38;
        
     }
      else if(resp.equals("CAD"))
     {
        convertedAmount = amount/64.33;
        
     }
      else if(resp.equals("AUD"))
     {
        convertedAmount = amount/59.39;
        
     }
     else{
        assump = false;
        System.out.println("\n INVALID CURRENCY \n");

     }
     if(assump){
        System.out.printf("%n %10.2f INR = %.2f %s%n",amount,convertedAmount,resp);
     }
     }

	}
}