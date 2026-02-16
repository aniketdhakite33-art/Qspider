import java.util.Scanner;

class SwitchExample
{
  public static void main(String[]args)
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a Character");
  char ch = sc.next().toLowerCase().charAt(0);

    switch(ch)
    {
     case 'a','A','e','E','i','I','o','O','u','U':
                                                    System.out.println(ch+" is a VOWEL"); 
                                                    break;
                                                    
                                        default:          System.out.println(ch+" is a CONSONANT");
                                                    break;

    }
  }	
}