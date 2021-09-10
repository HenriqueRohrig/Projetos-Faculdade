package com.mycompany.p12_delivery;

import java.util.ArrayList;
import java.util.Scanner;

public class Tela {

    ArrayList<Pedidos> pd;

    //pedido = pedidos.remove(0); if pedidos.size() > 0;
    public Tela(Pedidos p) {
        this.pd = new ArrayList();
    }

    public void Exibir() {

        Scanner input = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Menu do Delivery.");
        System.out.println("1: Exibir pedido atual.");
        System.out.println("2: Próximo pedido.");
        System.out.println("3: Registrar pedido.");
        System.out.println("4: Encerrar o expediente. (Desligar o sistema)");

        while (opcao != 5) {

            opcao = input.nextInt();

            if (opcao == 1) {

                System.out.println("O pedido atual é: " + pd.get(0));
            }
            if (opcao == 2) {

                if (pd.size() > 0) {
                    pd.remove(0);
                    System.out.println("Ação concluída.");
                }else{
                    System.out.println("Não há mais pedidos pendentes.");
                }
            }

            if (opcao == 3) {

                System.out.println("Digite o nome do cliente: ");
                String nome = input.next();
                System.out.println("Digite o número de telefone do cliente: ");
                String tel = input.next();
                System.out.println("Digite o endereço do cliente: ");
                String end = input.next();
                //////////////////////////////////////////////////////////////// 
                System.out.println("Digite a quantidade do pedido: ");
                int quant = input.nextInt();
                System.out.println("Digite o tipo de lanche: ");
                System.out.println("Pizza Grande, Xis Filé, Prato Executiv ou Ala Minuta.");
                String desc = input.next();
                System.out.println("Digite alguma observação: ");
                String obs = input.next();
                ////////////////////////////////////////////////////////////////
                
                Pedidos p = new Pedidos (nome, tel, end);
                
                p.addItens(quant, desc, obs);

                System.out.println("Pedido adicionado com sucesso!");
            }
        }
    }
}
