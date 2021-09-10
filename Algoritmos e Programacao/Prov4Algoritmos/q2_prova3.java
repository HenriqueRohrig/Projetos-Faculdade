package algoritmos.exercícios;

import java.util.Scanner;

public class q2_prova3 {
   public static void main(String args[]) {
       
       Scanner input = new Scanner(System.in); 
       
       String nome;
       String sobrenome;
       String result;
       
       System.out.println("Digite seu nome: ");
       nome = input.next();
       System.out.println("Digite seu sobrenome: ");
       
       sobrenome = input.next();
       
       result = NomeEmail(nome,sobrenome);
       System.out.println("Sr.(a), "+nome+" "+sobrenome+" , seu e-mail é "+result+"@algoritmos.com.br.");
       
   }
   public static String NomeEmail(String nome, String sobrenome) {
       
        String nomeEspaço;
        char nomeInicial;
        String email;
        
        nomeInicial = nome.charAt(0);
        nomeEspaço = nome.replace("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,x,w,y,z","_"); //programa não substituiu as letras corretamente, não soube arrumar
        email = nomeInicial+nomeEspaço;    
        return email;         
   }
}
