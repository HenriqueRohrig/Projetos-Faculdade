package Negócio;

public class UrnaClientes {
    
    private int satisfeito;
    private int indiferente;
    private int insatisfeito;

    public UrnaClientes() {
        this.satisfeito = 0;
        this.indiferente = 0;
        this.insatisfeito = 0;
    }

    public UrnaClientes(int satisfeito, int indiferente, int insatisfeito) {
        this.satisfeito = satisfeito;
        this.indiferente = indiferente;
        this.insatisfeito = insatisfeito;
    }
    
    public void satis() {
        satisfeito++;
    }
    public void indi() {
        indiferente++;
    }
    
    public void insatis() {
        insatisfeito++;
    }
    
    public void zerar() {
        satisfeito = 0;
        indiferente = 0;
        insatisfeito = 0;
    }

    public int getSatisfeito() {
        return satisfeito;
    }

    public int getIndiferente() {
        return indiferente;
    }

    public int getInsatisfeito() {
        return insatisfeito;
    }
    
    
    
}
