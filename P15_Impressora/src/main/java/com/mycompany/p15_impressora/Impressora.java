package com.mycompany.p15_impressora;

import java.util.ArrayList;

public class Impressora {
    
    ArrayList<Documentos> queue;

    public Impressora() {
        this.queue = new ArrayList();
    }
    
    public void newDoc(Documentos doc) {
        queue.add(doc);
    }
    
    public void imprimir()
    {
        if (queue.size() > 0)
        {
            Documentos doc = queue.remove(0);
            doc.prepararImpressao();
            String linha = doc.getLinha();
            while (linha != null)
            {
                System.out.println( linha );
                linha = doc.getLinha();
            }
        }
    }
    
    public void removeDoc() {
        
        if (queue.size() > 0) {
            queue.remove(0);
        }
    }
    
    
    
}
