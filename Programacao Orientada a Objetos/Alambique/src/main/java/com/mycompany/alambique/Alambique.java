package com.mycompany.alambique;

public class Alambique {

    private DepositoAlambique caldo;
    private DepositoAlambique cachaca;
    private DepositoAlambique sobra;
    private int bateladas;
    private int garrafas;


    public Alambique(int tamanhoCaldo, int tamanhoCachaca, int tamanhoSobra) {
        this.bateladas = 0;
        this.garrafas = 0;
        this.caldo = new DepositoAlambique(tamanhoCaldo);
        this.cachaca = new DepositoAlambique(tamanhoCachaca);
        this.sobra = new DepositoAlambique(tamanhoSobra);
    }

    public double getCaldo() {
        return caldo.getPreenchimento();
    }

    public double getCachaca() {
        return cachaca.getPreenchimento();
    }

    public double getSobra() {
        return sobra.getPreenchimento();
    }

    public void setCaldo(int quant) {
        if (quant >= 0 || caldo.getPreenchimento() <= 10000) {
            caldo.setNivel(quant);
        }    
    }
    
    public double getCapacidadeCaldo() {
        return caldo.getCapacidade();
    }
    public double getCapacidadeCachaca() {
        return cachaca.getCapacidade();
    }
    public double getCapacidadeSobra() {
        return sobra.getCapacidade();
    }
    
    public void setSobra ()
    {
        sobra.setNivel(0);
    }
    
    public void abastecerCaldo (int quant) {
        if (quant+caldo.getPreenchimento() <= 10000) {
            caldo.preencher(quant);
        }
    }
    
    public void engarrafarCachaca ()
    {
        while (cachaca.getPreenchimento() <= 50000 && caldo.getPreenchimento() >= 1800 && sobra.getPreenchimento() <= 10000)
        {
            caldo.consumir(1800);
            cachaca.preencher(750);
            cachaca.consumir(750);
            sobra.preencher(200);
            bateladas++;
            garrafas++;          
        }
    }
    
    public void produzirReservatorio1 ()
    {
        while (caldo.getPreenchimento() >= 1600)
        {
            caldo.consumir(1800);
            caldo.preencher(400);
            garrafas++;
            bateladas++;
        }
    }
    
    public int Garrafas ()
    {
        return garrafas;
    }
    
    public int bateladas ()
    {
        return bateladas;
    }
}
