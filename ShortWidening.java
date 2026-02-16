class ShortWidening
{    
    public static void main(String[] args)
    {
       short s = 32767;
        System.out.println(s);

      // byte b = s;
      //  System.out.println(b);

      // char ch = s;
      //    System.out.println(ch);
      
         int i = s;
            System.out.println(i);
         
         long l = s;
            System.out.println(l);
       
         float f = s;
            System.out.println(f);

         double d = s;
            System.out.println(d);
     }
}