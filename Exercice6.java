import java.util.Scanner;

public class Exercice6 {

    public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
 
       System.out.print("Entrez le rayon: ");
       int rayon = sc.nextInt();
 
       System.out.println("Le périmetre du cercle est : " + 2*3.14*rayon);
       System.out.println("La surface du cercle est : " + 3.14*rayon*rayon);
 
      
      
   }

    
}
