package lojalivro;

public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private int edicao;

    public Livro() {

    }

    public Livro(String titulo, Autor autor, String genero, int edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdicao() {
        return edicao;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    
    public void infoLivro() {

        System.out.println("");
        autor.infoAutor();
        System.out.println("Titulo: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Edição: " + edicao);
    }
}
