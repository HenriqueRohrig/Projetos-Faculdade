package com.mycompany.p15_impressora;

import java.util.Scanner;

public class Tela {

    Impressora imp;
    NotaFiscal nf;

    public Tela() {

        this.imp = new Impressora();
        this.nf = new NotaFiscal(3, "Henrique", "23/05/21", 0);
    }

    public void Exibir() {

        Scanner input = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Menu da Impressora.");
        System.out.println("1: Inserir documento.");
        System.out.println("2: Imprimir documento.");
        System.out.println("3: Remover documento.");
        System.out.println("4: Desligar o sistema.");

        while (opcao != 4) {

            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("Documento inserido com sucesso!");
                imp.newDoc(nf);               
            }
            if (opcao == 2) {
                imp.imprimir();
            }

            if (opcao == 3) {
                imp.removeDoc();
                System.out.println("Documento removido com sucesso!");
            }
        }
    }
}
