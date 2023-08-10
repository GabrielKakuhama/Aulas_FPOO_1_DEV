package EstruturaDeDecisao;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a largura do terreno em metros: ");
        double largura = scanner.nextDouble();

        System.out.println("Informe o comprimento do terreno em metros:");
        double comprimento = scanner.nextDouble();

        double areaTotal = largura * comprimento;
        double valorPorMetroQuadrado;

        if (areaTotal == 250) {
            valorPorMetroQuadrado = 8.5;
        } else if (areaTotal <= 350) {
            valorPorMetroQuadrado = 9.5;
        } else {
            valorPorMetroQuadrado = 11.5;
        }

        double valorTotal = areaTotal * valorPorMetroQuadrado;

        System.out.println("Area total do terreno: " + areaTotal + " m2");
        System.out.println("Valor por metro quadrado: R$ " + valorPorMetroQuadrado);
        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        scanner.close();
    }
}
