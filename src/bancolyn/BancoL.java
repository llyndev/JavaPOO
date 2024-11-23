package bancolyn;

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

        Conta c2 = new Conta(562355, "Mirela Silva", 5000, 3000);

        c2.info();
        
        if (!c1.transferir(c2, 2000)) {
            System.out.println("Problema ao Transferir!");
        }

        c1.info();

        c2.info();
        
    }
}
