package aula011;

public class Professor extends Pessoa implements IntefaceProfessor {

    private String especialidade;
    private float salario;

    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    @Override
    public void receberAumento(float aumento) {
        this.salario += aumento;
    }

    @Override
    public String toString() {
        return "================= Professor =================\n" +
        super.toString() + "\nEspecialidade: " +
        this.getEspecialidade() + "\nSalário: " + this.getSalario() +
        "\n=============================================";   
    }

}
