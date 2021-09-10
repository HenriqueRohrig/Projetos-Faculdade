package com.mycompany.alambique;

public class MainAlambiqueP10 {
    public static void main(String[] args) {
        
        Alambique a1 = new Alambique(100000, 500000, 100000);
        Alambique a2 = new Alambique(500000, 1200000, 200000);
        Alambique a3 = new Alambique(500000, 1200000, 200000);
        
        TelaPrincipal menuPrincipal = new TelaPrincipal(a1,a2,a3);
        menuPrincipal.exibir();
    }
    
}
