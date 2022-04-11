import java.util.Scanner;

public class Exercice7 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Entrez le premier nombre: ");
        int nbr1 = sc.nextInt();
  
        System.out.print("Entrez le second nombre: ");
        int nbr2 = sc.nextInt();
  
        System.out.print("Entrez le troisieme nombre: ");
        int nbr3 = sc.nextInt();
  
        System.out.println("La moyenne de ces nombres est: " + (nbr1+nbr2+nbr3)/3);
       
       
    }
 
    
}
