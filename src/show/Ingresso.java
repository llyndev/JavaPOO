package show;

public class Ingresso {
    String nomeEvento;
    double valor;

    public Ingresso(String nomeEvento, double valor) {
        this.nomeEvento = nomeEvento;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println("\nEvento: " + nomeEvento);
        System.out.printf("Valor: R$%.2f\n", valor);
    }
}

