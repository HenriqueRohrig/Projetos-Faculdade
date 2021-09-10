package com.mycompany.p16_menu;

import java.util.Scanner;

public class GerarOpcao implements Menu {    
    
    private String[] opcoesPrograma;

    public GerarOpcao(int numOpcoes) {
        this.opcoesPrograma = new String[numOpcoes];
    }
    
    @Override
    public String getOpcoesPrograma(int i) {
        return opcoesPrograma[i];
    }
    
    public void gerarOpcao(String opcaoPrograma, int numopcao) {     
        opcoesPrograma[numopcao] = opcaoPrograma;
    }
    
}
