package Revisao.dev;

import java.util.Scanner;

public class SimuladorDeEmprestimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da casa a comprar: ");
        double valorCasa = scanner.nextDouble();

        System.out.print("Digite o salário da pessoa: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite a quantidade de anos a pagar: ");
        int anosPagar = scanner.nextInt();

        double prestacaoMaxima = salario * 0.30; // 30% do salário
        double prestacaoMensal = valorCasa / (anosPagar * 12); // Prestação mensal em anos

        if (prestacaoMensal <= prestacaoMaxima) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo não aprovado. Prestação mensal excede 30% do salário.");
        }

        scanner.close();
    }
}
