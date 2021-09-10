package algoritmos.exercícios;

import java.util.Scanner;
import java.util.Random;

public class q1_prova3 {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);     
        
        int menu;
        int valorMaxVetor;
        int recebeMenorValor;
        int recebeMediaVetor;
        int vet1[] = new int[20];
        
        System.out.println("Digite o número da ação que deseja realizar: ");
        System.out.println("1: Preencher um vetor de 20 inteiros, entre 0 e o número digitado.");
        System.out.println("2: Identificar o menor número do vetor e imprimi-lo.");
        System.out.println("3: Calcular a média entre os elementos do vetor e retorná-la.");
        System.out.println("4: Sair do programa.");
        menu = input.nextInt();
        
        if (menu == 4) {
            Sair(menu);
        }
        
        System.out.println("Digite o valor máximo contido no vetor: ");
        valorMaxVetor = input.nextInt();
        
        if (menu == 1) {
            preencheVetor(valorMaxVetor);
        }
        if (menu == 2) {
            recebeMenorValor = menorValor(valorMaxVetor);
            System.out.println("O menor valor encontrado no vetor foi: "+recebeMenorValor);
        }
        if (menu == 3) {
            recebeMediaVetor = mediaVetor (valorMaxVetor);
            System.out.println("A média dos elementos contidos no vetor é: "+recebeMediaVetor);
        }
    }
    public static void preencheVetor(int valorMaxVetor) {
       
        Random random = new Random();
        int[] vet1 = new int[20];
        
        System.out.println("Vetor gerado: ");
        for (int i=0; i < vet1.length; i++) {
            vet1[i] = random.nextInt(valorMaxVetor);
            System.out.print(vet1[i]+" ");
        }
    }
    public static int menorValor (int valorMaxVetor) {
        
        int menorvalor = 0;
        
        Random random = new Random();
        int[] vet1 = new int[20];
        
        System.out.println("Vetor gerado: ");
        for (int i=0; i < vet1.length; i++) {
            vet1[i] = random.nextInt(valorMaxVetor);  
        }
        for (int i=0; i < vet1.length; i++) { //problema, vetor estourando devido ao i+1, não sei arrumar
            if (vet1[i+1] > vet1[i])
                menorvalor = vet1[i];
        }
        return menorvalor;
    }
    public static int mediaVetor (int valorMaxVetor) {  
 
        int media = 0;
        int soma = 0;
        
        Random random = new Random();
        int[] vet1 = new int[20];
        
        System.out.println("Vetor gerado: ");
        for (int i=0; i < vet1.length; i++) {
            vet1[i] = random.nextInt(valorMaxVetor);
            System.out.print(vet1[i]+" ");
        }
        for (int i=0; i < vet1.length; i++) {
            soma = soma + vet1[i];
        }
        media = soma / vet1.length;
        return media;
        }
    public static void Sair(int menu) {
     
        System.out.println("Você saiu do programa.");
        System.exit(0);      
    }
}