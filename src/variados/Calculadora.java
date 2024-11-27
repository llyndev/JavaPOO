package variados;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        int numero;
        double num, num2, res;

        System.out.println("Qual operação deseja realizar?: ");
        System.out.println("1 - ADIÇÃO");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");
        System.out.println("Para sair digite qualquer numero");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite: ");
        numero = teclado.nextInt();

        System.out.print("Digite um valor: ");
        num = teclado.nextInt();

        System.out.print("Digite outro valor: ");
        num2 = teclado.nextInt();

        teclado.close();

        if (numero == 1) {
            res = num + num2;
            System.out.printf("A soma de %.0f + %.0f = %.0f", num, num2, res);
        } else if (numero == 2) {
            res = num - num2;
            System.out.printf("A subtração de %.0f + %.0f = %.0f", num, num2, res);
        } else if (numero == 3) {
            res = num * num2;
            System.out.printf("A multiplicação de %.0f + %.0f = %.0f", num, num2, res);
        } else if (numero == 4) {
            res = num / num2;
            System.out.printf("A divisão de %.0f + %.0f = %.2f", num, num2, res);
        } else {
            System.out.print("Fim");
        }
    }
}