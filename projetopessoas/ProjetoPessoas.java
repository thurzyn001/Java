package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[2];

        pessoas[0] = new Pessoa("Pedro", 22, "M");
        pessoas[1] = new Pessoa("Maria", 31, "F");

        pessoas[0].fazerAniversario();
        pessoas[1].fazerAniversario();

        System.out.println(pessoas[0].getNome() + " tem " + pessoas[0].getIdade() + " anos.");
        System.out.println(pessoas[1].getNome() + " tem " + pessoas[1].getIdade() + " anos.");

    }
}
