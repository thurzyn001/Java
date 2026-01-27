package aula12;

public class Goldfish extends Peixe {

    public Goldfish(float peso, int idade, int membros, String corEscama, String nome) {
        super(peso, idade, membros, corEscama, nome);
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo flocos de peixe...");
    }

    public String toString() {
        return "Goldfish{" +
                "corEscama='" + getCorEscama() + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", nome='" + nome + '\'' +
                '}';
    }

}
