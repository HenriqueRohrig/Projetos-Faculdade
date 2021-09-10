import java.util.Scanner;
import java.util.Random;
public class prova_2 {
  public static void main (String args[]) {
    
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      
      int[] mata = new int[20];
      int[] matb = new int[20];
      int[] matc = new int[20];
      
      for (int i=0; i < mata.length; i++) {
        
        System.out.println ("Digite um valor a ser armazenado: ");
        mata[i] = input.nextInt(10);
      }
      for (int i=0; i < mata.length; i++) {
        
        matb[i] = mata[i];
        matc[i] = mata[i] + 2;
        matb[i] = matc[i];
      }
      System.out.println ("Matriz A: ");
      for (int i=0; i < mata.length; i++) {
        System.out.print (mata[i]+"  ");
      }
      System.out.println (" ");
      System.out.println ("----------------------------------------------------------------");
      System.out.println ("Matriz B: ");
      for (int i=0; i < mata.length; i++) {
      System.out.print (matb[i]+"  ");
      }
      System.out.println (" ");
  }
}

        
        

          
        
      
      