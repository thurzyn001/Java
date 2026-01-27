package aula12;

public abstract class Peixe extends Animal {

    private String corEscama;

    public Peixe(float peso, int idade, int membros, String corEscama, String nome) {
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
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som.");
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "corEscama='" + corEscama + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", nome='" + nome + '\'' +
                '}';
    }


    public void soltarBolha() {
        System.out.println("Soltando bolhas...");
    }

}
