package heranca;

public class Principal {
    public static void main(String[] args) {

        Livro user = new Livro("Weslley", "Aula POO", 300);

        LivroDigital user2 = new LivroDigital("Couto", "Java POO", 300, "livro.com.br/download");

        user.info();

        user2.info();
        
        user2.imprimirImposto();


        // Verificando quem é da instancia de Livro/LivroDigital
        System.out.println("");
        System.out.println(user instanceof Livro);
        System.out.println(user2 instanceof Livro);
        System.out.println(user instanceof LivroDigital);
        System.out.println(user2 instanceof LivroDigital);



    }
}
