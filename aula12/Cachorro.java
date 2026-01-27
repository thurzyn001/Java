package aula12;

public class Cachorro extends Mamifero {

    public Cachorro(float peso, int idade, int membros, String corPelo, String nome) {
        super(peso, idade, membros, corPelo, nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo...");
    }

    public void enterrarOsso() {
        System.out.println("Enterrando osso...");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo...");
    }

    public String toString() {
        return "Cachorro{" +
                "corPelo='" + getCorPelo() + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", nome='" + nome + '\'' +
                '}';
    }

}
