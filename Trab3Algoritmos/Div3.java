public class Div3 {
  public static void main (String args[]) {
    
   int nf,a,i;
   
   i=0;
   a=0;
   
   while (i<10){
     
     nf=Entrada.leiaInt("Digite um n�mero:");
     
     if (nf % 3 == 0){
         a=nf+a;
     i++;
  System.out.println("Soma dos n�meros divis�veis por 3: "+a);
     }
   }
  }
}
