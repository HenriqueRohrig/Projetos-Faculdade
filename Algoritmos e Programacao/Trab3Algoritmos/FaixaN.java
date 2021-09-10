public class FaixaN {
  public static void main (String args[] ) {
    
   int num,a,i;

   a=0;
   i=0;
   
   while (i<5){
     
     num=Entrada.leiaChar("Digite um número: ");
     
     if ((num >= 1200)||(num <= 3000)){
       a++;
         System.out.println(+num+" está entre 1200 e 3000");
     }else{
       if ((num <= 1200)||(num >= 3000)){
         System.out.println(+num+" não está entre 1200 e 3000");
       }
     }
     i++;
   }
     System.out.println("Quantidade de números entre 1200 e 3000: "+a);
  }
}
