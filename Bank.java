import java.util.Scanner;
import java.util.Arraylist;
import java.time.LocalDateTime;

class Bank{
    static String name;
    static String address;
    static String pancard;
    static long contact;
    static long adhar;
    static double balance;
    static LocalDateTime a;
    static int pin;

    public static void main(Strin[]args)
	{
     Scanner sc =new Scanner(System.in);
     welcomeloop;

     for( ; ;)
     {
     System.out.println("******** WELCOME *********");
     System.out.println("******* LAXMI CHEAT FUND *********");

     System.out.println("1.CREATE \n 2.LOGIN\n");
     System.out.println("Enter the RESPONSE : ");
     int dgtUser = sc.nextInt();

     switch(resp)
     {
       case 1:
              {
                if(name!=null)
                {
                    System.out.println("\n ACCOUNT ALREADY EXISTS \n");
                    continue;
                }
                System.out.println("\n ACCOUNT CREATION PAGE");
                System.out.println("Name : ");
                name = new Scanner(System.in).nextLine();

                System.out.println("Address : ");
                address = new Scanner(System.in).nextLine();

                System.out.println("Contact : ");
                contact = new Scanner(System.in).nextLong();

                System.out.println("Adhar : ");
                adhar = new Scanner(System.in).nextLong();

                System.out.println("Pancard : ");
                pancard = new Scanner(System.in).next();

                System.out.println("Enter an Amount : ");
                balance = new Scanner(System.in).nextDouble();

                System.out.println("Pin : ");
                pin = new Scanner(System.in).nextInt();

                System.out.println(" *************** ACCOUNT CREATED SUCCESSFULLY *****************");
                break;




              }
        case 2: 
            {
                System.out.println("\n WITHDRAW AMOUNT MODULE \n");
                System.out.println(" Enter an amount : ");
                double wdrwAmt = new Scanner(System.in).nextDouble();
                System.out.println("Enter your pin : ");
                int pin2 = new Scanner(System.in).nextInt();

                if(pin2 == pin)
                {
                 if(wdrwAmt<=balance)
                 {
                    balance -= wdrwAmt;
                    System.out.println("\n ACCOUNT DEBITED SUCCESSFULLY \n");

                 }
                 else
                 {
                   System.out.println("\n INSUFFICIENT FUNDS \n");

                 }
                }
                else
                {
                    System.out.println("\n INVALID PIN \n");
                }
                break;
            }
        case 3:
            {
                System.out.println("\n CHECK BALANCE MODULE \n");
                System.out.println("Enter your pin : ");
                int pin2 = new Scanner(System.in).nextInt();

                if(pin2 == pin)
                {
                  System.out.println("Your account balance is :"+balance+"rs. ");
                }
                else
                {
                    System.out.println("\n INVALID PIN \n");
                }
                break;
            }
        case 4:
            {
                System.out.println("\n THANKYOU & VISIT AGAIN 🙏🏻🙏🏻 \n");
                contiue welcomeLoop;
            }
        default:
            {
                System.out.println("\n INVALID RESPONSE \n");
                
            }
     }
     }

	}
}