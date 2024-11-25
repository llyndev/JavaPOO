package heranca;

public class Livro {
    public String autor;
    public double custoProducao;
    public double precoVenda;
    public String titulo;
    public int paginas;

    public Livro(String autor, String titulo, double precoVenda) {
        this.autor = autor;
        this.titulo = titulo;
        this.precoVenda = precoVenda;
    }

    public double lucro() {
        return precoVenda - custoProducao;
    }

    public double imposto() {
        return 0.2f * lucro();
    }

    public void info() {
        System.out.println("");
        System.out.println("O titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Valor: R$" + precoVenda);
    }

}
