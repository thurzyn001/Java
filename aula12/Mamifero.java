package aula12;

public abstract class Mamifero extends Animal {

    private String corPelo;

    public Mamifero(float peso, int idade, int membros, String corPelo, String nome) {
        super(peso, idade, membros, nome);
        this.setCorPelo(corPelo);
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero...");
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "corPelo='" + corPelo + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", nome='" + nome + '\'' +
                '}';
    }

}
