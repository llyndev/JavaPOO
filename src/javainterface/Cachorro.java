package javainterface;

public class Cachorro implements Animal{
    
    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    @Override
    public void dormir() {
        System.out.println("zZzz");
    }
}
