package com.mycompany.p22_maquinasorvetedao;

public class Reservatorio
{
    private int capacidadeMaxima;
    private double nivelAtual;
    private double totalConsumido;

    public Reservatorio( int capacidadeMax )
    {
        capacidadeMaxima = capacidadeMax;
        nivelAtual = 0;
        totalConsumido = 0;
    }
    
    public int getCapacidadeMaxima()
    {
        return capacidadeMaxima;
    }

    public double getNivelAtual()
    {
        return nivelAtual;
    }

    public double getTotalConsumido()
    {
        return totalConsumido;
    }
    
    public boolean encher( double quant )
    {
        boolean ok = false;
        if (nivelAtual+quant <= capacidadeMaxima)
        {
            nivelAtual += quant;
            ok = true;
        }
        return ok;
    }
    
    public boolean consumir( double quant )
    {
        boolean ok = false;
        if (nivelAtual >= quant)
        {
            nivelAtual -= quant;
            totalConsumido += quant;
            ok = true;
        }
        return ok;
    }
    
    public void reinicializarConsumo()
    {
        totalConsumido = 0;
    }
}
