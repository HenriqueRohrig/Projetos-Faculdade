/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.pedro.menu3;

/**
 *
 * @author mouri
 */
public class Teste
{
    public static void main(String[] args)
    {
        Pneu p1 = new Pneu( "GoodYear", 15 );
        Carro c1 = new Carro(2018,"VW", p1 );
        
        c1.trocarPneu();
        
        Frota f = new Frota( 32, "Frota de Forquetinha" );
        f.addCarro(c1);
        
        
        
    }
}
