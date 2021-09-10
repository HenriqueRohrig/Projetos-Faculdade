public class Intervalos {
  public static void main (String args[]) {
    
    int i;
    double a,b,c,d,num;
    
      i=0;
      a=0;
      b=0;
      c=0;
      d=0;
        
        while(i<12) {
        
        num=Entrada.leiaDouble("Digite um número: ");
        
        if(num>=0 && num<=25.9) {
          a++;
        }
        if(num>=26 && num<=50.9) {
          b++;
        }
        if(num>=51 && num<=75.9) {
          c++;
        }
        if(num>=76 && num<=100) {
          d++;
        }
       i++;
      }
      System.out.println("Entre 0 e 25.9: "+a);
      System.out.println("Entre 26 e 50.9: "+b);
      System.out.println("Entre 51 e 75.9: "+c);
      System.out.println("Entre 76 e 100: "+d);
  }
}
        
        