package Revisao.dev;

import java.util.Scanner;

public class CalculadoraMedia {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores a serem inseridos: ");
        int quantidadeValores = scanner.nextInt();

        double soma = 0;
        for (int i = 0; i < quantidadeValores; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / quantidadeValores;
        System.out.println("Media aritmetica dos valores: " + media);

        scanner.close();
    }
}

