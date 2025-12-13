package aula06;

import java.util.Scanner;

public class aula06 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            Conta conta1 = new Conta();

            conta1.numConta = 12345;
            conta1.dono = "Joazinho";
            conta1.tipo = "CC";
            conta1.saldo = 0.0f;
            conta1.status = false;
            
            Conta conta2 = new Conta();

            conta2.numConta = 67890;
            conta2.dono = "Mariazinha";
            conta2.tipo = "CP";
            conta2.saldo = 0.0f;
            conta2.status = false;
                

            while (true) {
                System.out.println("Escolha uma conta para operar:");
                System.out.println("0 -2 Sair");
                System.out.println("1 - Conta 1");
                System.out.println("2 - Conta 2");
                System.out.print("Opção: ");
                int opcao1 = scanner.nextInt();

                if (opcao1 == 0) {
                    System.out.println("Saindo...");
                    break;
                }

                Conta conta = null;
                if (opcao1 == 1) {
                    System.out.println("Operações da conta 1");
                    conta = conta1;
                } else if (opcao1 == 2) {
                    System.out.println("Operações da conta 2");
                    conta = conta2;
                } else {
                    System.out.println("Opção inválida.");
                    continue;
                }

                while (true) {
                    System.out.println("Escolha uma opção:");
                    System.out.println("0 - Voltar");
                    System.out.println("1 - Abrir Conta");
                    System.out.println("2 - Fechar Conta");
                    System.out.println("3 - Depositar");
                    System.out.println("4 - Sacar");
                    System.out.println("5 - Pagar Mensalidade");
                    System.out.println("6 - Mostrar Status");
                    System.out.print("Opção: ");
                    int opcao2 = scanner.nextInt();

                    if (opcao2 == 0) {
                        System.out.println("Voltando ao menu de contas...");
                        break;
                    }

                    switch (opcao2) {
                        case 1:
                            conta.abrirConta();
                            break;
                        case 2:
                            conta.fecharConta();
                            break;
                        case 3:
                            System.out.println("Digite o valor para depositar:");
                            int valorDeposito = scanner.nextInt();
                            conta.depositar(valorDeposito);
                            break;
                        case 4:
                            System.out.println("Digite o valor para sacar:");
                            int valorSaque = scanner.nextInt();
                            conta.sacar(valorSaque);
                            break;
                        case 5:
                            conta.pagarMensal();
                            break;
                        case 6:
                            System.out.println("Número da Conta: " + conta.numConta);
                            System.out.println("Tipo da Conta: " + conta.tipo);
                            System.out.println("Nome do Titular: " + conta.dono);
                            System.out.println("Saldo: R$" + conta.saldo);
                            System.out.println("Status: " + (conta.status ? "Aberta" : "Fechada"));
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                }
            }
        }
    }
}
