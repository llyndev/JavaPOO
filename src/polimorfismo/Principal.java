package polimorfismo;

public class Principal {
    public static void main(String[] args) {

        Funcionario h = new Horista("Weslley", 240, 25);

        h.info();

        Funcionario funcionarios[] = {
            new Horista("Couto", 220, 30),
            new Comissionado("Lucas", 10, 300),
            new Assalariado("Alves", 3000)
        };

        Funcionario f;
        float total = 0;
        for (int i=0;i<funcionarios.length;i++) {
            f = funcionarios[i];
            System.out.println(f.nome + " salario: " + f.pagamento());
            total += f.pagamento();
        }
        System.out.println("Total: " + total);

        h.info();
    }
}
