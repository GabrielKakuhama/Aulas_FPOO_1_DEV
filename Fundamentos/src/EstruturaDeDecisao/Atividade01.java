package EstruturaDeDecisao;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o cargo do funcionario");

        String Cargo = scanner.nextLine();

        double salarioBase = 0;
        double inssPorcentagem = 0;
        double convenio = 0;

        switch (Cargo.toLowerCase()) {
            case "gerente":
                salarioBase = 5590.00;
                inssPorcentagem = 8.0;
                convenio = 289.00;
                break;
            case "supervisor":
                salarioBase = 4128.00;
                inssPorcentagem = 7.0;
                convenio = 239.00;
                break;
            case "Tecnico":
                salarioBase = 3789.00;
                inssPorcentagem = 4.0;
                convenio = 189.00;
                break;
            case "auxiliar":
                salarioBase = 2345.00;
                inssPorcentagem = 2.0;
                convenio = 156.00;
                break;
            default:
                System.out.println("Cargo inválido.");
                scanner.close();
                return;
        }

        double descontoInss = salarioBase * (inssPorcentagem / 100);
        double salarioLiquido = salarioBase - descontoInss - convenio;

        System.out.println("Salário Líquido: R$" + salarioLiquido);

        scanner.close();
    }
}
