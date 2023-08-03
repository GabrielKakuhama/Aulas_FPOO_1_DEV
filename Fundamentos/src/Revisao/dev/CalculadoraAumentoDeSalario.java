package Revisao.dev;

import java.util.Scanner;

public class CalculadoraAumentoDeSalario {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario do funcionario: ");
        double salario = scanner.nextDouble();

        double percentualAumento = salario > 1350 ? 0.10 : 0.15;
        double aumento = salario * percentualAumento;
        double salarioNovo = salario + aumento;

        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salario: R$ " + salarioNovo);

        scanner.close();
    }
}
