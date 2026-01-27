package aula12;

public class Canguru extends Mamifero {

    public Canguru(float peso, int idade, int membros, String corPelo, String nome) {
        super(peso, idade, membros, corPelo, nome);
    }

    @Override
    public void locomover() {
        System.out.println("Saltando...");
    }

    public void usarBolsa() {
        System.out.println("Usando a bolsa...");
    }

    public String toString() {
        return "Canguru{" +
                "corPelo='" + getCorPelo() + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", membros=" + membros +
                ", nome='" + nome + '\'' +
                '}';
    }

}
