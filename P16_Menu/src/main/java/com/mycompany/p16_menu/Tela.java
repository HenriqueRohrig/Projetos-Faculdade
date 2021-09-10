package com.mycompany.p16_menu;

import java.util.Scanner;

public class Tela {

    int nopcoes;
    String tprograma;
    String opcaomenu;
    int opcao;
    int contador;
    GerarOpcao go;

    public Tela(GerarOpcao go, int nopcoes) { //tive que passar o nopcoes como parâmetro para poder executar o código, mas a minha ideia era setar ele aqui na tela
        this.nopcoes = nopcoes;
        this.tprograma = tprograma;
        this.opcaomenu = opcaomenu;
        this.opcao = opcao;
        this.contador = 1;
        this.go = new GerarOpcao(nopcoes);
    }

    public void Exibir() {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do programa: ");
        tprograma = input.next();
        //System.out.println("Digite quantas opcões irá conter o menu: ");
        //nopcoes = input.nextInt();

        for (int i = 0; i < nopcoes; i++) {
            System.out.println("Digite uma das opcões do menu: ");
            opcaomenu = input.next(); //se o usuario digitar uma opcao que contém um espaço entre as palavras da erro

            go.gerarOpcao(opcaomenu,i);

        }
        while (opcao != nopcoes) {

            System.out.println("Menu do " + tprograma + ".");
            System.out.println("Digite qual opção deseja executar: ");

            for (int i = 0; i < nopcoes; i++) {
                System.out.println(contador + ": " + go.getOpcoesPrograma(i));
                contador++;
            }
            
            opcao = input.nextInt();
        }
    }
}
