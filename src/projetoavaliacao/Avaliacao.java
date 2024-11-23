package projetoavaliacao;

public class Avaliacao {
    double n1, n2, n3;

    // Criando metodo construtor para notas que foram informadas nos parametros
    Avaliacao(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    // Criando metodo construtor para notas sem informar parametros
    Avaliacao() {
        //
    }

    // Criando metodo para Media Aritmetica
    public double mediaAritmetica() {
        return (n1 + n2 + n3) / 3;
    }

    // Criando metodo para Media Ponderada
    public double mediaPonderada() {
        return (n1*2 + n2*3 + n3*4) / 9;
    }


}
