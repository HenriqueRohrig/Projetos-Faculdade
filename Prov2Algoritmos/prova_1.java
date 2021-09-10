import java.util.Random;
public class prova_1 {
  public static void main (String args[]) {
    
    Random random = new Random();
    
    int[] vet1 = new int[10];
    int[] vet2 = new int[10];
    int[] vet3 = new int[10];
    
    for (int i=0; i < vet1.length; i++) {
      
      vet1[i] = random.nextInt(500);
    }
    for (int i=0; i < vet1.length; i++) {
      if (vet1[i] % 4 == 0) { 
        vet3[i] = vet1[i];
      }else{
        vet2[i] = vet1[i];
        vet2[i] = 1;
        vet3[i] = vet2[i];
    }
    }
    System.out.println ("----VETOR ORIGINAL----");
    for (int i=0; i < vet1.length; i++) {
    System.out.print(vet1[i]+"  ");
    }
    System.out.println (" ");
    System.out.println ("----VETOR DOS MÚLTIPLOS DE 4----");
    for (int i=0; i < vet1.length; i++) {
    System.out.print (+vet3[i]+"  ");
    }
    System.out.println(" ");
  }
}
      
      
      
      
      
      
      
      
      
      