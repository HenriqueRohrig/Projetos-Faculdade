public class IntervaloImpar {
  public static void main (String args []) {
    
    int a, b;
    
    a = Entrada.leiaInt ("Digite o primeiro n�mero da cadeia de n�meros �mpares: ");
    b = Entrada.leiaInt ("Digite at� que n�mero a cadeia de �mpares ir�: ");
    
    for (int cont=a;cont<=b;cont++) {
      if ( cont % 2 == 1) {
        System.out.println ("Entre o primeiro valor e o segundo, existem os seguintes n�meros �mpares: "+cont+"");
      }
    }
  }
}
