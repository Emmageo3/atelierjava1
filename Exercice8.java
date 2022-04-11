import java.util.Scanner;

public class Exercice8 {

    public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
 
       System.out.print("Entrez le premier nombre: ");
       int a = sc.nextInt();
 
       System.out.print("Entrez le second nombre: ");
       int b = sc.nextInt();
 
       System.out.println("Au départ a = " + a + "et b = " + b);
       int c;
 
       c = a;
       a = b;
       b = c;
 
       System.out.println("A l'arrivée a = " + a + "et b = " + b);
      
      
   }

    
}
