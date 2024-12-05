package trabalhopoo;

public class Euro extends Moeda {

    // Método construtor sem passar nenhum parâmetro.
    public Euro() {}

    // Método construtor passando valor.
    public Euro(double valor) { 
        super(valor);
    }

    // Método info informando o valor que tem na Moeda.
    @Override
    public void info() { 
        System.out.printf("Euro: €%.2f", valor);
        System.out.println();
    }

    // Método para converter o valor em Real.
    @Override
    public double converter() {
        return valor * 6.35;
    }

    // Método para retornar o nome da moeda.
    @Override
    public String nome() { 
        return "Euro";
    }
}
