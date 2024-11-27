package javaenum;

public class Principal {
    public static void main(String[] args) {

        Roupa cliente = new Roupa("Camisa", Tamanho.M, Estacao.VERAO);

        cliente.msg();
        cliente.tam();
    }
}
