package projetolivro;

public class Pessoa implements InterfacePessoa {

    //Atributos
    
    private String nome;
    private int idade;
    private String sexo;
    
    // Método construtor

    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

    // Métodos getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    //Métodos Personalizados

    @Override
    public void fazerAniver(){
        this.idade++;
    }
}
