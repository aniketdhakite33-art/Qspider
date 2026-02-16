import java.util.Scanner;

class VowelOrConso{
	  public static void main(String []args)
	  {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Value: ");
       char ch = sc.next().charAt(0);

       String op = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' || ch=='A'||ch=='E'||ch=='I'||ch=='0'||ch=='U')?
                   (ch+" is a Vowel"):
                   (ch+" is a Consonant");
        System.out.println(op);

	  }
}