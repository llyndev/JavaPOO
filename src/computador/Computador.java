package computador;

public abstract class Computador {
    int gbMemoria;
    int numProcessadores;

    public Computador(int gbMemoria, int numProcessadores) {
        this.gbMemoria = gbMemoria;
        this.numProcessadores = numProcessadores;
    }

    public abstract double calcularValor();

    public abstract void info();
}
