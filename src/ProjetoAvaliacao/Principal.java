package ProjetoAvaliacao;

public class Principal {

    public static void main(String[] args) {

        // Avaliacao avaliacaoA1 = new Avaliacao(9, 10, 3)
        Aluno a1 = new Aluno("Weslley", "Ciência da Computação", new Avaliacao(9, 10, 3));
        Aluno a2 = new Aluno("Couto", "Engenharia de Software", new Avaliacao(5, 2, 10));

        a1.info();
        a2.info();
    }
}
