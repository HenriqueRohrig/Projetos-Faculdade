public class P5FluxogramaFiel {
  public static void main (String args []) {
    
    int num;
    
    num = Entrada.leiaInt("Escreva um número: ");
    if (num % 2 == 0){
      System.out.println("Caminho da direita");
      num = (num*2);
      num = (num+num);
    }else{
      num = 8;
    }
      System.out.println(num);
  }
}

    