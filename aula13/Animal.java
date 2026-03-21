package aula13;

public class Animal {

    //Atributos

    protected String nome;
    protected String especie;
    protected int idade;
    protected String cor;
    protected String comprimento;
    protected boolean temPelos;
    protected boolean temPatas;
    protected float numPatas;
    protected float numCabeças;
    protected float numOlhos;
    protected float numOrelhas;
    protected float numAsas;
    protected String sexo;
    protected float numEstomagos;
    protected float numBocas;
    protected float numDentes;
    protected float numNarizes;
    protected float numRabos;
    protected float numGuelrras;

    //Métodos

    //Método Construtor

    public void animal(String nome, String especie, int idade, String cor, String comprimento, boolean temPelos, boolean temPatas, float numPatas, float numCabeças, float numOlhos, float numOrelhas, float numAsas, String sexo, float numEstomagos, float numBocas, float numDentes, float numNarizes, float numRabos, float numGuelrras) {
        
        this.setNome(nome);
        this.setEspecie(especie);
        this.setIdade(idade);
        this.setCor(cor);
        this.setComprimento(comprimento);
        this.setTemPelos(temPelos);
        this.setTemPatas(temPatas);
        this.setNumPatas(numPatas);
        this.setNumCabeças(numCabeças);
        this.setNumOlhos(numOlhos);
        this.setNumOrelhas(numOrelhas);
        this.setNumAsas(numAsas);
        this.setSexo(sexo);
        this.setNumEstomagos(numEstomagos);
        this.setNumBocas(numBocas);
        this.setNumDentes(numDentes);
        this.setNumNarizes(numNarizes);
        this.setNumRabos(numRabos);
        this.setNumGuelrras(numGuelrras);
    }
    
    //Métodos Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public boolean TemPelos() {
        return temPelos;
    }

    public void setTemPelos(boolean temPelos) {
        this.temPelos = temPelos;
    }

    public boolean getTemPatas() {
        return temPatas;
    }

    public void setTemPatas(boolean temPatas) {
        this.temPatas = temPatas;
    }

    public float getNumPatas() {
        return numPatas;
    }
    public void setNumPatas(float numPatas) {
        this.numPatas = numPatas;
    }

    public float getNumCabeças() {
        return numCabeças;
    }
    public void setNumCabeças(float numCabeças) {
        this.numCabeças = numCabeças;
    }

    public float getNumOlhos() {
        return numOlhos;
    }
    public void setNumOlhos(float numOlhos) {
        this.numOlhos = numOlhos;
    }

    public float getNumOrelhas() {
        return numOrelhas;
    }
    public void setNumOrelhas(float numOrelhas) {
        this.numOrelhas = numOrelhas;
    }

    public float getNumAsas() {
        return numAsas;
    }
    public void setNumAsas(float numAsas) {
        this.numAsas = numAsas;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public float getNumEstomagos() {
        return numEstomagos;
    }

    public void setNumEstomagos(float numEstomagos) {
        this.numEstomagos = numEstomagos;
    }

    public float getNumBocas() {
        return numBocas;
    }

    public void setNumBocas(float numBocas) {
        this.numBocas = numBocas;
    }

    public float getNumDentes() {
        return numDentes;
    }

    public void setNumDentes(float numDentes) {
        this.numDentes = numDentes;
    }

    public float getNumNarizes() {
        return numNarizes;
    }

    public void setNumNarizes (float numNarizes) {
        this.numNarizes = numNarizes;
    }

    public float getNumRabos() {
        return numRabos;
    }

    public void setNumRabos(float numRabos) {
        this.numRabos = numRabos;
    }

    public float getNumGuelrras() {
        return numGuelrras;
    }       

    public void setNumGuelrras(float numGuelrras) {
        this.numGuelrras = numGuelrras;
    }
}
