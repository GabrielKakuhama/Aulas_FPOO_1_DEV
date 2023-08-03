package Revisao.dev;

import java.util.Scanner;

public class CalculadoraEnergiaEletriva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de KW/h consumidos: ");
        int consumo = scanner.nextInt();

        System.out.print("Digite o tipo de instalacao eletrica (R para residencia, C para comercio, I para industria): ");
        char tipoInstalacao = scanner.next().charAt(0);

        double precoPorKWh;
        if (tipoInstalacao == 'R' || tipoInstalacao == 'r') {
            if (consumo <= 150) {
                precoPorKWh = 0.60;
            } else {
                precoPorKWh = 0.75;
            }
        } else if (tipoInstalacao == 'C' || tipoInstalacao == 'c') {
            if (consumo <= 100) {
                precoPorKWh = 0.55;
            } else {
                precoPorKWh = 0.70;
            }
        } else if (tipoInstalacao == 'I' || tipoInstalacao == 'i') {
            if (consumo <= 500) {
                precoPorKWh = 0.40;
            } else {
                precoPorKWh = 0.55;
            }
        } else {
            System.out.println("Instalacao invalida. Use R para residencia, C para comercio ou I para industria.");
            return;
        }

        double precoTotal = consumo * precoPorKWh;
        System.out.println("Preco a pagar pelo fornecimento de energia eletrica: R$ " + precoTotal);

        scanner.close();
    }
}
