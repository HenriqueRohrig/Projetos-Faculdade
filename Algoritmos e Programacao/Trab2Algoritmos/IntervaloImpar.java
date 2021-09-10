public class IntervaloImpar {
  public static void main (String args []) {
    
    int a, b;
    
    a = Entrada.leiaInt ("Digite o primeiro número da cadeia de números ímpares: ");
    b = Entrada.leiaInt ("Digite até que número a cadeia de ímpares irá: ");
    
    for (int cont=a;cont<=b;cont++) {
      if ( cont % 2 == 1) {
        System.out.println ("Entre o primeiro valor e o segundo, existem os seguintes números ímpares: "+cont+"");
      }
    }
  }
}
