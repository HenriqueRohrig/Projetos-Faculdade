public class Fatorial { // não consegui desbugar alterando apenas uma linha.
  public static void main (String args []) {
    
    int i, fat;
    
    fat = 1;
      
      i = Entrada.leiaInt ("Digite um valor: ");
    
    while (i > 0) {
      fat = fat*(i);
      i = i - 1;
    }
      System.out.println("O fatorial de " + i + " é " + fat);
  }
}
