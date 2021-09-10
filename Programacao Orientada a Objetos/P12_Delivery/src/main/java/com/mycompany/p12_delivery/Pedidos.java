package com.mycompany.p12_delivery;

import java.util.ArrayList;

public class Pedidos {
    
    private String nome;
    private String fone;
    private String endereço;
    private ArrayList<ItemPedido> itens;

    public Pedidos() {
        this.nome = nome;
        this.fone = fone;
        this.endereço = endereço;
        this.itens = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getEndereço() {
        return endereço;
    }

    public int getItens() {
        return itens.size();
    }
       
    public void addItens (int quant, String desc, String obs)
    {       
        ItemPedido item = new ItemPedido(quant, desc, obs);
        itens.add(item);
    }
   
}
