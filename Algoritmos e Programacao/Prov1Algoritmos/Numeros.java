public class Numeros {
  public static void main (String args[]) {
    
    int a,b,c,d,i,num,med;
    
    i=0;
    a=0;
    b=0;
    c=0;
    d=0; 

      while(i<10) {
      
      num=Entrada.leiaInt("Digite um número: ");
      
      if(num>0) {
       a++;
    }
      if(num % 2 == 0) {
       b++;
    }
      if(num % 2 == 1) {
      c++;
    }
      if(num % 2 == 1 & num % 3 == 0 & num % 4 == 0) {
      d++;
    }else{
      med=(num/10);
      }
   i++;
  }
  System.out.println("A quantidade de números inteiros e positivos: "+a);
  System.out.println("A quantidade de números pares: "+b);
  System.out.println("A quantidade de números ímpares: "+c);
  System.out.println("A quantidade de números ímpares divisíveis por 3 e 4: "+d);
  System.out.println("A média dos itens: "+med);
  }
}

      
      
      
      
    
    