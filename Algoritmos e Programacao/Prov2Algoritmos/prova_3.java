import java.util.Scanner; //Questão com problema, não encontrei a solução
import java.util.Random;
public class prova_3 {
  public static void main (String args[]) {
    
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      
      int[] veta = new int[7];
      int[] vetb = new int[7];
      int[][] mata = new int[7][2];
      int[][] matb = new int[7][2];
      int[][] matc = new int[7][2];
      
      for (int i=0; i < veta.length; i++) {
        
        System.out.println ("Digite dois valores: ");
        veta[i] = input.nextInt();
        vetb[i] = input.nextInt();
      }
      for (int i=0; i < 2; i++) {
        for (int j=0; j < mata.length; j++) {         

          mata[j][i] = veta[i];
      }
     }
      for (int i=0; i < 2; i++) {
        for (int j=0; j < mata.length; j++) { 
          
          matb[j][i] = vetb[i];
        }
      }
      System.out.println ("Vetor A: ");
      for (int i=0; i < veta.length; i++) {
        System.out.print (veta[i]+"  ");
      }
      System.out.println (" ");
      System.out.println ("Vetor B: ");
      for (int i=0; i < veta.length; i++) {
      System.out.print (vetb[i]+"  ");
      }
      System.out.println (" ");
      System.out.println ("Matriz C: ");
      for (int i=0; i < mata.length; i++) {
        for (int j=0; j < 2; j++) {
          System.out.print(mata[j][i]+"  ");
        }
        System.out.println (" ");
      }
  }
}
  