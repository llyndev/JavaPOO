package lojalivro;

public class LivroDigital extends Livro {
    private int download;
    private double tamanho;

    public LivroDigital(String titulo, Autor autor, String genero, int edicao, int download, double tamanho) {
        super(titulo, autor, genero, edicao);
        this.download = download;
        this.tamanho = tamanho;
    }

    public LivroDigital() {

    }

    public int getDownload() {
        return download;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void infoLivro() {
        super.infoLivro();
        System.out.println("Download: " + download);
        System.out.println("Tamanho: " + tamanho);
    }

    
}   
