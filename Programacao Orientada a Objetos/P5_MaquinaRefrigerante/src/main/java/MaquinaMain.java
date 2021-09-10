
import java.util.Scanner;

public class MaquinaMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Maquina m = new Maquina();

        int opcao = 0;

        System.out.println("Máquina de refrigerantes.");
        System.out.println("Digite o que deseja: ");
        System.out.println("1: Coca-Cola.");
        System.out.println("2: Pepsi.");
        System.out.println("3: Kuat.");
        System.out.println("4: Reabastecer refrigerante. (máximo 1000)");
        System.out.println("5: Reabastecer gás. (máximo 1000)");
        System.out.println("6: Reabastecer água. (máximo 10000)");
        System.out.println("7: Sair.");

        while (opcao != 7) {
            
            opcao = input.nextInt();

            if (opcao == 1) {
                if (m.copoRefri()) {
                    System.out.println("Aproveite seu refrigerante!");
                } else {
                    System.out.println("Refrigerante insuficiente na máquina, por favor reabasteça.");
                }
            }
            if (opcao == 2) {
                if (m.copoRefri()) {
                    System.out.println("Aproveite seu refrigerante!");
                } else {
                    System.out.println("Refrigerante insuficiente na máquina, por favor reabasteça.");
                }
            }
            if (opcao == 3) {
                if (m.copoRefri()) {
                    System.out.println("Aproveite seu refrigerante!");
                } else {
                    System.out.println("Refrigerante insuficiente na máquina, por favor reabasteça.");
                }
            }
            if (opcao == 4) {
                System.out.println("Digite quantos litros de refrigerante irá abastecer.");
                int quantRefri = input.nextInt();
                if (m.refilRefri(quantRefri)) {
                    System.out.println("Reabastecido com sucesso!");
                } else {
                    System.out.println("Reservatório acima da capacidade.");
                }
            }
            if (opcao == 5) {
                System.out.println("Digite quantas doses de gás irá abastecer.");
                int quantGas = input.nextInt();
                if (m.refilGas(quantGas)) {
                    System.out.println("Reabastecido com sucesso!");
                } else {
                    System.out.println("Reservatório acima da capacidade.");
                }
            }
            if (opcao == 6) {
                System.out.println("Digite quantos litros de água irá abastecer.");
                int quantAgua = input.nextInt();
                if (m.refilAgua(quantAgua)) {
                    System.out.println("Reabastecido com sucesso!");
                } else {
                    System.out.println("Reservatório acima da capacidade.");
                }
            }
            System.out.println("Digite sua próxima ação.");
        }
    }
}
