package aula011.Classes;

import aula011.Interfaces.InterfaceBolsista;

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
        String cargo = this.getSexo().equalsIgnoreCase("F") ? "da aluna" : "do aluno";
        System.out.println("\nBolsa " + cargo + " " + this.getNome() + " no valor de R$ " + this.getBolsa() + " reais renovada com sucesso!");
    }

    @Override
    public void pagarMensalidade() {
        String cargo = this.getSexo().equalsIgnoreCase("F") ? "a bolsista" : "o bolsista";
        System.out.println("\nMensalidade paga para " + cargo + " " + this.getNome() + " com desconto de " + this.getBolsa() + " reais.");
    }

    @Override
    public String toString() {
        return "\n================== Bolsista ==================\n" +
                super.DadosParaString() + "\nBolsa: " +
                this.getBolsa() +
                "\n===============================================";
    }

}
