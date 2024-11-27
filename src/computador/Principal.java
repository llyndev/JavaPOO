package computador;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Computador desktop = new Desktop(8, 4, 600); // Instanciando da forma padrão
        Computador notebook = new Notebook(4, 4, 20);

        ArrayList<Computador> listaComputadores = new ArrayList<>();

        listaComputadores.add(new Desktop(16, 12, 600)); // Adicionando em uma lista para um futuro for
        listaComputadores.add(desktop);
        listaComputadores.add(notebook);
        listaComputadores.add(new Notebook(8, 4, 17));

        double total = 0;

        // Laço para somar o total de todos os computadores e informar valores individualmente
        for (Computador c : listaComputadores) {
            total += c.calcularValor();
            c.info();
        }
        System.out.println("");
        System.out.printf("Total Computadores: R$%.2f\n", total);
    }
}
