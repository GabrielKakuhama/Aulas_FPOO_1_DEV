package Revisao.dev;

import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio, diametro, area;
        System.out.println("Digite o radio do circulo: ");
        radio = teclado.nextDouble();
        diametro = radio * 2;
        area = (3.1416) * (radio * radio);
        System.out.println("O diametro do circulo e de: " + diametro);
        System.out.println("O area do circulo e de: " + area);

    }
}
