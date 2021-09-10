package com.mycompany.p12_delivery;

public class ItemPedido {
    
    private int quantidade;
    private String descricao;
    private String observacao;

    public ItemPedido(int quantidade, String descriçao, String observaçao) {
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.observacao = observacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getDescriçao() {
        return descricao;
    }

    public String getObservaçao() {
        return observacao;
    } 
}
