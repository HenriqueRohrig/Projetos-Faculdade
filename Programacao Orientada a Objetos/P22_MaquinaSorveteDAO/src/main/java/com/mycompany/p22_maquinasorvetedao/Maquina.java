
package com.mycompany.p22_maquinasorvetedao;

public class Maquina {
    
    private Reservatorio leite;
    private Reservatorio emul;
    private Reservatorio mor;
    private Reservatorio choc;
    private int quantChoc;
    private int quantMor;

    public Maquina() {
        this.leite = new Reservatorio(5000);
        this.emul = new Reservatorio(3000);
        this.mor = new Reservatorio(2000);
        this.choc = new Reservatorio(2000);
        this.quantChoc = 0;
        this.quantMor = 0;
    }

    public Maquina(int leite, int emul, int mor, int choc) {
        this.leite = new Reservatorio (leite);
        this.emul = new Reservatorio (emul);
        this.mor = new Reservatorio (mor);
        this.choc = new Reservatorio (choc);
    }
    

    public double getLeite() {
        return leite.getNivelAtual();
    }

    public void setLeite() {
        this.leite.encher(5000);
    }

    public double getEmul() {
        return emul.getNivelAtual();
    }

    public void setEmul() {
        this.emul.encher(3000);
    }

    public double getMor() {
        return mor.getNivelAtual();
    }

    public void setMor() {
        this.mor.encher(2000);
    }

    public double getChoc() {
        return choc.getNivelAtual();
    }

    public void setChoc() {
        this.choc.encher(2000);
    }
    
    public void produzirBolaChoc() {
        if (leite.getNivelAtual() > 35 || emul.getNivelAtual() > 15 || choc.getNivelAtual() > 7) {
        leite.consumir(35);
        emul.consumir(15);
        choc.consumir(7);
        quantChoc++;
        }
    }
    public void produzirBolaMor() {
        if (leite.getNivelAtual() > 35 || emul.getNivelAtual() > 15 || mor.getNivelAtual() > 7) {
        leite.consumir(35);
        emul.consumir(15);
        mor.consumir(7);
        quantMor++;
        }
    }

    public void produzirLitroChoc() {
        if (leite.getNivelAtual() > 35*16 || emul.getNivelAtual() > 15*16 || choc.getNivelAtual() > 7*16)
        leite.consumir(35*16);
        emul.consumir(15*16);
        choc.consumir(7*16);
        quantChoc+=16;
    }
    public void produzirLitroMor() {
        if (leite.getNivelAtual() > 35*16 || emul.getNivelAtual() > 15*16 || mor.getNivelAtual() > 7*16)
        leite.consumir(35*16);
        emul.consumir(15*16);
        mor.consumir(7*16);
        quantMor+=16;
    }
    
    public int getQuantChoc() {
        return this.quantChoc;
    }
    
    public int getQuantMor() {
        return this.quantMor;
    }
    
}
