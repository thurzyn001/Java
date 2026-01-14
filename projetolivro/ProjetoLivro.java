package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa("Pedro", 22, "M");
        pessoas[1] = new Pessoa("Maria", 31, "F");

        livros[0] = new Livro("Aprendendo Java", "José da Silva", 300, pessoas[0]);
        livros[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, pessoas[1]);
        livros[2] = new Livro("Java Avançado", "Maria Candido", 800, pessoas[0]);

        livros[0].abrir();
        livros[0].folhear(100);
        livros[0].avancarPagina();
     
        livros[0].detalhes();
        livros[1].detalhes();
        livros[2].detalhes();
        
        pessoas[0].fazerAniver();
        pessoas[1].fazerAniver();

        livros[0].abrir();
        livros[0].folhear(100);
        livros[0].avancarPagina();
     
        livros[0].detalhes();
        livros[1].detalhes();
        livros[2].detalhes();

    }

}
