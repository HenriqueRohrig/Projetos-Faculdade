//4)Elabore um algoritmo que leia 10 números e mostre a soma dos
//números divisíveis por 3.
import java.util.Scanner;
public class Divisiveis{
  public static void main (String args[]) {
    int soma=0;
    Scanner leia = new Scanner (System.in);
    for (int cont=0; cont<10; cont++){
       System.out.println ("Digite um num:");
       int num = leia.nextInt();  
       if (num%3==0){
         soma=soma+num;
         System.out.println ("O num: "+num+"  "+"é divisível por 3"); 
       }else{
       System.out.println ("O num: "+num+"  "+"não é divisível por 3");   
    }
    }
    System.out.println ("A soma dos nums divisíveis é:"+soma);
  }
}