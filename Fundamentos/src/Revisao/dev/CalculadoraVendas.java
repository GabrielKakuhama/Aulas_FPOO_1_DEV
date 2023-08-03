package Revisao.dev;

import java.util.Scanner;

public class CalculadoraVendas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor unitário do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto comprada: ");
        int quantidade = scanner.nextInt();

        double valorTotal = valorProduto * quantidade;

        System.out.print("Digite 'D' para debito ou 'C' para credito: ");
        String formaPagamento = scanner.next();

        if (formaPagamento.equalsIgnoreCase("D")) {
            double desconto = valorTotal <= 100 ? 0.05 : 0.03;
            valorTotal *= (1 - desconto);
            System.out.println("Total com desconto para debito: R$ " + valorTotal);
        } else if (formaPagamento.equalsIgnoreCase("C")) {
            System.out.print("Digite o numero de parcelas: ");
            int parcelas = scanner.nextInt();
            double valorParcela = valorTotal / parcelas;
            System.out.println("Valor da parcela: R$ " + valorParcela);
        } else {
            System.out.println("Forma de pagamento inválida. Digite 'D' para debito ou 'C' para credito.");
        }

        scanner.close();
    }
}
