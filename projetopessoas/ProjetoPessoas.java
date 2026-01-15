package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[4];

        pessoas[0] = new Pessoa("Pedro", 22, "M");
        pessoas[1] = new Aluno("Maria", 31, "F", "123456", "Computação");
        pessoas[2] = new Professor("Cláudio", 45, "M", "Computação", 5000);
        pessoas[3] = new Funcionario("Fabiana", 28, "F", "RH");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
