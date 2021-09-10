/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.pedro;

import java.util.ArrayList;

/**
 *
 * @author mouri
 */
public class Printer
{
    private ArrayList<Documento> filaImpressao;

    public Printer()
    {
        this.filaImpressao = new ArrayList();
    }
    
    public void addDocumento( Documento doc )
    {
        filaImpressao.add(doc);
    }
    
    public void imprimir()
    {
        if (filaImpressao.size() > 0)
        {
            Documento doc = filaImpressao.remove(0);
            doc.prepararDocumento();
            String linha = doc.getProximaLinha();
            while (linha != null)
            {
                System.out.println( linha );
                linha = doc.getProximaLinha();
            }
        }
    }
    
    public void removerDocumento()
    {
        if (filaImpressao.size() > 0)
        {
            filaImpressao.remove(0);
        }
    }
    
    
}
