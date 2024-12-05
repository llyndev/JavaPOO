package imprimir;

public class Quadrado implements Imprimivel{
    int medidaLado;

    public Quadrado(int medidaLado) {
        this.medidaLado = medidaLado;
    }

    @Override
    public void imprimir() {
        System.out.println("Quadrado");
        System.out.println("Media lado: " + medidaLado);
        System.out.println("Area: " + (4*medidaLado));
        System.out.println("----------------");
    }
}
