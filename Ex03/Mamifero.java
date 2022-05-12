package Ex03;

public class Mamifero extends Animal {
    
    //receber string de nome e inteiro de patas
    public Mamifero(String nome, int patas) {
        super(nome, patas);
        System.out.println("Construindo Mamifero...");
    }

}