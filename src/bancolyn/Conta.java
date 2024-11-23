package bancolyn;

public class Conta {

    int numero;
    String titular;
    double saldo;
    double limite;

    Conta(int numero, String titular, double saldo, double limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;

    }

    Conta() {
    }

    boolean sacar(double valor) {
        if (valor > limite || valor > saldo || valor <= 0) {
            return false;
        }
        saldo -= valor; // saldo = saldo - valor
        return true;
    }

    boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo += valor;
        return true;
    }

    boolean transferir(Conta outra,double valor) {

        if (!this.sacar(valor)) {
            return false;
        }
        outra.depositar(valor);
        return true;
    }

    void info() {
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("BANCO LYN");
        System.out.println("Numero da Conta: " + numero);
        System.out.println("Titular da Conta: " + titular);
        System.out.println("Saldo da Conta: R$" + saldo);
        System.out.println("Limite da Conta: R$" + limite);
        System.out.println("--------------------------------------");
    }
}
