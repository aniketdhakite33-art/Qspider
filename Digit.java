import java.util.Scanner;

class Digit{
            
            public static void main(String[]args)
            {
              Scanner sc = new Scanner(System.in);              

              System.out.println("Enter the value :");
              int ch = sc.nextInt();

              String op = (ch>='0' && ch<='9') ? (ch+" is a Digit") : (ch+" is not a Digit");

              System.out.println(op);
            } 
	
}