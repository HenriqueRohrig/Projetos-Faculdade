package Main;

import Apresentaçao.Tela;
import Negocio.CaçaNiquel;
import Persistencia.CaçaNiquelDAO;

public class Main {
    
    public static void main(String[] args) {
        
        CaçaNiquelDAO dao = new CaçaNiquelDAO();
        CaçaNiquel cn = dao.ler();
        
        if (cn == null) {
            cn = new CaçaNiquel();
        }
        
        Tela t = new Tela(cn);
        t.exibir();
        
        dao.salvar(cn);
        
        t.fechar();
    }
    
}
