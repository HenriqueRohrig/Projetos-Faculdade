public class P7Calculadora {
  public static void main (String args []) {
    
  char soma;
  int n1;
  int n2;
  int result;
  
   soma = Entrada.leiaChar("Digite o tipo de equa��o (+,-,*,/,%): ");
   n1 = Entrada.leiaInt("Digite um valor: ");
   n2 = Entrada.leiaInt("Digite outro valor: ");
   
   if (soma == '+') {
    result = (n1 + n2);
    System.out.println("Resultado da equa��o: ");
    System.out.println(result);
  }else{
    if (soma == '-') {
    result = (n1 - n2);
    System.out.println("Resultado da equa��o: ");
    System.out.println(result);
  }else{  
    if (soma == '*') {
    result = (n1 * n2);
    System.out.println("Resultado da equa��o: ");
    System.out.println(result);
  }else{  
    if (soma == '/') {
    result = (n1 / n2);
    System.out.println("Resultado da equa��o: ");
    System.out.println(result);
  }else{  
    if (soma == '%') {
    result = (n1 % n2);
    System.out.println("Resultado da equa��o: ");
    System.out.println(result);
    }
  }
  }
  }
  }
  }
}

    
         
  
  
  
  
   
  
    
    