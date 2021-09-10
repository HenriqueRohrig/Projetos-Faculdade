package Apresentaçao;

import Negocio.CaçaNiquel;
import Persistencia.CaçaNiquelDAO;
import java.util.Scanner;

public class Tela {

    CaçaNiquel cn;

    public Tela(CaçaNiquel cn) {
        this.cn = new CaçaNiquel();
    }

    public void exibir() {

        int opcao = 0;

        while (opcao != 3) {

            Scanner input = new Scanner(System.in);

            System.out.println("Digite sua ação.");
            System.out.println("1 - Jogar.");
            System.out.println("2 - Estatísticas.");
            System.out.println("3 - Sair.");

            opcao = input.nextInt();

            if (opcao == 1) {

                if (cn.depositar(5)) {
                    System.out.println("Você recebeu ...");
                    if (cn.centesimo() || cn.getCaixa() > 1000) {
                        System.out.println("Centésima jogada! Você recebeu um prêmio de 150 reais!");
                        cn.retirar(150);
                    } else {
                        System.out.println("Saldo insuficiente na máquina para o prêmio de centésima jogada!");
                    }
                } else {
                    System.out.println("Limite de dinheiro da máquina atigindo, favor retirar e armazenar em outro local.");
                }
            }

            if (opcao == 2) {
                System.out.println("Prêmios distribuídos: " + cn.getPremios());
                System.out.println("Saldo da máquina: " + cn.getCaixa());
            }
        }

    }

    public void fechar() {
        System.exit(0);
    }

}
