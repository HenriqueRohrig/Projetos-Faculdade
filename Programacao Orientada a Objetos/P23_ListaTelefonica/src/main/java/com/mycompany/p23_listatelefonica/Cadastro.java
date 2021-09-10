package com.mycompany.p23_listatelefonica;

//import br.univates.pedro.Documento;
//import br.univates.pedro.Printer;
import java.util.ArrayList;

public class Cadastro {
    
    ArrayList<Contato> alc;
    //Printer imp;

    public Cadastro() {
        this.alc = new ArrayList();
        //this.imp = new Printer();
    }
    
    public void cadastrar()
    {
        ContatoDao cd = new ContatoDao();
        ArrayList<Contato> lista = cd.lerTodos();
        this.alc = lista; //insere todos contatos contidos no txt no arraylist alc.
    }
    
    public void salvar(String nome, String telefone, String email)
    {
        ContatoDao cd = new ContatoDao();
        Contato c = new Contato (nome, telefone, email);
        cd.salvar(c); //adiciona um novo contato no txt.
    }
    
    public void listar()
    {
        for (int i = 0; i < alc.size(); i++) {
            System.out.println(alc.get(i));            
        }
        //imp.addDocumento(doc);
        //imp.imprimir();
        
    }  
    
}
