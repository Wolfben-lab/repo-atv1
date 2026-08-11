package Fluxo_1;

import java.util.Scanner;

public class Atv_1 {
    public static void main(String[] args) {
        // Cria o scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Cálculos simples: subtrai 1 e soma 1
        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("-----------------------------------");
        System.out.println("O número digitado foi: " + numero);
        System.out.println("O antecessor é: " + antecessor);
        System.out.println("O sucessor é: " + sucessor);
        System.out.println("-----------------------------------");
    }
}