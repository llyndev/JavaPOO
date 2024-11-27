package variados;
import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        int peso;
        double altura, imc;
        String nome;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        nome = teclado.next();

        System.out.print("Informe o peso: ");
        peso = teclado.nextInt();

        System.out.print("Informe a altura: ");
        altura = teclado.nextDouble();

        teclado.close();

        imc = peso / (altura * altura);

        System.out.printf("Nome: %s\nPeso: %d\nAltura: %.2f\nIMC: %.2f", nome, peso, altura, imc);

    }
}
