public class Exercice9 {

    public static int factorial(int n)
   {
       int f = n;
       for (int j = n - 1; j > 0; j--)
       {
           f = f*j;
       }
       return f;
   }
 
   public static void main(String[] args)
   {
       int f = factorial(3);
       System.out.println(f);
   }

    
}
