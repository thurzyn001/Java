package aula011;

public class Bolsista extends Aluno implements InterfaceBolsista {

    private float bolsa;

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, float bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void renovarBolsa() {
        System.out.println("Bolsa de " + this.getNome() + " renovada com sucesso!");
    }

    @Override
    public void pagarMensalidade() {
        String cargo = this.getSexo().equalsIgnoreCase("F") ? "a bolsista" : "o bolsista";
        System.out.println("Mensalidade paga para " + cargo + " " + this.getNome() + " com desconto de " + this.getBolsa() + " reais.");
    }

    @Override
    public String toString() {
        return "================== Bolsista ==================\n" +
                super.DadosParaString() + "\nBolsa: " +
                this.getBolsa() +
                "\n===============================================";
    }

}
