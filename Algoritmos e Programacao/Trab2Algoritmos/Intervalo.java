public class Intervalo {
  public static void main (String args[]) {
    
    int a, b;
    
    a = Entrada.leiaInt ("Digite o primeiro n�mero da cadeia de n�meros pares: ");
    b = Entrada.leiaInt ("Digite at� que n�mero a cadeia de pares ir�: ");
      
      for (int cont=a;cont<=b;cont++){
        if (cont % 2 == 0) {
        System.out.println("Entre o primeiro valor e o segundo valor, existem os seguintes n�meros pares: "+cont+"");
        }
      }
  }
}



          
    