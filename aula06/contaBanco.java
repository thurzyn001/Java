package aula06;

import java.util.Scanner;

public class contaBanco {
    
    public int numConta;
    public String tipo;
    public String titular;
    public float saldo;
    public boolean status;

    public void abrirConta(){
        System.out.println("Vamos começar o processo de abertura de conta.");
        System.out.println("Qual o tipo de conta que você deseja abrir?");
        System.out.println("Digite o número correspondente a opção desejada:");
        System.out.println("CC - Conta Corrente");
        System.out.println("CP - Conta Poupança");

        Scanner scanner = new Scanner(System.in);
        String tipo = scanner.nextLine();

        switch(tipo){

            case "CC":
                this.tipo = "Conta Corrente";
                System.out.println("tipo de conta selecionada: Conta Corrente");
                System.out.println( "Você receberá R$50,00 de bônus de abertura de conta.");
                break;

            case "CP":
                this.tipo = "Conta Poupança";
                System.out.println("tipo de conta selecionada: Conta Poupança");
                System.out.println( "Você receberá R$150,00 de bônus de abertura de conta.");
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha CC ou CP.");
        }

        System.out.println("Agora o sistema irá gerar o número da sua conta.");
        this.numConta = (int)(Math.random() * 1000000);
        System.out.println("Número da conta gerado: " + this.numConta);

        System.out.println("Por fim, informe o nome do titular da conta:");
        this.titular = scanner.nextLine();
        System.out.println("Titular da conta: " + this.titular);
        scanner.close();

        this.status = true;
        System.out.println("Conta aberta com sucesso!");
        System.out.println("Informações da Conta da conta criada");
        System.out.println("Número da Conta: " + this.numConta);
        System.out.println("Tipo da Conta: " + this.tipo);
        System.out.println("Titular da Conta: " + this.titular);
        System.out.println("Status da Conta: " + (this.status ? "Ativa" : "Inativa"));
        System.out.println("Saldo Inicial: R$" + this.saldo);
    }

    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Conta não pode ser fechada pois ainda possui saldo.");
        } else if (this.saldo < 0){
            System.out.println("Conta não pode ser fechada pois está em débito.");
        } else {
            this.status = false;
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float valor){
        if(this.status){
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso na conta de " + this.titular);
        } else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }

    }

    public void sacar(float valor){
        if(this.status){
            if(this.saldo >= valor){
                this.saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso na conta de " + this.titular);
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }

    public void pagarMensal(){
        float valorMensal;
        if(this.tipo.equals("Conta Corrente")){
            valorMensal = 12.0f;
        } else if(this.tipo.equals("Conta Poupança")){
            valorMensal = 20.0f;
        } else {
            System.out.println("Tipo de conta inválido.");
            return;
        }

        if(this.status){
            if(this.saldo >= valorMensal){
                this.saldo -= valorMensal;
                System.out.println("Mensalidade de R$" + valorMensal + " debitada com sucesso na conta de " + this.titular);
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade.");
            }
        } else {
            System.out.println("Impossível cobrar mensalidade de uma conta fechada.");
        }
    }

    public void extrato(){
        System.out.println("----- Extrato da Conta -----");
        System.out.println("Número da Conta: " + this.numConta);
        System.out.println("Tipo da Conta: " + this.tipo);
        System.out.println("Titular da Conta: " + this.titular);
        System.out.println("Saldo da Conta: R$" + this.saldo);
        System.out.println("Status da Conta: " + (this.status ? "Ativa" : "Inativa"));
        System.out.println("----------------------------");

    }
}