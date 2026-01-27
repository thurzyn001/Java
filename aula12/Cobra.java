package aula12;

public class Cobra extends Reptil {

    public Cobra(float peso, int idade, int membros, String corEscama, String nome) {
        super(peso, idade, membros, corEscama, nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Sibilando...");
    }

    public String toString() {
        return "Cobra{" +
                "corEscama='" + getCorEscama() + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", nome='" + nome + '\'' +
                '}';
    }

}
