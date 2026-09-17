package FACUL.POO1.PRATICA1;

public class Livro {

    // Atributos
    String titulo;
    String autor;
    int quantidade;

    //Métodos
    void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade: " + quantidade);
    }

    boolean estaDisponivel() {
        return quantidade > 0;
    }

    void adicionarExemplares(int valor){
        quantidade += valor;
    }

    void retirarExemplares(int valor){
        if (quantidade > 0) {
            quantidade -= valor;
        }
    }
 }
