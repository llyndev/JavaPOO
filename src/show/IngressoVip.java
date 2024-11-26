package show;

public class IngressoVip extends Ingresso{
    double adicional;

    public IngressoVip(String nomeEvento, double valor, double adicional) {
        super(nomeEvento, valor);
        this.adicional = adicional;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.printf("Valor adicional VIP: %.2f\n", adicional);
        System.out.printf("Valor VIP: %.2f\n\n", (super.valor + adicional));
    }
}
