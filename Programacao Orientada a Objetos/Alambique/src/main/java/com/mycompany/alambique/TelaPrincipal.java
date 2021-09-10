package com.mycompany.alambique;

import java.util.Scanner;

public class TelaPrincipal {

    private Alambique a1;
    private Alambique a2;
    private Alambique a3;

    public TelaPrincipal(Alambique a1, Alambique a2, Alambique a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public void exibir() {

        int opcao = 0;
        
        Scanner input = new Scanner(System.in);

        while (opcao != 4) {
            
        System.out.println("Menu de máquinas de Alambique.");
        System.out.println("Selecione a máquina que deseja utilizar: ");
        System.out.println("1: Máquina 1 (tamanho pequeno)");
        System.out.println("2: Máquina 2 (tamanho grande)");
        System.out.println("3: Máquina 3 (tamanho grande)");
        System.out.println("4: Sair do programa.");

        opcao = input.nextInt();

            if (opcao == 1) {
                MenuAlambique menu = new MenuAlambique(a1);
                menu.exibir();
            }
            if (opcao == 2) {
                MenuAlambique menu = new MenuAlambique(a2);
                menu.exibir();
            }
            if (opcao == 3) {
                MenuAlambique menu = new MenuAlambique(a3);
                menu.exibir();
            }
            if (opcao == 4)
            {
                System.out.println("Você saiu do programa.");
                System.exit(0);
            }
        }
    }
}
