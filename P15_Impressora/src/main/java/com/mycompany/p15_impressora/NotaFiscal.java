package com.mycompany.p15_impressora;

import java.util.ArrayList;

public class NotaFiscal implements Documentos
{
    private int numero;
    private String nomeCli;
    private String dtEmissao;
    private double valorTotal;
    private ArrayList<String> linhas;

    public NotaFiscal(int numero, String nomeCli, String dtEmissao, double valorTotal)
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

    public String getDtEmissao()
    {
        return dtEmissao;
    }

    public void setDtEmissao(String dtEmissao)
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
    public String getLinha()
    {
        String retorno = null;
        if (linhas.size() > 0)
        {
            retorno = linhas.remove(0);
        }
        return retorno;
    }

    @Override
    public void prepararImpressao()
    {
        linhas.clear();
        linhas.add("*-*-*-*-*-*-*-* NÚMERO: " + numero + " *-*-*-*-*-*-*-*");
        linhas.add(" CLIENTE: " + this.nomeCli);
        linhas.add(" DATA EMISSÃO: " + this.dtEmissao);
        linhas.add(" VALOR TOTAL DA NF: " + this.valorTotal);
    }

}
