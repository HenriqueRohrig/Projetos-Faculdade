package com.mycompany.alambique;

public class MainAlambique {
    public static void main(String[] args) {
        
        Alambique a = new Alambique(100000, 500000, 100000);
        MenuAlambique menu = new MenuAlambique(a);
        menu.exibir();
    }
    
}
