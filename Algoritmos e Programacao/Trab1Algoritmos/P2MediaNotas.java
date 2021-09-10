public class MediaAlunos {
  public static void main (String args []) {
    
    int N1;
    int N2;
    int N3;
    int media;
    
    N1 = Entrada.leiaInt ("Digite sua primeira nota: ");
    N2 = Entrada.leiaInt ("Digite sua segunda nota: ");
    N3 = Entrada.leiaInt ("Digite sua terceira nota: ");
    
    media = (N1+N2+N3)/3;
    
    if (media >= 7){
      System.out.println("Você foi aprovado!");
    }else{
      System.out.println("Você foi reprovado");
    }
  }
}
    
    