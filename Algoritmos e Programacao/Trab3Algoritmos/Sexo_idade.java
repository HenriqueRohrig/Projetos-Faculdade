//Ler idade e sexo de 15 pessoas e ap�s mostrar:
//a) N�mero de pessoas do sexo masculino.
//b) N�mero de pessoas do sexo feminino.
//c) N�mero de pessoas com idade at� 30 anos.
//d) N�mero de pessoas com idade igual ou superior a 60 anos.
public class Sexo_idade{
  public static void main (String args[]) {
    char s;
    int i,cont,a,b,c,d;
    a=0;
    b=0;
    c=0;
    d=0;
    cont=0;
      while (cont<5){
     s=Entrada.leiaChar("Digite o sexo (M/F):");
      i=Entrada.leiaInt("Digite a idade:");
     if (s=='M' || s=='m'){
       a++;
     }else{
       if (s=='F' || s=='f'){
       b++;
     }
     }
    if (i<30){
       c++;
     }else{
       if (i>=60){
       d++;
     }
     }
     cont++;
    }
    System.out.println("N�mero de pessoas do sexo masculino:"+a);
     System.out.println("N�mero de pessoas do sexo feminino:"+b);
     System.out.println("N�mero de pessoas com idade at� 30 anos:"+c);
     System.out.println("N�mero de pessoas com idade igual ou superior a 60 anos:"+d);
  }
}
