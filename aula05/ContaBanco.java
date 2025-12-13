package aula05;

public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    //GETTERS E SETTERS
    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean st){
        this.status = st;
    }

    public boolean getStatus(){
        return this.status;
    }

    //Métodos personalizados

    public void estadoAtual(){

        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("---------------------------");

    }

    public void abrirConta(String t){

        setTipo(t);
        setStatus(true);

        if(t.equals("CC")){
            setSaldo(50);
            System.out.println("Conta corrente aberta com bônus de R$50,00!");
        } else if(t.equals("CP")){
            setSaldo(150);
            System.out.println("Conta poupança aberta com bônus de R$150,00!");
        }
    }

    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        } else if(getSaldo() < 0){
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v){
        if(getStatus()){
            setSaldo(getSaldo() + v);
            System.out.println("Depósito de R$" + v + " na conta de " + getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }

    public void sacar(float v){
        if(getStatus()){
            if(getSaldo() >= v){
                setSaldo(getSaldo() - v);
                System.out.println("Saque de R$" + v + " realizado");
            } else {
                System.out.println("Saldo insuficiente para um saque de R$" + v);
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }
    }

    public void pagarMensal(){

        float v = 0;

        if(getTipo().equals("CC")){
            v = 12;
        } else if(getTipo().equals("CP")){
            v = 20;
        }

        if(getStatus()){
            if(getSaldo() >= v){
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente para pagar mensalidade de R$" + v);
            }
        } else {
            System.out.println("Impossível pagar mensalidade de uma conta fechada");
        }
    }
}
