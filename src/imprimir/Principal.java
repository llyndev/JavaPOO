package imprimir;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Carro car = new Carro("BMW", "Preto", 4);
        Funcionario fun = new Funcionario("Weslley", "927.231.234-22");
        Quadrado qua = new Quadrado(10);

        Imprimivel imp = car;
        imp.imprimir();
        imp = fun;
        imp.imprimir();
        imp = qua;
        imp.imprimir();

        ArrayList<Imprimivel> lista = new ArrayList<>();

        lista.add(car);
        lista.add(fun);
        lista.add(qua);
    }
}
