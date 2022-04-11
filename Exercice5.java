import java.util.Scanner;

public class Exercice5 {

    public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
 
       System.out.print("Entrez le nombre: ");
       int nbr = sc.nextInt();
 
       for(int i=0; i<10; i++){
 
           System.out.println(nbr + "x" + i + "=" + nbr*i);
 
       }
 
      
   }

    
}
