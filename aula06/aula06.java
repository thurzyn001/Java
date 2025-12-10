package aula06;

import java.util.Scanner;

public class aula06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {

            System.out.println("=======Menu de Ações Bancárias=======");
            System.out.println("1. Abrir Conta");
            System.out.println("2. Fechar Conta");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Pagar Mensalidade");
            System.out.println("6. Extrato Bancário");
            System.out.println("0. Sair");
            System.out.println("=====================================");
            System.out.println("Digite o número correspondente à opção desejada: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {

                case 0:
                    System.out.println("Saindo do sistema. Obrigado por usar o Labubu Bank!");
                    break;

                case 1:
                    new contaBanco();
                    break;

                case 2:
                    System.out.println("WIP");
                    break;

                case 3:
                    System.out.println("WIP");
                    break;

                case 4:
                    System.out.println("WIP");
                    break;

                case 5:
                    System.out.println("WIP");
                    break;

                case 6:
                    System.out.println("WIP");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
