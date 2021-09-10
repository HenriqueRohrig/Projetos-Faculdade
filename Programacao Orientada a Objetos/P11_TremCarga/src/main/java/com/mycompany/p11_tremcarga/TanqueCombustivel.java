package com.mycompany.p11_tremcarga;

public class TanqueCombustivel {
    
    private int capacidade;
    private int nivel;

    public TanqueCombustivel() {
        this.capacidade = 1000000;
        this.nivel = nivel;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getNivel() {
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

    
}
