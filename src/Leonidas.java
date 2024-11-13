import java.util.Scanner;

public class Leonidas {
    public static void main(String[] args) {

        int palpite;
        int valorCorreto = 10000;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Tente adivinhar a quantidade de espartanos: ");
        palpite = teclado.nextInt();


        while (palpite != valorCorreto) {

            if (palpite < valorCorreto) {
                System.out.println("Um pouco mais!");
            } else {
                System.out.println("Um pouco menos!");
            }
            System.out.print("Digite outro palpite: ");
            palpite = teclado.nextInt();
        }

        teclado.close();

        System.out.print("Você acertou a quantidade de espartanos!");
    }

}
