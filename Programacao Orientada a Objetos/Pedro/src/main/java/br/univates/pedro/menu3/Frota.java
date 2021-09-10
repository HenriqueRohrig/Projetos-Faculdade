package br.univates.pedro.menu3;

import java.util.ArrayList;

public class Frota
{
    private int codigo;
    private String descr;
    private ArrayList<Carro> carros;

    public Frota( int codigo, String descr )
    {
        this.codigo = codigo;
        this.descr = descr;
        this.carros = new ArrayList();
    }
    
    public void addCarro( Carro carro )
    {
        carros.add(carro);
    }
    
}
