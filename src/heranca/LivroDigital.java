package heranca;

// Utilizando extends para herdar metodos e classes de Livro
public class LivroDigital extends Livro { // Classe
    public String linkDownload; // Atributo
    public int tamanhoMB;

    // Utilizando a palavra reservada "super" para criar o metodo construtor
    public LivroDigital(String autor, String titulo, double precoVenda, String linkDownload) {
        super(autor, titulo, precoVenda);
        this.linkDownload = linkDownload;
    }

    // Utilizando super para herdar a classe mãe
    public double imposto() {
        return super.imposto() + 2;
    }

    // Metodo
    public float tamanhoPorPagina() {
        return tamanhoMB/(float)paginas;
    }

    // Metodo Utilizando super para herdar a classe mãe
    public void info() {
        super.info();
        System.out.println("Link: " + linkDownload);
    }

    // Metodo Utilizando super para herdar a classe mãe
    public void imprimirImposto() {
        System.out.println("\nImposto livro Fisico: " + super.imposto());
        System.out.println("Imposto libro DIgital: " + this.imposto());
    }

}
