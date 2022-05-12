package ex3;

public class Gato extends Mamifero {
    
    //repassa string de nome e 4 patas para Mamifero
    public Gato(String nome, int patas) {
        super("Gatinho", 4);
        System.out.println("Construindo Gato...");
    }
}
