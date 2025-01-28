package Anotacoes.CursoAlgarWorks.Capitulos.AlgaWorks;

public class Recursividade {

    public static void main(String[] args) {
    String[] alunos = new String[]{"Alexandre", "João", "Maria"};

    iterarNomes(alunos, 0);
    }

    // Trocando o for pela recursividade!!!
    static void iterarNomes(String[] alunos, int i ){

        System.out.println("ALUNO: "+ alunos[i]);
        if (++i < alunos.length){
            iterarNomes(alunos,i);
        }

//       for(int i = 0; i < alunos.length; i++){
//           System.out.println("ALUNO: "+ alunos[i]);
//       }

    }
}
