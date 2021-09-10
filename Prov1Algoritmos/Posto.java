public class Posto {
  public static void main (String args[]) {
    
    int i;
    char sexo;
    double alt,pes,ide;
    
    i=0;
     
    while (i<15) {
        
        sexo=Entrada.leiaChar("Digite seu sexo (M/F): ");
        alt=Entrada.leiaDouble("Digite sua altura: ");
        pes=Entrada.leiaDouble("Digite seu peso: ");
        
        if(sexo=='M') {
          ide=((72.7*alt)-58);
            if(ide<pes) {
            System.out.println("Você está acima do seu peso ideal!");
        }
        }
        if(sexo=='F') {
          ide=((62.1*alt)-44.7);
            if(ide<pes) {
          System.out.println("Você está acima do seu peso ideal!");
          }
        }
  i++;
    }
  }
}
        
        