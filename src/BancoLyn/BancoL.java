package BancoLyn;

public class BancoL {
    public static void main(String[] args) {
        Conta c1 = new Conta(343955, "Weslley Couto", 4500, 6000);

        c1.info();

        if (!c1.sacar(4220)) {
            System.out.println("Saldo insuficiente!");
        }

        if (!c1.depositar(3200)) {
            System.out.println("Problema ao depositar!");
        }
        c1.info();
    }
}
