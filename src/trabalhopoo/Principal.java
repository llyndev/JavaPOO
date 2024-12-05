package trabalhopoo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Atributo 'opcao' criado como byte para armazenar a escolha do usuário, economizando memória.
        byte opcao = -1;

        // Atributo 'valor' criado para armazenar o valor da moeda a ser adicionado.
        double valor;

        // Objeto Scanner 'teclado' utilizado para capturar a entrada de dados do usuário.
        Scanner teclado = new Scanner(System.in);

        // Instância do objeto 'Cofrinho' para gerenciar as moedas adicionadas pelo usuário.
        Cofrinho cofrinho = new Cofrinho();

        // Loop principal do programa que continua até o usuário escolher a opção 0 (sair).
        while (opcao != 0) {

            // Exibindo o menu de opções.
            cofrinho.infoMenu();

            // Capturando a escolha do usuário.
            opcao = teclado.nextByte();

            // Verificando se a opção escolhida é para sair do programa.
            if (opcao == 0) {
                System.out.println("Saindo.");
                break;
            }

            // Gerencia a opção escolhida.
            switch (opcao) {

                case 1: // Opção para adicionar moedas.

                    byte tipoMoeda = 0;
                    System.out.println();
                    System.out.println("Adicionar Moeda");
                    System.out.println("1 - Dolar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    System.out.println("0 - Sair");
                    System.out.print(">>");

                    // Capturando o tipo de moeda a ser adicionada.
                    tipoMoeda = teclado.nextByte();
                        
                    // Verificando se a opção escolhida é para sair.
                    if(tipoMoeda == 0) {
                        System.out.println("Saindo.");
                        break;
                    }

                    // Adicionando moeda correpondente com a escolha do usuário.
                    switch (tipoMoeda) {
                        
                        case 1: // Adicionando Dólar.
                            System.out.println("Quantos dolares deseja adicionar: ");
                            System.out.print(">>");
                            valor = teclado.nextDouble();
                            cofrinho.adicionar(new Dolar(valor));
                            System.out.println();
                            System.out.printf("Adicionado: $%.2f", valor);
                            System.out.println();
                            break;

                        case 2: // Adicionando Euro.
                            System.out.println("Quantos euros deseja adicionar: ");
                            System.out.print(">>");
                            valor = teclado.nextDouble();
                            cofrinho.adicionar(new Euro(valor));
                            System.out.println();
                            System.out.printf("Adicionado: €%.2f", valor);
                            System.out.println();
                            break;

                        case 3: // Adicionando Real.
                            System.out.println("Quantos reais deseja adicionar: ");
                            System.out.print(">>");
                            valor = teclado.nextDouble();
                            cofrinho.adicionar(new Real(valor));
                            System.out.println();
                            System.out.printf("Adicionado: R$%.2f", valor);
                            System.out.println();
                            break;

                        default: // Informando caso opção inválida.
                        	System.out.println();
                            System.out.println("Tipo de moeda invalida.");
                            break;
                    }
                    break;

                case 2: // Opção para remover moeda.

                    System.out.println();
                    System.out.println("Remover Moeda");
                    System.out.println();
                    System.out.println("1 - Dolar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    System.out.println("0 - Sair");
                    System.out.print(">>");

                    // Capturando o tipo de moeda a ser removida.
                    tipoMoeda = teclado.nextByte();
                        
                    // Verificando se a opção escolhida é para sair.
                    if(tipoMoeda == 0) {
                        System.out.println("Saindo.");
                        break;
                    }

                    // Removendo moeda correpondente com a escolha do usuário.
                    switch (tipoMoeda) {

                        case 1: // Remover Dólar.
                            cofrinho.remover(new Dolar());
                            break;

                        case 2: // Remover Euro.
                            cofrinho.remover(new Euro());
                            break;

                        case 3: // Remover Real.
                            cofrinho.remover(new Real());
                            break;

                        default: // Informando caso opção inválida.
                        	System.out.println();
                            System.out.println("Tipo de moeda invalida.");
                            break;
                    }
                    break;

                case 3: // Opção para listar moedas.
                    cofrinho.listagemMoedas();
                    break;

                case 4: // Opção para converter todas as moedas para Real.
                    cofrinho.totalConvertido();
                    break;

                default: // Informando caso opção inválida.
                    System.out.println("Opção invalida!");
                    break;
                }
        }

        // Fecha o Scanner.
        teclado.close();

    }
}
