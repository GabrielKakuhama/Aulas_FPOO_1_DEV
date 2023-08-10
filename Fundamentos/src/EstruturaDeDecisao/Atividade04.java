package EstruturaDeDecisao;

public class Atividade04 {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

        String[] itens = {
            "Notebook Lenovo",
            "Celular MotoG22",
            "Carro Hb20",
            "Apartamento"
        };

        double[] valores = {3299.00, 1789.00, 68000.00, 180000.00};
        double[] percentuais = {0.05, 0.10, 0.02, 0.01};

        System.out.println("Itens disponíveis para compra:");
        for (int i = 0; i < itens.length; i++) {
            System.out.println((i + 1) + ". " + itens[i]);
        }

        System.out.print("Escolha um item (1-" + itens.length + "): ");
        int escolha = scanner.nextInt();

        if (escolha < 1 || escolha > itens.length) {
            System.out.println("Opção inválida.");
            scanner.close();
            return;
        }

        double valorTotal = valores[escolha - 1];
        double economiaMensal = valorTotal * percentuais[escolha - 1];
        int meses = (int) Math.ceil(valorTotal / economiaMensal);

        System.out.println("Item escolhido: " + itens[escolha - 1]);
        System.out.println("Valor total: R$ " + valorTotal);
        System.out.println("Percentual a economizar: " + (percentuais[escolha - 1] * 100) + "%");
        System.out.println("Valor a ser economizado por mês: R$ " + economiaMensal);
        System.out.println("Quantidade de meses necessários: " + meses);

        scanner.close();
    }
}

    

