package com.mycompany.alambique;

//abastecer o reservatório com caldo de cana (não precisa completar), limpar (jogar fora) o reservatório de resíduos (sempre esvaziar completamente), 
//engarrafar a cachaça produzida (ou parte da cachaça produzida, conforme o tamanho das garrafas). Você também poderá produzir cachaça com o líquido (caldo de cana) existente no primeiro reservatório, 
//mas para isso é preciso saber se há espaço para os resíduos e para o líquido que será produzido. A qualquer tempo é possível consultar o nível de cada reservatório; 
//o número de garrafas produzidas no estoque da fábrica de cachaça e o número de vezes que a máquina foi usada (contador de bateladas). 

import java.util.Scanner;

public class MenuAlambique {
    
    private Alambique a;

    public MenuAlambique(Alambique a) {
        this.a = a;
    }
    
    public void exibir()
    {
        Scanner input = new Scanner(System.in);
        
        int opcao = 0;

        while (opcao != 10)
        {                
            System.out.println ("1) Abastecer o reservatório com caldo de cana.");
            System.out.println ("2) Limpar reservatório de resíduos.");
            System.out.println ("3) Engarrafar produção.");
            System.out.println ("4) Produzir cachaça utilizando o reservatório com caldo de cana.");
            System.out.println ("5) Checar reservatório do caldo de cana.");
            System.out.println ("6) Checar reservatório de cachaça.");
            System.out.println ("7) Checar reservatório de resíduos.");
            System.out.println ("8) Ver quantidade de garrafas de cachaça produzidas.");
            System.out.println ("9) Ver o número de bateladas.");
            System.out.println ("10) Desligar a máquina. (encerrar programa)");
        
            opcao = input.nextInt();
            
            if (opcao == 1)
            {
                System.out.println("Digite quantos litros deseja abastecer. (capacidade máxima atual: "+(a.getCapacidadeCachaca()-a.getCaldo())+")");
                int quant1 = input.nextInt();
                a.setCaldo(quant1);
                System.out.println("Abastecido com sucesso!");
            }
            if (opcao == 2)
            {
                a.setSobra();
                System.out.println("Limpeza do reservatório efetuada com sucesso!");
            }
            if (opcao == 3)
            {
                a.engarrafarCachaca();
                System.out.println("Cachaça engarrafada com sucesso!");
            }
            if (opcao == 4)
            {
                a.produzirReservatorio1();
                System.out.println("Sucesso. A cachaça foi produzida utilizando apenas o reservatório de cana.");
            }
            if (opcao == 5)
            {
                System.out.println("Reservatório de cana: "+a.getCaldo());
            }
            if (opcao == 6)
            {
                System.out.println("Reservatório de cachaça: "+a.getCachaca());
            }
            if (opcao == 7) 
            {
                System.out.println("Reservatório de resíduos: "+a.getSobra());
            }
            if (opcao == 8)
            {
                System.out.println("Foram produzidas "+a.Garrafas()+" garrafas.");
            }
            if (opcao == 9)
            {
                System.out.println("Número de bateladas: "+a.bateladas());
            }
        }
    }    
}
