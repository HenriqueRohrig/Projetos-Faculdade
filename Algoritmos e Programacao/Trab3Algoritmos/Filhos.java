//1)Ler o nome e n?mero de filhos de 8 pessoas, mostrando:
//a. Quantas pessoas t?m de 1 a 3 filhos.
//b. Quantas pessoas t?m de 4 a 7 filhos.
//c. Quantas pessoas t?m 8 filhos ou mais.
//d. Quantas pessoas n?o t?m filho
public class Filhos {
  public static void main (String args[]) {
   int nf,a,b,c,d;
   a=0;
   b=0;
   c=0;
   d=0;
   int i=0;
   while (i<8){
     nf=Entrada.leiaInt("Digite o num de filhos:");
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
     System.out.println("pessoas t?m de 1 a 3 filhos:"+a);
     System.out.println("pessoas t?m de 4 a 7 filhos:"+b);
     System.out.println("pessoas t?m de 8 ou mais filhos:"+c);
     System.out.println("pessoas n?o t?m filho:"+d);
     }
   }

   