package com.mycompany.p23_listatelefonica;

import br.univates.pedro.Documento;
import br.univates.pedro.Printer;
import java.util.Scanner;

public class Tela {

    private String nome;
    private String telefone;
    private String email;
    private Cadastro c;

    public Tela(Cadastro c) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.c = new Cadastro();
    }

    public void Exibir() {

        Scanner input = new Scanner(System.in);

        int opcao = 0;
        
        System.out.println("Digite 1 para adicionar um novo contato.");
        System.out.println("Digite 2 para listar os contatos já adicionados.");
        System.out.println("Digite 3 para sair.");

        while (opcao != 3) {

            System.out.println("Digite sua ação.");
            
            opcao = input.nextInt();
            
            if (opcao == 1) {
                
                System.out.println("Digite o nome da pessoa: ");
                nome = input.next();
                System.out.println("Digite o telefone da pessoa: ");
                telefone = input.next();
                System.out.println("Digite o email da pessoa: ");
                email = input.next();
                
                c.salvar(nome, telefone, email);
                
                System.out.println("Contato cadastrado com sucesso!");      
            }
           
            if (opcao == 2) {
                
                System.out.println("Lista de contatos: ");
                c.cadastrar();
                c.listar();
                
            }

        }
    }

}
