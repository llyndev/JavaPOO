package variados;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverso {
    public static void main(String[] args) {

        int qtd;
        String nome;

        Scanner teclado = new Scanner(System.in);
        
        ArrayList<String> listaNomes = new ArrayList<String>();
        System.out.print("Digite a quantidade de nomes: ");
        qtd = teclado.nextInt();

        for(int i = 0; i < qtd; i++) {
            System.out.print("Digite um nome: ");
            nome = teclado.next();
            listaNomes.add(nome);
        }

        teclado.close();

        // Reverso com for

        for(int i=listaNomes.size() - 1; i>=0; i--) {
            System.out.println(listaNomes.get(i));
        }

        System.out.println("Ordem normal: ");
        System.out.println(listaNomes);

        // Reverso com classe

        Collections.reverse(listaNomes);
        System.out.println("Ordem reversa: ");
        System.out.println(listaNomes);

        

    }
}
