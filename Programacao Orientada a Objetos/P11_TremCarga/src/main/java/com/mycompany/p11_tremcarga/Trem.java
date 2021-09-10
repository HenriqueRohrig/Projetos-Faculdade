package com.mycompany.p11_tremcarga;

public class Trem {

    private Vagao vagao;
    private TanqueCombustivel tanque;
    private double km;
    private int vagoes;
    private int abastecimento;

    public Trem(int capacidadeVagao) {
        this.vagao = new Vagao(capacidadeVagao);
        this.tanque = new TanqueCombustivel();
        this.km = 0;
        this.vagoes = 0;
    }

    public double getPesoVagao(int i) {
        return vagao.getCargaAtual(i);
    }
    
    public double getPesoMaximo() {
        return vagao.getCargaMax();
    }

    public double getKm() {
        return km;
    }
    
    public int getVagoes() {
        return vagoes;
    }
    
    public String getCarga (int i) {
        return vagao.getConteudoVagao(i);
    }

    public void descarregarVagao(int i) {
        vagao.setCargaAtual(i);
    }

    public void carregarVagao(String carga, int peso) {
        vagao.preencher(carga, peso);
        vagoes++;
    }
    public double pesoVagoes () {
        return vagao.getCargaTotal();
    }

    public void abastecerTanque(int quant) {
        tanque.preencher(quant);
        abastecimento++;
    }
    public int quantidadeAbastecidas () {
        return abastecimento;
    }

    public double checarTanque() {
        return tanque.getNivel();
    }
    
    public double capacidadeTanque() {
        return tanque.getCapacidade();
    }
    
    public void movimentarTrem (int movimentarKM) {

        if (movimentarKM < (tanque.getCapacidade()/1000)-20)
        {
        double consumovagao = 400*vagoes;
        km += movimentarKM;
        tanque.consumir(consumovagao+(1200*km));
        }
    }   
}
