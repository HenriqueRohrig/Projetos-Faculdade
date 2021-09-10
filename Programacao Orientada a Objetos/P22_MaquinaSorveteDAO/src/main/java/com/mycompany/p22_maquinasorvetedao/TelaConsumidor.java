package com.mycompany.p22_maquinasorvetedao;

import java.util.Scanner;

public class TelaConsumidor {

    Maquina m;

    public TelaConsumidor(Maquina m) {
        this.m = m;
    }

    public void exibir() {

        Scanner input = new Scanner(System.in);

        int opcao = 0;
 
        System.out.println("1 = Chocolate; 2 = Morango; 3 = L. Chocolate; 4 = L. Morango; 5 = ADM; 6 = Sair.");
        
        while (opcao != 6) {
            
            opcao = input.nextInt();

            if (opcao == 1) {

                m.produzirBolaChoc();
                System.out.println("Casquinha de chocolate produzida!");
            }
            if (opcao == 2) {

                m.produzirBolaMor();
                System.out.println("Casquinha de morango produzida!");
            }
            if (opcao == 3) {

                m.produzirLitroChoc();
                System.out.println("Sorvete litro de chocolate produzido!");
            }
            if (opcao == 4) {

                m.produzirLitroMor();
                System.out.println("Sorvete litro de morango produzido!");
            }

            if (opcao == 5) {

                System.out.println("Funções administrativas.");
                TelaADM adm = new TelaADM(m);
                adm.Exibir();

            }
        }

    }

}
