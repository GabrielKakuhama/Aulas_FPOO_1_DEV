package Revisao.dev;

import java.util.Scanner;

public class VerificadorDeVelocidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade do carro (km/h): ");
        int velocidade = scanner.nextInt();

        int limiteVelocidade = 80;
        int kmAcimaLimite = velocidade - limiteVelocidade;

        if (kmAcimaLimite > 0) {
            int valorMulta = kmAcimaLimite * 5;
            System.out.println("Motorista multado. Valor da multa: R$ " + valorMulta + ",00.");
        } else {
            System.out.println("Velocidade dentro do limite permitido.");
        }

        scanner.close();
    }
}
