import java.util.Scanner;
public class P1TrocaDeNumeros {
  public static void main (String args []) {   
    
    int num, I, B;

    Scanner read = new Scanner(System.in);
    
    num = read.nextInt();
    
    if (num > 0){
      I = num;
      System.out.println("O n�mero � maior do que zero, sendo ele: " +I);
      
    }else{
      
      B = num;
    System.out.println("O n�mero � MENOR do que zero, sendo ele: " +B);
    }
  }
}

        
      
     