public class IS {
  public static void main (String args[] ) {
    
   int idade,a,b,c,d;
   char sexo;
   a=0;
   b=0;
   c=0;
   d=0;
   int i=0;
   while (i<3){
     sexo=Entrada.leiaChar("Digite o seu sexo (M ou F): ");
     idade=Entrada.leiaInt("Digite sua idade: ");
     
     if (sexo=='M'){
       a++;
     }else{
       if (sexo=='F'){
       b++;
       }
     }
       if (idade>=60) {
       c++;
     }else{
       if (idade<=30) {
       d++;
       }
     }
     i++;
   }
     System.out.println("N�mero de pessoas do sexo masculino: "+a);
     System.out.println("N�mero de pessoas do sexo feminino: "+b);
     System.out.println("N�mero de pessoas com at� 30 anos: "+d);
     System.out.println("N�mero de pessoas com idade igual ou superior � 60 anos: "+c);
   }
  }