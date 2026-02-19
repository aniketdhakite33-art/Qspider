

class Example121{
	            public static void main(String[] args) throws InterruptedException
	            {
                 System.out.println();
                 int duration =200;
                 int ct = 1;

                 for(int ch =1;ch <=200;ch++ )
                 {
                  System.out.println(ch);
                  Thread.sleep(duration);
                  duration+=100;
                  ct++;
                  if(ct%5==0) duration=100;
                 }
                 System.out.println();
	            }
}