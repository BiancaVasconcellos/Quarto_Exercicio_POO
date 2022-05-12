package ex3;

public class Animal {
    String nome;
    int patas;

    //construtor padrão que recebe string de nome e inteiro de patas
    public Animal(String nome, int patas) {
        this.nome = nome;
        this.patas = patas;
    }

    //construtor que recebe string de nome
    Animal(String nome) {
        this.nome = nome;
    }

    //construtor que recebe inteiro de patas
    Animal(int patas) {
        this.patas = patas;
    }
    
}
