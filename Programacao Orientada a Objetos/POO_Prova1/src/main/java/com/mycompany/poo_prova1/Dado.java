package com.mycompany.poo_prova1;

import java.util.Random;

public class Dado {
    
    private Random random;
    private int lancamento;
    private int dado;
    private int um;
    private int dois;
    private int tres;
    private int quatro;
    private int cinco;
    private int seis;

    public Dado() {
        this.random = random;
        this.lancamento = 0;
        this.dado = dado;
        this.um = 0;
        this.dois = 0;
        this.tres = 0;
        this.quatro = 0;
        this.cinco = 0;
        this.seis = 0;
    }
    
    public int lancarDado() {
       dado = random.nextInt(7);
       lancamento++;
           if (dado == 0) {
               dado += 1;
           }   
           if (dado == 1) {
               um++;
           }
           if (dado == 2) {
               dois++;
           }
           if (dado == 3) {
               tres++;
           }
           if (dado == 4) {
               quatro++;
           }
           if (dado == 5) {
               cinco++;
           }
           if (dado == 6) {
               seis++;
           }
           return dado;
       }

    public int getUm() {
        return um;
    }

    public int getDois() {
        return dois;
    }

    public int getTres() {
        return tres;
    }

    public int getQuatro() {
        return quatro;
    }

    public int getCinco() {
        return cinco;
    }

    public int getSeis() {
        return seis;
    }
    
    public int getDado() { //nao sei se era necessario mas deixei aqui porque nao custa nada
        return dado;
    }   

    public int getLancamento() {
        return lancamento;
    }
    
    
    
}
