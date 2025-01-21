package Capitulo07_AlgaWorks.Vetores;

import java.util.Scanner;

public class Exercicio01_Cadastrando_Tarefas_do_Dia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Esse codigo ele pede apenas para cadastrar as tarefas informadas pelo
        usuario e informar, porém eu implementei um menu para que pudesse informar e editar
        mais coisas fiz com ajuda do gpt seguindo a sua logica até achar o conceito do codigo
        por isso não implementei a função de sair e as demais pois fiquei com dificuldades mas
        pretendo retornar aqui e adicionar essas questões ao final do capitulo
         */

        String[] tarefas = new String[6]; // Array para armazenar as tarefas
        int opcaoDoMenu = 0;

        while (opcaoDoMenu != 4) { // Loop para continuar o menu até a opção de sair (4)
            System.out.println("\nMenu de opções: ");
            System.out.println("1 - Adicionar uma tarefa");
            System.out.println("2 - Editar uma tarefa");
            System.out.println("3 - Excluir uma tarefa");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opção: ");
            opcaoDoMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoDoMenu) {
                case 1: // Adicionar tarefa
                    for (int i = 0; i < tarefas.length; i++) {
                        if (tarefas[i] == null) {
                            System.out.print("Por favor informe a " + (i + 1) + "° tarefa: ");
                            tarefas[i] = scanner.nextLine();
                        }
                    }
                    System.out.println("Tarefas cadastradas: ");
                    for (int i = 0; i < tarefas.length; i++) {
                        if (tarefas[i] != null) {
                            System.out.println((i + 1) + "°: " + tarefas[i]);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Informe o número da tarefa que deseja alterar: ");
                    int numeroTarefa = scanner.nextInt();
                    scanner.nextLine();

                    if (numeroTarefa >= 1 && numeroTarefa <= tarefas.length && tarefas[numeroTarefa - 1] != null) {
                        System.out.println("Digite a nova tarefa para o número " + numeroTarefa + ":");
                        String novaTarefa = scanner.nextLine();
                        tarefas[numeroTarefa - 1] = novaTarefa;
                        System.out.println("Tarefa " + numeroTarefa + " atualizada com sucesso.");
                    } else {
                        System.out.println("Tarefa não encontrada ou número inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Tarefa excluida...( ainda falta implementar");
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida, por favor escolha uma opção válida.");
            }
        }

        scanner.close();
    }
}
