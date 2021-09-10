package com.mycompany.p22_maquinasorvetedao;

import br.univates.pedro.Arquivo;

public class MaquinaDao {
    
    public void salvar (Maquina maq)
    {
        Arquivo arq = new Arquivo ("maquina.txt");
        if (arq.abrirEscrita())
        {
            arq.escreverLinha(maq.getChoc()+"");
            arq.escreverLinha(maq.getEmul()+"");
            arq.escreverLinha(maq.getLeite()+"");
            arq.escreverLinha(maq.getMor()+"");
            arq.fecharArquivo();
        }
    }    
        public Maquina ler()
        {
            Arquivo arq = new Arquivo("maquina.txt");
            Maquina maq = null;
            if (arq.abrirLeitura())
            {
                int choc = Integer.parseInt(arq.lerLinha());
                int emul = Integer.parseInt(arq.lerLinha());
                int leite = Integer.parseInt(arq.lerLinha());
                int mor = Integer.parseInt(arq.lerLinha());
                
                maq = new Maquina(leite, emul, mor, choc);
                arq.fecharArquivo();
            }
            return maq;
            
        }
        
    
}
