public class prova3 {

 public static void main (String args[]) {
   
   int ae,i,v1,v2,v3;
   
   i=0;
   ae=1;
   v1=0;
   v2=0;
   v3=0;  
   
   while (ae != 0) {
     
     ae=Entrada.leiaInt("Quantas refeições você faz por mês?");
     System.out.println("Digite 0 para encerrar a entrevista.");
     
     if(ae == 0) {
       break;
     }
     if(ae < 10) {
       v1++;
     }
     if(ae >= 10 & ae <= 20) {
       v2++;
     }
     if(ae > 20) {
       v3++;
     }
     i++;
   }
   System.out.println("Número de alunos entrevistados: "+i);
   System.out.println("Alunos que fazem menos de 10 refeições ao mês: "+v1);
   System.out.println("Alunos que fazem entre 10 e 20 refeições ao mês: "+v2);
   System.out.println("Alunos que fazem mais de 20 refeições ao mês: "+v3);
 }
}
   
       
     
     