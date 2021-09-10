package Persistência;

import Negócio.UrnaClientes;
import br.univates.pedro.Arquivo;

public class UrnaClientesDAO {
    
    public void salvar (UrnaClientes uc)
    {
        Arquivo arq = new Arquivo ("urna.txt");
        if (arq.abrirEscrita())
        {
            arq.escreverLinha(uc.getIndiferente()+"");
            arq.escreverLinha(uc.getInsatisfeito()+"");
            arq.escreverLinha(uc.getSatisfeito()+"");
            arq.fecharArquivo();
        }
    }    
        public UrnaClientes ler()
        {
            Arquivo arq = new Arquivo("urna.txt");
            UrnaClientes uc = null;
            if (arq.abrirLeitura())
            {
                int indiferente = Integer.parseInt(arq.lerLinha());
                int insatisfeito = Integer.parseInt(arq.lerLinha());
                int satisfeito = Integer.parseInt(arq.lerLinha());
                
                uc = new UrnaClientes(satisfeito, indiferente, insatisfeito);
                arq.fecharArquivo();
            }
            
            return uc;
            
        }
    
}
