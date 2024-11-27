package javainterface;

public class Principal {
    public static void main(String[] args) {
        
        Gato cat = new Gato();

        cat.emitirSom();
        cat.dormir();

        Cachorro dog = new Cachorro();

        dog.emitirSom();
        cat.dormir();

        Animal gatinho = new Gato();

        gatinho.emitirSom();
    }
}
