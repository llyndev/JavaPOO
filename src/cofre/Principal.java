package cofre;

public class Principal {
    public static void main(String[] args) {
        Cofrinho c = new Cofrinho();

        c.add(new Moeda("Reais", 0.5));
        c.add(new Moeda("Reais", 1));
        c.add(new Moeda("Reais", 0.5));
        c.add(new Moeda("Reais", 0.25));
        c.add(new Moeda("Reais", 0.1));

        System.out.printf("Total: R$%.2f \n", c.calcularTotal());

    }
}
