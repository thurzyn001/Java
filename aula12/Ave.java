package aula12;

public abstract class Ave extends Animal {

    private String corPena;

    public Ave(float peso, int idade, int membros, String corPena, String nome) {
        super(peso, idade, membros, nome);
        this.setCorPena(corPena);
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave...");
    }

    @Override
    public String toString() {
        return "Ave{" +
                "corPena='" + corPena + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", nome='" + nome + '\'' +
                '}';
    }

    public void fazerNinho() {
        System.out.println("Construindo ninho...");
    }

}
