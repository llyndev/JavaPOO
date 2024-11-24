package nota;

public class Principal {
    public static void main(String[] args) {
        Nota weslley = new Nota();

        weslley.setNota1(10);
        weslley.setNota2(5);
        weslley.setFaltas(2);

        weslley.resultado();

        Nota couto = new Nota(10, 8, 5);

        couto.resultado();
    }
}
