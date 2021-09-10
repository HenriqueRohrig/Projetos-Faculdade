package com.mycompany.p22_maquinasorvetedao;

public class Main {
    
    public static void main(String[] args) {
        
        Maquina m = new Maquina();
        TelaConsumidor tc = new TelaConsumidor(m);
        tc.exibir();
    }
    
}
