package aula12;

public class Arara extends Ave {

    public Arara(float peso, int idade, int membros, String corPena, String nome) {
        super(peso, idade, membros, corPena, nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Gritando...");
    }

    public String toString() {
        return "Arara{" +
                "corPena='" + getCorPena() + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", nome='" + nome + '\'' +
                '}';
    }

}
