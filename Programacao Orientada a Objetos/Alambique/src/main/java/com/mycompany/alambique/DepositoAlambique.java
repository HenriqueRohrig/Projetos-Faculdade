package com.mycompany.alambique;

public class DepositoAlambique {

    private int capacidade;
    private double nivel;

    public DepositoAlambique(int capacidade) {
        this.capacidade = capacidade;
        this.nivel = 0;
    }    

    public int getCapacidade() {
        return capacidade;
    }

    public double getPreenchimento() {
        return nivel;
    }
    
    public void preencher (double quant)
    {
        if (nivel + quant <= capacidade)
        {
            nivel += quant;
        }      
    }
    
    public void consumir (double quant)
    {
        if (nivel >= quant)
        {
            nivel -= quant;
        }
    }

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }
}