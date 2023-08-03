package Revisao.dev;

import java.util.Scanner;

public class CalculadoraPrecoPassagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distancia da viagem em km: ");
        int distancia = scanner.nextInt();

        double precoPorKm;
        if (distancia <= 200) {
            precoPorKm = 0.50;
        } else {
            precoPorKm = 0.45;
        }

        double precoPassagem = distancia * precoPorKm;

        System.out.println("Preco da passagem: R$ " + precoPassagem);

        scanner.close();
    }
}
