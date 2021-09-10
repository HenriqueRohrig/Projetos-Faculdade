package Main;

import Apresentação.TelaUrna;
import Negócio.UrnaClientes;
import Persistência.UrnaClientesDAO;

public class Main {
    
    public static void main(String[] args) {
        
        UrnaClientesDAO ucd = new UrnaClientesDAO();
        UrnaClientes uc = ucd.ler();
        
        if (uc == null) {
            uc = new UrnaClientes();
        }
        
        TelaUrna tu = new TelaUrna();
        tu.setVisible(true);
    }
    
}
