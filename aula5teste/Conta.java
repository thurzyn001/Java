package aula5teste;

public class Conta {

    public int numConta;
    public String tipo;
    public String dono;
    public float saldo;
    public boolean status;

    public void abrirConta() {
        this.status = true;
        if (this.status == true) {
            System.out.println("Conta aberta com sucesso!");
        } else {
            System.out.println("Erro ao abrir conta.");
        }
    }

    public void fecharConta() {

        this.status = false;

        if (this.status == false) {
            System.out.println("Conta fechada com sucesso!");
        } else {
            System.out.println("Erro ao fechar conta.");
        }
    }   

    public void depositar(float valor) {
        if (!this.status) {
            System.out.println("Conta inativa. Não é possível depositar.");
            return;
        }
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
    }

    public void sacar(float valor) {
        if (!this.status) {
            System.out.println("Conta inativa. Não é possível sacar.");
            return;
        }
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void pagarMensal() {
        float mensalidade = 0;
        if (this.tipo == "CC") {
            mensalidade = 12;
        } else if (this.tipo == "CP") {
            mensalidade = 20;
        }

        if (this.saldo >= mensalidade) {
            this.saldo -= mensalidade;
            System.out.println("Mensalidade de R$" + mensalidade + " paga com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para pagar a mensalidade.");
        }
    }

    public void status() {
        System.out.println("Conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Nome: " + this.dono);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Status: " + (this.status ? "Ativa" : "Inativa"));
    }
}
