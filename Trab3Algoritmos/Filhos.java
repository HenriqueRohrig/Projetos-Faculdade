public class Filhos {
  public static void main (String args[]) {
    
   int nf,a,b,c,d;
   char nome;
   
   a=0;
   b=0;
   c=0;
   d=0;
   int i=0;
   
   while (i<8){
     
     nf=Entrada.leiaInt("Digite o num de filhos:");
     nome=Entrada.leiaChar("Digite o seu nome: ");
     
     if (nf>=1 & nf<=3){
       a++;
     }else{
       if (nf>=4 & nf<=7){
       b++;
     }else{
       if (nf>=8) {
       c++;
     }else{
       d++;
     }
     }
     }
     i++;
   }
     System.out.println("pessoas tem de 1 a 3 filhos:"+a);
     System.out.println("pessoas tem de 4 a 7 filhos:"+b);
     System.out.println("pessoas tem de 8 ou mais filhos:"+c);
     System.out.println("pessoas que não tem filho:"+d);
     }
}