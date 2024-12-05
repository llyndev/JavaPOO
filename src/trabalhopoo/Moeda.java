package trabalhopoo;

public abstract class Moeda {
    double valor, convertido;

    // Método construtor sem passar nenhum parâmetro.
    public Moeda() {}

    // Método construtor passando valor.
    public Moeda(double valor) { 
        this.valor = valor;
    }

    // Método abstrato info.
    public abstract void info(); 

    // Método abstrato para conversão.
    public abstract double converter(); 

    // Método para verificar se duas moedas são do mesmo tipo (pertencem à mesma classe).
    public boolean mesmoTipo(Moeda outraMoeda) { 
        return this.getClass() == outraMoeda.getClass();
    }

    // Método abstrato para informar o nome da moeda.
    public abstract String nome();
}
