public class Empresa {
  public static void main (String args[]) {
    
   int i,a,b,c,d;
   char sexo,op;
   
   a=0;
   b=0;
   c=0;
   d=0;
   i=0;
   
   while (i<2) {
     
     sexo=Entrada.leiaChar("Qual o seu sexo? (M ou F): ");
     op=Entrada.leiaChar("Qual a sua resposta? (S ou N): ");
     
     if (op == 'S') {
       a++;
     }else{
       if (op == 'N') {
       b++;
       }
     }
       if ((sexo == 'F') && (op == 'S')) {
       c++;
     }else{
       if ((sexo == 'M') && (op == 'N')) {
       d++;
       }
     }
       i++;
   }
     System.out.println("Quantidades de pessoas que responderam 'Sim': "+a);
     System.out.println("Quantidades de pessoas que responderam 'N�o': "+b);
     System.out.println("Quantidade de pessoas do sexo Feminino que disseram 'Sim'"+c);
     System.out.println("Quantidade de pessoas do sexo Masculino que disseram 'N�o'"+d);
     System.out.println("N�mero de pessoas pesquisadas: "+i);
  }
}
