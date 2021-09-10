public class P4IdadeCorreta {
  public static void main (String args []) {
    
    int Id;
    int Nasc;
    int aux;
    
    Id = Entrada.leiaInt ("Digite sua idade: ");
    Nasc = Entrada.leiaInt ("Digite seu ano de nascimento: ");
    
    aux = (2020-Nasc);
    
    if (aux != Id){
      System.out.println("Idade não confere");
    }else{
      System.out.println("Idade correta!");
    }
  }
}
    
    