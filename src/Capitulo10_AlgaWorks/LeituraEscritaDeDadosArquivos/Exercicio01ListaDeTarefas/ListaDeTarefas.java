package Capitulo10_AlgaWorks.LeituraEscritaDeDadosArquivos.Exercicio01ListaDeTarefas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    /* Exercicio abaixo mostra como salvar e criar um arquivo apartir do terminal e salvando
    pelo usuario.
     */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<String >();
        String tarefa;
        int i = 0;

        System.out.println("Digite X para finalizar o programa!");
        while (true){
            System.out.print("Informe suas tarefas "+ ( i + 1 ) +": ");
            tarefa = scanner.nextLine();

            if ("x".equals(tarefa)){
                break;
            }
            linhas.add(tarefa);
            i++;
        }

        Path arquivoTask = Paths.get("/home/joao/Documents/Cpaitulo10_ALgaWorks/Exercicio01_task.txt");
        Files.write(arquivoTask, linhas);

        System.out.println("Adição de tarefas concluido!");
        scanner.close();
    }


}
