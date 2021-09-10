package Persistencia;

import Negocio.CaçaNiquel;
import br.univates.pedro.Arquivo;

public class CaçaNiquelDAO {
    
    public void salvar (CaçaNiquel cn)
    {
        Arquivo arq = new Arquivo ("maquina.txt");
        if (arq.abrirEscrita())
        {
            arq.escreverLinha(cn.getCaixa()+"");
            arq.escreverLinha(cn.getJogadas()+"");
            arq.escreverLinha(cn.getPremios()+"");
            arq.fecharArquivo();
        }
    }    
        public CaçaNiquel ler()
        {
            Arquivo arq = new Arquivo("maquina.txt");
            CaçaNiquel cn = null;
            if (arq.abrirLeitura())
            {
                int caixa = Integer.parseInt(arq.lerLinha());
                int jogadas = Integer.parseInt(arq.lerLinha());
                int premios = Integer.parseInt(arq.lerLinha());
                
                cn = new CaçaNiquel(caixa, jogadas, premios);
                arq.fecharArquivo();
            }
            return cn;
            
        }
    
}
