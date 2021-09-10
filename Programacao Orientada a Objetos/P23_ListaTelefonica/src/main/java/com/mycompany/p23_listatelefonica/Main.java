package com.mycompany.p23_listatelefonica;

public class Main {
    
    public static void main(String[] args) {
        
        Cadastro c = new Cadastro();
        Tela t = new Tela(c);
        
        t.Exibir();
    }
    
}
