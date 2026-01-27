package aula12;

public class Jabuti extends Reptil {

    public Jabuti(float peso, int idade, int membros, String corEscama, String nome) {
        super(peso, idade, membros, corEscama, nome);
    }

    @Override
    public void locomover() {
        System.out.println("Andando lentamente...");
    }

    public String toString() {
        return "Jabuti{" +
                "corEscama='" + getCorEscama() + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", nome='" + nome + '\'' +
                '}';
    }

}
