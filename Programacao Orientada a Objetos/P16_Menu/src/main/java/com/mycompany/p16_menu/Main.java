
package com.mycompany.p16_menu;

public class Main {
    public static void main(String[] args) {
        
        GerarOpcao go = new GerarOpcao(5); //nao soube como driblar o fato de que preciso passar o número de opcoes para classe GerarOpcao antes de executar a tela, o numero de opcoes do menu é definido dentro da tela.
        Tela t = new Tela(go, 5);
        t.Exibir();
    }
    
}
