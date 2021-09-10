package Negocio;

public class CaçaNiquel {
    
    private int caixa;
    private int limite;
    private int jogadas;
    private int premios;
    
    public CaçaNiquel() {
        this.caixa = 1000;
        this.limite = 10000;
        this.jogadas = 0;
        this.premios = 0;
    }
    
    public CaçaNiquel(int caixa, int jogadas, int premios) {
        this.caixa = caixa;
        this.limite = 10000;
        this.jogadas = jogadas;
        this.premios = premios;
    }
    
    public boolean depositar ( double quant )
    {
        boolean ok = false;
        if (caixa+quant <= limite)
        {
            caixa += quant;
            ok = true;
            jogadas++;
        }
        return ok;
    }
    
    public boolean retirar ( double quant )
    {
        boolean ok = false;
        if (caixa >= quant)
        {
            caixa -= quant;
            limite += quant;
            ok = true;
        }
        return ok;
    }
    
    public boolean centesimo()
    {
        boolean ok = false;
        if (jogadas == 100)
        {
            premios++;
            jogadas = 0;
            ok = true;
        }
        return ok;
    }

    public int getCaixa() {
        return caixa;
    }
    public int getLimite() {
        return limite;
    }
    public int getJogadas() {
        return jogadas;
    }
    public int getPremios() {
        return premios;
    }
    
    
    
}
