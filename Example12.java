

class Example12{
	            public static void main(String[] args) throws InterruptedException
	            {
                 System.out.println();
                 int duration =200;
                 int ct = 1;

                 for(char ch ='A';ch <='Z';ch++ )
                 {
                  System.out.println(ch);
                  Thread.sleep(duration);
                  duration+=100;
                  ct++;
                  if(ct%6==0) duration=100;
                 }
                 System.out.println();
	            }
}