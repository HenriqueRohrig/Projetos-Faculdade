package com.mycompany.p11_tremcarga;

public class Vagao {

    private int cargaMax;
    private double[] cargaAtual;
    private String[] carga;
    private int quantidadevagoes;

    public Vagao(int cargaMax) {
        this.cargaMax = cargaMax;
        this.cargaAtual = new double[25];
        this.carga = new String[25];
        this.quantidadevagoes = 0;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public double getCargaAtual(int i) {
        return cargaAtual[i];
    }
    
    public double getCargaTotal() {
        double total = 0;
        for (int i = 0; i < quantidadevagoes; i++) {
            total += cargaAtual[i];
        }
        return total/1000;
    }
    
    public String getConteudoVagao(int i) {
        return carga[i];
    }

    public void setCargaAtual(int i) {
        this.cargaAtual[i] = 0;
    }

    public void preencher(String cargaNome, int peso) {
        for (int i = 0; i < carga.length; i++) {
            if (cargaAtual[i] + peso < cargaMax) {
                carga[i] = cargaNome;
                cargaAtual[i] = peso;
                quantidadevagoes++;
            }
        }
    }
}
