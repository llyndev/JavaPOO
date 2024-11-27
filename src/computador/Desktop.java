package computador;

public class Desktop extends Computador {
    double acessorios;

    public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
        super(gbMemoria, numProcessadores);
        this.acessorios = acessorios;
    }

    @Override
    public double calcularValor() {
        double total = 200*gbMemoria + 400*numProcessadores + acessorios;
        return total;
    }

    @Override
    public void info() {
        System.out.printf("Valor Desktop: R$%.2f", calcularValor());
        System.out.println();
    }
}
