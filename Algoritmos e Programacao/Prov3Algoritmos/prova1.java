public class prova1 {

 public static void main (String args[]) {
   
   char tpl;
   int lv,pa,pb,pc;
   
   System.out.println("Favor digitar o tipo de livro em letra maiúscula."); //Ainda nao aprendi a utilizar o upper case corretamente, então uso esse método para não ter erro.
   tpl=Entrada.leiaChar("Qual o tipo de livro que deseja comprar? (A,B,C)");
   System.out.println("Livro A = 100R$, Livro B = 150R$, Livro C = 200R$");
   lv=Entrada.leiaInt("Quantos irá comprar?");
     
     if(tpl=='A') {
     pa=(100*lv);
     System.out.println("Total a pagar:"+pa);     
   }
     if(tpl=='B') {
     pb=(150*lv);
     System.out.println("Total a pagar:"+pb);
   }
     if(tpl=='C') {
     pc=(200*lv);
     System.out.println("Total a pagar:"+pc);
   }
     if(lv > 10) {
     System.out.println("Mais de 10 unidades comecializadas!");
    }
  }
}
     
       
     
   
   
   
   