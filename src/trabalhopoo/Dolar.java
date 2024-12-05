package trabalhopoo;

public class Dolar extends Moeda {

    // Método construtor sem passar nenhum parâmetro.
    public Dolar() {}

    // Método construtor passando valor.
    public Dolar(double valor) {
        super(valor);
    }

    // Método info informando o valor que tem na Moeda.
    @Override
    public void info() {
        System.out.printf("Dolar: $%.2f", valor);
        System.out.println();
    }

    // Método para converter o valor em Real.
    @Override
    public double converter() { 
        return valor * 6.04;
    }

    // Método para retornar o nome da moeda.
    @Override
    public String nome() { 
        return "Dolar";
    }
}
