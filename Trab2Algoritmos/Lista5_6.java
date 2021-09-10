  public class Lista5_6 {
  public static void main (String args[]) {
  
  int n1, n2, n3, n4, n5, troca ;
  boolean ordenado;
  n1=Entrada.leiaInt("Digite um num:"); 
  n2=Entrada.leiaInt("Digite um num:"); 
  n3=Entrada.leiaInt("Digite um num:"); 
  n4=Entrada.leiaInt("Digite um num:");
  n5=Entrada.leiaInt("Digite um num:"); 
 ordenado=false;
 while (ordenado==false){
   ordenado=true;
   if(n1 > n2){
   troca = n1;
   n1 = n2;
   n2 = troca;
   ordenado = false;
   }
   if(n2 > n3){
   troca = n2;
   n2 = n3;
   n3 = troca;
   ordenado = false;
   }
   if(n3 > n4){
   troca = n3;
   n3 = n4;
   n4 = troca;
   ordenado = false;
   }
   if(n4 > n5) {
   troca = n4;
   n4 = n5;
   n5 = troca;
   ordenado = false;
   }
 }
 System.out.println("o valores :"+n1+" "+n2+" "+n3+"  "+n4+"  "+n5);
  }
}