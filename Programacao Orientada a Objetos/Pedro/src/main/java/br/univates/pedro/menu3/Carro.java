package br.univates.pedro.menu3;

public class Carro
{
    private int ano;
    private String nome;
    private Pneu pneu;

    public Carro(int ano, String nome, Pneu pneu)
    {
        this.ano = ano;
        this.nome = nome;
        this.pneu = pneu;
    }
    
    public void trocarPneu()
    {
        pneu.getAro();
    }
    

    public int getAno()
    {
        return ano;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Pneu getPneu()
    {
        return pneu;
    }

    public void setPneu(Pneu pneu)
    {
        this.pneu = pneu;
    }
    
    
    
}
