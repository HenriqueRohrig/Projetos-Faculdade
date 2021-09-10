package com.mycompany.p23_listatelefonica;

import br.univates.pedro.Arquivo;
import java.util.ArrayList;

public class ContatoDao {
    
    public void salvar(Contato contato)
    {
        ArrayList<Contato> aux = lerTodos();
        aux.add(contato);
        
        Arquivo a = new Arquivo("contatos.txt");
        
        if (a.abrirEscrita())
        {
            for (Contato c : aux) 
            {
                a.escreverLinha(c.paraString());
            }
            a.fecharArquivo();
        }
    }
    
    public ArrayList<Contato> lerTodos()
    {
        ArrayList<Contato> lista = new ArrayList();
        Arquivo a = new Arquivo("contatos.txt");
        
        if (a.abrirLeitura())
        {
            String s = a.lerLinha();
            while (s != null)
            {
                String[] p = s.split(";");
                Contato c = new Contato (p[0],p[1],p[2]);
                lista.add(c);
                s = a.lerLinha();
            } 
            a.fecharArquivo();
        }
        return lista;
    }
            
            
    
}
