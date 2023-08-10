package EstruturaDeDecisao;

import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o prato desejado:");
        System.out.println("1. Arroz, feijao, bife acebolado - R$ 19,99");
        System.out.println("2. Arroz, feijao, file de frango - R$ 18,99");
        System.out.println("3. Arroz, feijao, brajola - R$ 23,99");

        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Quantidade de pratos: ");
        int quantidade = scanner.nextInt();

        double preco;

        switch (opcao) {
            case 1:
                preco = 19.99;
                break;
            case 2:
                preco = 18.99;
                break;
            case 3:
                preco = 23.99;
                break;
            default:
                System.out.println("Opçao invalida.");
                scanner.close();
                return;
        }

        double valorTotal = preco * quantidade;

        System.out.println("Valor por prato: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        scanner.close();
    }
}
  
        