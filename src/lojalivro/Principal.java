package lojalivro;

public class Principal {
    public static void main(String[] args) {

        Autor a = new Autor("Couto", "Couto@gmail.com", "Espanhola");

        //a.infoAutor();

        Livro l = new LivroDigital("AulaPOO", new Autor("Weslley", "weslley.@gmail.com", "Brasileira"), "Ação", 555, 1024, 300);

        l.infoLivro();

        Livro lDigital = new LivroDigital("JavaPOO", a, "Conto", 333, 1024, 300);

        lDigital.infoLivro();

        Livro lFisico = new LivroFisico("JavaPOO", a, "Conto", 333, 5, 3);

        lFisico.infoLivro();
    }
}
