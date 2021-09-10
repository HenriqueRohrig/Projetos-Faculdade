package com.mycompany.p12_delivery;

public class Main {
    public static void main(String[] args) {
        
        Pedidos p = new Pedidos();
        Tela menu = new Tela(p);
        menu.Exibir();
    }
    
}
