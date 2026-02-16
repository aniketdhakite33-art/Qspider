import java.util.Scanner;

class Table
{
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number :");
        int d = sc.nextInt();
        System.out.println("\nThis is the Table for : "+d);

                int a =1;

        while (a <=10)
        {
          int mult = d*a;
          System.out.println("\n"+d+"*"+a+" :"+mult);
          a++;
        }

    }
}

