/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univates.pedro.exemplo;

import br.univates.pedro.Data;
import br.univates.pedro.Documento;
import java.util.ArrayList;

/**
 *
 * @author mouri
 */
public class NotaFiscal implements Documento
{
    private int numero;
    private String nomeCli;
    private Data dtEmissao;
    private double valorTotal;

    private ArrayList<String> linhas;

    public NotaFiscal(int numero, String nomeCli, Data dtEmissao, double valorTotal)
    {
        this.numero = numero;
        this.nomeCli = nomeCli;
        this.dtEmissao = dtEmissao;
        this.valorTotal = valorTotal;

        linhas = new ArrayList();
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public String getNomeCli()
    {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli)
    {
        this.nomeCli = nomeCli;
    }

    public Data getDtEmissao()
    {
        return dtEmissao;
    }

    public void setDtEmissao(Data dtEmissao)
    {
        this.dtEmissao = dtEmissao;
    }

    public double getValorTotal()
    {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal)
    {
        this.valorTotal = valorTotal;
    }

    @Override
    public String getProximaLinha()
    {
        String retorno = null;
        if (linhas.size() > 0)
        {
            retorno = linhas.remove(0);
        }
        return retorno;
    }

    public void prepararDocumento()
    {
        linhas.clear();
        linhas.add("*-*-*-*-*-*-*-* NÚMERO: " + numero + " *-*-*-*-*-*-*-*");
        linhas.add(" CLIENTE: " + this.nomeCli);
        linhas.add(" DATA EMISSÃO: " + this.dtEmissao.obterDataFormatada());
        linhas.add(" VALOR TOTAL DA NF: " + this.valorTotal);
    }

}
