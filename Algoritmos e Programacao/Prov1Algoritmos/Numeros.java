public class Numeros {
  public static void main (String args[]) {
    
    int a,b,c,d,i,num,med;
    
    i=0;
    a=0;
    b=0;
    c=0;
    d=0; 

      while(i<10) {
      
      num=Entrada.leiaInt("Digite um n�mero: ");
      
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
  System.out.println("A quantidade de n�meros inteiros e positivos: "+a);
  System.out.println("A quantidade de n�meros pares: "+b);
  System.out.println("A quantidade de n�meros �mpares: "+c);
  System.out.println("A quantidade de n�meros �mpares divis�veis por 3 e 4: "+d);
  System.out.println("A m�dia dos itens: "+med);
  }
}

      
      
      
      
    
    