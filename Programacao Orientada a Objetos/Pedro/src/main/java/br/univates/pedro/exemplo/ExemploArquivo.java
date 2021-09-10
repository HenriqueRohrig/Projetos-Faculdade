package br.univates.pedro.exemplo;

import br.univates.pedro.Arquivo;
import br.univates.pedro.Data;

public class ExemploArquivo
{
    public static void main(String[] args)
    {
        Data dt = new Data();
        NotaFiscal nf = new NotaFiscal(44,"Luis",new Data(), 78.88);
        
        
        Arquivo a = new Arquivo("teste.txt");
        
        if (a.abrirEscrita())
        {
            a.escreverLinha( "Parafuso;6.55" );
            a.escreverLinha( "Cadeira;236.88" );
            a.escreverLinha( "Mouse;35.00" );
            a.escreverLinha( "Jarra eletrica;189.90" );
            
            a.fecharArquivo();
        }
        
      
        if (a.abrirLeitura())
        {
            String x = a.lerLinha();
            while (x != null)
            {
                String[] vet = x.split(";");
                System.out.println( vet[0] );
                System.out.println( Double.parseDouble( vet[1] ) );
                System.out.println("");
                x = a.lerLinha();
            }
            
            a.fecharArquivo();
        }
        
        
        
        
    }
}
