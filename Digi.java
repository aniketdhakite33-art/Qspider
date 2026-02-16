import java.util.Scanner;

class Digi{
            
            public static void main(String[]args)
            {
              Scanner sc = new Scanner(System.in);              

              System.out.println("Enter the value :");
              char ch = sc.next().charAt(0);

              String op = (ch>='0' && ch<='9') ? (ch+" is a Digit") : (ch+" is not a Digit");

              System.out.println(op);
            } 
	
}