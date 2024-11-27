package polimorfismo;

public abstract class Funcionario {
    String nome;

    public Funcionario(String nome) {
        super();
        this.nome = nome;
    }

    public abstract float pagamento();

    public void info() {
        System.out.printf("R$%.2f", pagamento());
    }
}
