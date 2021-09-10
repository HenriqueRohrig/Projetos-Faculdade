public class Intervalo {
  public static void main (String args[]) {
    
    int a, b;
    
    a = Entrada.leiaInt ("Digite o primeiro número da cadeia de números pares: ");
    b = Entrada.leiaInt ("Digite até que número a cadeia de pares irá: ");
      
      for (int cont=a;cont<=b;cont++){
        if (cont % 2 == 0) {
        System.out.println("Entre o primeiro valor e o segundo valor, existem os seguintes números pares: "+cont+"");
        }
      }
  }
}



          
    