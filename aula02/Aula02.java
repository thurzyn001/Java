package aula02;

import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {

        System.out.println("\nBem-vindo ao SCC (sistema de controle de canetas)!\n");

        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.tampada = true;

        Caneta c2 = new Caneta();
        c2.modelo = "Bic Cristal";
        c2.cor = "Preta";
        c2.ponta = 0.5f;
        c2.carga = 100;
        c2.tampada = true;

        Caneta c3 = new Caneta();
        c3.modelo = "Bic Cristal";
        c3.cor = "Vermelha";
        c3.ponta = 0.5f;
        c3.carga = 100;
        c3.tampada = true;

        Scanner scanner = new Scanner(System.in);
        int opcao, caneta;
        Caneta canetaSelecionada = c1;

        do {
            System.out.println("Escolha uma das opções abaixo:\n");
            System.out.println("1 - Selecionar Caneta\n");
            System.out.println("2 - Verificar Caneta\n");
            System.out.println("3 - Tampar Caneta\n");
            System.out.println("4 - Destampar Caneta\n");
            System.out.println("5 - Rabiscar\n");
            System.out.println("6 - Sair\n");

            opcao = scanner.nextInt();
            
            switch (opcao) {

                case 1:
                    System.out.println("\nVocê selecionou a Opção 1 - Selecionar Caneta.\n");
                    do {
                        System.out.println("A caneta atualmente selecionada é a: " + canetaSelecionada.modelo + " " + canetaSelecionada.cor + "\n");
                        System.out.println("Escolha uma caneta:\n");
                        System.out.println("1 - Bic Cristal Azul\n");
                        System.out.println("2 - Bic Cristal Preta\n");
                        System.out.println("3 - Bic Cristal Vermelha\n");
                        System.out.println("4 - Voltar ao menu principal\n");

                        caneta = scanner.nextInt();
                        
                        switch (caneta) {
                            case 1:
                                if (canetaSelecionada == c1) {
                                    System.out.println("\nA caneta " + c1.modelo + " " + c1.cor + " já está selecionada.\n");
                                    break;
                                } else {
                                System.out.println("Você selecionou a Caneta 1 (Bic Cristal Azul)\n");
                                canetaSelecionada = c1;
                                break;
                                }
                            case 2:
                                if (canetaSelecionada == c2) {
                                    System.out.println("A caneta " + c2.modelo + " " + c2.cor + " já está selecionada.\n");
                                    break;
                                } else {
                                    System.out.println("\nVocê selecionou a Caneta 2 (Bic Cristal Preta)\n");
                                    canetaSelecionada = c2;
                                    break;
                                }
                            case 3:
                                if (canetaSelecionada == c3) {
                                    System.out.println("A caneta " + c3.modelo + " " + c3.cor + " já está selecionada.\n");
                                    break;
                                } else {
                                    System.out.println("\nVocê selecionou a Caneta 3 (Bic Cristal Vermelha)\n");
                                    canetaSelecionada = c3;
                                    break;
                                }
                            case 4:
                                System.out.println("\nVocê selecionou a opção 4 - Voltar ao menu principal.\n");
                                System.out.println("Voltando ao menu principal...\n");
                                break;
                            default:
                                System.out.println("\nCaneta inválida!\nCódigo de Erro: V0C33BURR0?\n");
                                break;
                            }
                        } while (caneta != 1 && caneta != 2 && caneta != 3);
                    break;

                case 2:
                    System.out.println("\nVocê selecionou a Opção 2 - Verificar Caneta.\n");
                    canetaSelecionada.status();
                    break;
                case 3:
                    System.out.println("\nVocê selecionou a Opção 3 - Tampar Caneta.\n");
                    canetaSelecionada.tampar();
                    break;
                case 4:
                    System.out.println("\nVocê selecionou a Opção 4 - Destampar Caneta.\n");
                    canetaSelecionada.destampar();
                    break;
                case 5:
                    System.out.println("\nVocê selecionou a Opção 5 - Rabiscar.\n");
                    canetaSelecionada.rabiscar();
                    break;
                case 6:
                    System.out.println("\nVocê selecionou a Opção 6 - Sair.\n");
                    System.out.println("Obrigado por usar o SCC!\n");
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("\nOpção inválida!\nCódigo de Erro: V0C33BURR0?\n");
                    break;
            }
        } while (opcao != 6);
        scanner.close();
    }

}
