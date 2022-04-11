import java.util.Scanner;

public class Exercice4 {

    public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
 
       System.out.print("Entrez le premier nombre: ");
       int nbr1 = sc.nextInt();
 
       System.out.print("Entrez le second nombre: ");
       int nbr2 = sc.nextInt();
 
       System.out.println(nbr1 + "x" + nbr2 + "=" + nbr1*nbr2);
   }

    
}
