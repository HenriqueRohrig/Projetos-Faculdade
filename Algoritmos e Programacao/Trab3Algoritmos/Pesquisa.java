//5) Uma empresa fez uma pesquisa com 10 pessoas para saber a aceita��o de um produto
//lan�ado no mercado, para isso devemos ler o sexo e a resposta de cada pessoa pesquisada.
//No final informar:
//a. Quantas pessoas responderam SIM.
//b. Quantas pessoas responderam N�O.
//c. Quantas pessoas do sexo feminino disseram SIM.
//d. Quantas pessoas do sexo masculino disseram N�O.
//e. Quantas foram as pessoas pesquisadas.
public class Pesquisa {
  public static void main (String args[]) {
    char s,resp;
   int qa,qb,qc,qd;
   qa=0;
   qb=0;
   qc=0;
   qd=0;
   int i=0;
   while (i<10){
     s=Entrada.leiaChar("Digite o sexo:(M/F)");
     resp=Entrada.leiaChar("Digite a resposta(S/N)");
     if (resp=='S' || resp=='s'){
       qa++;
     }else{
       if (resp=='N' || resp=='n'){
       qb++;
     }
     }
     if (resp=='S' || resp=='s' & s=='F' || s=='f'){
       qc++;
     }else{
        if (resp=='N' || resp=='n' & s=='M' || s=='m'){
       qd++;
     }
     }
     i++;
     }
     
   System.out.println("Quantas pessoas responderam SIM:"+qa);
     System.out.println("Quantas pessoas responderam N�O:"+qb);
     System.out.println("Quantas pessoas do sexo feminino disseram SIM:"+qc);
     System.out.println("Quantas pessoas do sexo masculino disseram N�O:"+qd);
     System.out.println("Quantas foram as pessoas pesquisadas:"+i);
     }
   }