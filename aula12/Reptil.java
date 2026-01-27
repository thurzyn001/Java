package aula12;

public abstract class Reptil extends Animal {

    protected String corEscama;

    public Reptil(float peso, int idade, int membros, String corEscama, String nome) {
        super(peso, idade, membros, nome);
        this.setCorEscama(corEscama);
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil...");
    }

    @Override
    public String toString() {
        return "Reptil{" +
                "corEscama='" + corEscama + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", nome='" + nome + '\'' +
                '}';
    }

}
