package trabalhopoo;

public class Real extends Moeda{

    // Método construtor sem passar nenhum parâmetro.
    public Real() {}

    // Método construtor passando valor.
    public Real(double valor) { 
        super(valor);
    }

    // Método info informando o valor que tem na Moeda.
    @Override
    public void info() { 
        System.out.printf("Real: R$%.2f", valor); 
        System.out.println();
    }

    // Método para converter o valor em Real.
    @Override
    public double converter() { 
        return valor;
    }

    // Método para retornar o nome da moeda.
    @Override
    public String nome() { 
        return "Real";
    }
}
