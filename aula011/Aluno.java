package aula011;

public class Aluno extends Pessoa implements Interfacealuno {

    private int matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo, int matricula, String curso) {

        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade paga para o aluno " + this.getNome());
    }   

    @Override
    public void cancelarMatricula() {
        System.out.println("Matrícula cancelada.");
    }

    @Override
    public String DadosParaString() {
        return super.toString() + "\nMatrícula: " + this.getMatricula() + "\nCurso: " + this.getCurso();
    }

    @Override
    public String toString() {
        return "================== Aluno ====================\n" +
        this.DadosParaString() +
        "\n=============================================";   
    }

}
