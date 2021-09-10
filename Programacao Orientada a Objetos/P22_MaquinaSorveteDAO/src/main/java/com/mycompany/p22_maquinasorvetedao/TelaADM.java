package com.mycompany.p22_maquinasorvetedao;

import java.util.Scanner;

public class TelaADM {

    Maquina m;

    public TelaADM(Maquina m) {
        this.m = m;
    }

    public void Exibir() {
        
        System.out.println("1 = Checar estoque; 2 = Preencher estoque; 3 = Checar vendas; 4 = Sair.");  

        Scanner input = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4) {
            
            opcao = input.nextInt();     

            if (opcao == 1) {

                System.out.println("Quantidade atual de ingredientes: ");
                System.out.println("Essência de chocolate: " + m.getChoc());
                System.out.println("Essência de morango: " + m.getMor());
                System.out.println("Emulsificante: " + m.getEmul());
                System.out.println("Leite: " + m.getLeite());
            }

            if (opcao == 2) {

                System.out.println("Maximizar estoque de ingredientes.");
                m.setChoc();
                m.setEmul();
                m.setLeite();
                m.setMor();

            }

            if (opcao == 3) {

                System.out.println("Consultar vendas.");
                System.out.println("Bolas de chocolate: " + m.getQuantChoc());
                System.out.println("Bolas de morango: " + m.getQuantMor());
            }

        }
    }

}
