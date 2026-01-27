package aula12;

public abstract class Animal {

    protected float peso;
    protected int idade;
    protected int membros;
    protected String nome;


    public Animal(float peso, int idade, int membros, String nome) {

        this.setPeso(peso);
        this.setIdade(idade);
        this.setMembros(membros);
        this.setNome(nome);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();

    public String toString() {
        return "Animal{" +
                "peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", nome='" + nome + '\'' +
                '}';
    }

}
