package FACUL.POO1.PRATICA1;

public class Exercicio1 {

    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "Seco, seco.";
        livro.autor = "1155doEt";
        livro.quantidade = 2;
        
        livro.adicionarExemplares(3);
        livro.retirarExemplares(1);
        livro.exibirDados();

        System.out.println("O livro está disponível? " + livro.estaDisponivel());
    }

}
