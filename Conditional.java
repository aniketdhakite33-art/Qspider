class Conditional
{
   public static void main(String[] args)
   {
    int n1 = 1344;
    int n2 = 2364;
    int n3 = 30253;
      int smallest = n1<n2?n1:n2;

       smallest = n2<n3? n2:n3;
       smallest = n3<smallest? n3:smallest;
       System.out.println(smallest);
    
    }
}