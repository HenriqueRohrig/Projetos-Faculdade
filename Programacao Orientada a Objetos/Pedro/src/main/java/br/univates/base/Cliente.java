package br.univates.base;

public class Cliente {
   
    private String nome;
    private String fone;
    private String endereço;

    public Cliente (String nome, String fone, String endereço) {
        this.nome = nome;
        this.fone = fone;
        this.endereço = endereço;
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
    
}
