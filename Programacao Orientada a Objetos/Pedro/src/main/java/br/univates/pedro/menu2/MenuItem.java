package br.univates.pedro.menu2;

import br.univates.pedro.Data;
import br.univates.pedro.Reservatorio;

public class MenuItem
{
    private char atalho;
    private String descr;
    private MenuProcesso rotina;

    public MenuItem(char atalho, String descr, MenuProcesso rotina)
    {
        this.atalho = atalho;
        this.descr = descr;
        this.rotina = rotina;  
    }

    public String getDescr()
    {
        return descr;
    }

    public void setDescr(String descr)
    {
        this.descr = descr;
    }

    public char getAtalho()
    {
        return atalho;
    }

    public void setAtalho(char atalho)
    {
        this.atalho = atalho;
    }
    
    public void executarAcaoItem()
    {
        rotina.executar();
    }

    public MenuProcesso getRotina()
    {
        return rotina;
    }
    
    
}
