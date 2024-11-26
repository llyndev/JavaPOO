package show;

public class Principal {
    public static void main(String[] args) {

        Ingresso a = new Ingresso("Show Pericles", 500);

        a.imprimir();

        IngressoVip b = new IngressoVip("Show Pericles", 500, 300);

        b.imprimir();
    }
}
