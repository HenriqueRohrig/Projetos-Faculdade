package com.mycompany.p11_tremcarga;

import java.util.Scanner;

public class Tela {

    private Trem t;

    public Tela(Trem t) {
        this.t = t;
    }

    public void Exibir() {
        
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Menu do Maquinista.");
        System.out.println("1: Movimentar trem.");
        System.out.println("2: Abastecer o tanque de combustível.");
        System.out.println("3: Informações sobre o tanque de combustível.");
        System.out.println("4: Informações sobre o trem.");
        System.out.println("5: Carregar vagão.");
        System.out.println("6: Descarregar vagão.");
        System.out.println("7: Parar o trem. (Desligar o sistema)");

        while (opcao != 7) {

            opcao = input.nextInt();
            
            if (opcao == 1) {
                System.out.println("Digite quantos KM deseja percorrer: ");
                int km = input.nextInt();
                t.movimentarTrem(km);
                System.out.println("O trem está se movendo.");
            }
            if (opcao == 2) {
                System.out.println("Digite quantos litros deseja abastecer: ");
                System.out.println("Capacidade máxima: "+t.capacidadeTanque()/1000);
                int abastecer = input.nextInt();
                t.abastecerTanque(abastecer * 1000);
                System.out.println("O tanque de combustível foi abastecido!");
            }
            if (opcao == 3) {
                System.out.println("Nível atual do tanque: " + t.checarTanque()/1000);
                System.out.println("Capacidade máxima do tanque: " + t.capacidadeTanque()/1000);
                System.out.println("Número de vezes que o tanque foi abastecido: " + t.quantidadeAbastecidas());
            }
            if (opcao == 4) {
                System.out.println("Peso total do trem: " + t.pesoVagoes()/1000);
                System.out.println("Quilômetros percorridos: " + t.getKm());
                System.out.println("Número de vagões: " + t.getVagoes());
            }
            if (opcao == 5) {
                int peso;
                String carga;
                System.out.println("Digite o peso da carga em toneladas: ");
                System.out.println("Capacidade máxima: "+t.getPesoMaximo()/1000);
                peso = input.nextInt();
                peso = peso*1000;
                System.out.println("Digite o que irá carregar: ");
                carga = input.next();
                t.carregarVagao(carga, peso);
                System.out.println("O vagão foi carregado com sucesso!");
            }
            if (opcao == 6) {
                System.out.println("Digite o vagão que deseja checar a carga: ");
                System.out.println("Número de vagões: " + t.getVagoes());
                int vagaonum = input.nextInt();
                System.out.println("No vagão soliciitado contém: " + t.getCarga(vagaonum));
                System.out.println("Deseja descarregar?");
                System.out.println("1= Sim | 2 = N");
                int opc = input.nextInt();
                if (opc == 1) {
                    t.descarregarVagao(vagaonum);
                    System.out.println("Descarregado com sucesso!");
                }
                if (opc == 2) {
                    System.out.println("O vagão solicitado não foi descarregado.");
                }
            }
        }
    }
}
