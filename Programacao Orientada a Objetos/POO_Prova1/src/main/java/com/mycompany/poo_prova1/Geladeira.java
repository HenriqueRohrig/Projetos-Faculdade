package com.mycompany.poo_prova1;

public class Geladeira {

    private int alimentos;

    public Geladeira() {
        this.alimentos = alimentos;
    }

    public int getAlimentos() {
        return alimentos;
    }

    public void consumir(int quant) {
        alimentos -= quant;
    }

    public void doar(int quant) {
        alimentos += quant;
    }

    public void setAlimentos() {
        if (alimentos > 0) {
            this.alimentos = 0;
        }
    }
}
