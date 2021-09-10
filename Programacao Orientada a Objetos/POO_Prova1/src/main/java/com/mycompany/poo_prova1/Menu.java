package com.mycompany.poo_prova1;

import java.util.Scanner;

public class Menu {
    
    Geladeira p;
    Geladeira np;

    public Menu(Geladeira p, Geladeira np) {
        this.p = p;
        this.np = np;
    }
    
    public void Exibir() {
        
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Menu da geladeira comunitária.");
        System.out.println("1: Doar alimentos.");
        System.out.println("2: Consumir alimentos.");
        System.out.println("3: Checar quantos quilos de alimento há na geladeira.");
        System.out.println("4: Esvaziar geladeira.");
        System.out.println("5: Fechar geladeira. (sair do programa)");

        while (opcao != 5) {
        
            opcao = input.nextInt();
            
            if (opcao == 1) {
                int tipo;
                int quant;
                
                System.out.println("Digite qual o tipo de alimento que deseja doar: ");
                System.out.println("1 = Perecível | 2 = Não Perecível.");
                
                tipo = input.nextInt();

                if (tipo == 1) { 
                    System.out.println("Digite quantos quilos do seu alimento perecível deseja doar: ");
                    quant = input.nextInt();
                    p.doar(quant);
                    System.out.println("Você doou "+quant+" quilos de alimento perecível.");                    
                }
                if (tipo == 2) {
                    System.out.println("Digite quantos quilos do seu alimento não perecível deseja doar: ");
                    quant = input.nextInt();
                    np.doar(quant);
                    System.out.println("Você doou "+quant+" quilos de alimento não perecível.");
                }
            }
            if (opcao == 2) {
                int tipo;
                int quant;
                
                System.out.println("Digite qual o tipo de alimento que irá consumir: ");
                System.out.println("1 = Perecível | 2 = Não Perecível.");
                
                tipo = input.nextInt();
                
                if (tipo == 1) {
                    System.out.println("Digite quantos quilos de alimento perecível irá retirar da geladeira: ");
                    quant = input.nextInt();
                    p.consumir(quant);
                    System.out.println("Você retirou "+quant+" quilos de alimento perecível da geladeira.");
                }
                if (tipo == 2) {
                    System.out.println("Digite quantos quilos de alimento não perecível irá retirar da geladeira: ");
                    quant = input.nextInt();
                    np.consumir(quant);
                    System.out.println("Você retirou "+quant+" quilos de alimento perecível da geladeira.");
                }
            }
            if (opcao == 3) {
                
                int kgP = p.getAlimentos();
                int kgNP = np.getAlimentos();
                System.out.println("Há "+(kgP+kgNP)+" quilos de alimento na geladeira.");
            }
            if (opcao == 4) {
                p.setAlimentos();
                np.setAlimentos();
                System.out.println("Você esvaziou a geladeira.");
            }
        }
    }     
}
