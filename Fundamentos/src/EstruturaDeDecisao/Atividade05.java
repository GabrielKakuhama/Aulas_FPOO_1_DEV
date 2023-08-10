package EstruturaDeDecisao;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] veiculos = {"Fiat Argo", "Fiat Mobi", "Hyundai Hb20"};
        double[] valorDiaria = {98.00, 79.00, 102.00};
        double[] valorPorKm = {2.39, 1.99, 2.99};

        System.out.println("Veiculos disponiveis para aluguel:");
        for (int i = 0; i < veiculos.length; i++) System.out.println((i + 1) + ". " + veiculos[i]);

        System.out.print("Escolha um veiculo (1-" + veiculos.length + "): ");
        int escolha = scanner.nextInt();

        if (escolha < 1 || escolha > veiculos.length) { System.out.println("Opçao invalida."); scanner.close(); return; }

        System.out.print("Dias: "); int dias = scanner.nextInt();
        System.out.print("Km rodados: "); double kmRodados = scanner.nextDouble();
        double valorTotal = (valorDiaria[escolha - 1] * dias) + (valorPorKm[escolha - 1] * kmRodados);

        System.out.println("Veículo: " + veiculos[escolha - 1]);
        System.out.println("Valor total: R$ " + valorTotal);

        scanner.close();
    }
}
  