package ex3;

public class Cachorro extends Mamifero{
    
    //repassa string de nome e 4 patas para Mamifero
    public Cachorro(String nome, int patas) {
        super("Cachorrinho", 4);
        System.out.println("Construindo Cachorro...");
    }

}
