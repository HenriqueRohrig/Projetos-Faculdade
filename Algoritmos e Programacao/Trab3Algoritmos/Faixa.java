//3) Desenvolva um algoritmo que leia 5 n?s e diga se o n?mero est? ou n?o na
//faixa de 1200 ? 3000 e quantos est?o nesta faixa.
import java.util.Scanner;
public class Faixa{
  public static void main (String args[]) {
    int contf=0;
    Scanner leia = new Scanner (System.in);
    for (int cont=0; cont<5; cont++){
       System.out.println ("Digite um num:");
       int num = leia.nextInt();  
       if (num>=1200 & num<=3000){
         contf++;
        System.out.println ("O num: "+num+"  "+"est? na faixa de 1200 a 3000"); 
       }else{
       System.out.println ("O num: "+num+"  "+"n?o est? na faixa de 1200 a 3000");   
    }
    }
    System.out.println ("A quantidade de nums na faixa ?:"+contf);
  }
}
      