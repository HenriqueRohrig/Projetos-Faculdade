/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.pedro.exemplo;

import br.univates.pedro.Data;
import br.univates.pedro.Documento;
import br.univates.pedro.Printer;

/**
 *
 * @author mouri
 */
public class TestePrinter
{
    public static void main(String[] args)
    {
        Data dt = new Data();
        Documento d = new NotaFiscal(5,"Ivo",dt,670);
        
        Printer p = new Printer();
        p.addDocumento(d);
        p.imprimir();
        
    }
}
