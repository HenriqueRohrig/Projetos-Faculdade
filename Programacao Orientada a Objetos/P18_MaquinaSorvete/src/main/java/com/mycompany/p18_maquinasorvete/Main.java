package com.mycompany.p18_maquinasorvete;

public class Main {
    
    public static void main(String[] args) {
        
        Maquina m = new Maquina();
        TelaConsumidor tc = new TelaConsumidor(m);
        tc.exibir();
    }
    
}
