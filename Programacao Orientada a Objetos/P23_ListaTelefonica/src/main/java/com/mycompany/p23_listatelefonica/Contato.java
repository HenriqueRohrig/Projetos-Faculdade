package com.mycompany.p23_listatelefonica;

import br.univates.pedro.Documento;
import br.univates.pedro.Printer;
import java.util.ArrayList;

public class Contato implements Documento {
    
    private String nome;
    private String telefone;
    private String email;
    private ArrayList<String> linhas;
    private Printer imp;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.linhas = new ArrayList();
        this.imp = new Printer();
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
    
    public String paraString()
    {
        return nome+";"+telefone+";"+email;
    }
    
    @Override
    public String getProximaLinha()
    {
        String retorno = null;
        if (linhas.size() > 0)
        {
            retorno = linhas.remove(0);
        }
        return retorno;
    }
    @Override
        public void prepararDocumento()
    {
        linhas.clear();
        linhas.add("NOME: "+this.nome);
        linhas.add("TELEFONE: "+this.telefone);
        linhas.add("EMAIL: "+this.email);
    }
    
    
    
    
}
