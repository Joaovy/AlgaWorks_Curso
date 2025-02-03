package Capitulo10_AlgaWorks.LeituraEscritaDeDadosArquivos.Exercicio02LendoArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraDeArquivos {

    public static void main(String[] args) throws IOException {
        /* Exercicio acima é apenas para demonstrar como exibir e
        ler os tipos de arquivos que temos em java
         */

        Path arquivoDeTarefas = Paths.get("/home/joao/Documents/Cpaitulo10_ALgaWorks/Exercicio01_task.txt");
        List<String> linhas = Files.readAllLines(arquivoDeTarefas);

        for (int i = 0; i < linhas.size(); i++){
            String listaDeTarefas = linhas.get(i);
            System.out.println((i + 1)+ "° Tarefa do dia: "+ listaDeTarefas );
        }

    }

}
