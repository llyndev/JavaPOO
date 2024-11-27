package javaenum;

enum Estacao{
    VERAO,
    OUTONO,
    INVERNO,
    PRIMAVERA
}

enum Tamanho{
    P,
    M,
    G
}

public class Roupa {
    String modelo;
    Tamanho tamanho;
    Estacao colecao;

    public Roupa(String modelo, Tamanho tamanho, Estacao colecao) {
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.colecao = colecao;
    }

    public void tam() {
        System.out.println("Tamanho: " + tamanho);
    }

    public void msg() {
        switch(colecao) {
            case VERAO:
                System.out.println("Arrase na praia!");
                break;
            case OUTONO:
                System.out.println("Passe o outono com elegancia!");
                break;
            case INVERNO:
                System.out.println("Se agasalhe bem e com estilo!");
                break;
            case PRIMAVERA:
                System.out.println("SE vista na estacao das flores!");
                break;
            default:
                System.out.println("Erro");
                break;
        }
    }
}
