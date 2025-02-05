package Capitulo12_AlgaWorks.AlgoritmosAvançados;

public class AlgoritmoAvancado {

    public static void main(String[] args) {

        ListaAlunos listaAlunos1 = new ListaAlunos();

        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        listaAlunos1.adicionar(aluno1);

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Ana";
        listaAlunos1.adicionar(aluno2);

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Carlos";
        listaAlunos1.adicionar(aluno3);

        Aluno aluno4 = new Aluno();
        aluno4.nome = "Bianca";
        listaAlunos1.adicionar(aluno4);

        Aluno aluno5 = new Aluno();
        aluno5.nome = "Dicson";
        listaAlunos1.adicionar(aluno5);

        Aluno aluno6 = new Aluno();
        aluno6.nome = "Ednaldo";
        listaAlunos1.adicionar(aluno6);

        Aluno aluno7 = new Aluno();
        aluno7.nome = "Neisan";
        listaAlunos1.adicionar(aluno7);

        Aluno aluno8 = new Aluno();
        aluno8.nome = "Gabriel";
        listaAlunos1.adicionar(aluno8);

        Aluno aluno9 = new Aluno();
        aluno9.nome = "Felipe";
        listaAlunos1.adicionar(aluno9);

//        for(int i = 0; i < lista.tamanho(); i++){
//            Aluno a = lista.obter(i);
//            System.out.println("Aluno: "+ a.nome);
//        }

        exibirALunos(listaAlunos1);
        System.out.println("Exibindo a lista normal sem alterações!!");
        System.out.println("____________________________");

        listaAlunos1.remover(aluno1);
        // Remoção do aluno1 usando metodo.
        exibirALunos(listaAlunos1);
        System.out.println("Exibindo com a função de remoção do nome no caso o Aluno João!");

        System.out.println("____________________________");

        listaAlunos1.ordernar();
        exibirALunos(listaAlunos1);
        System.out.println("Exibindo a lista ordenada, metodo mais complexo!!");


    }

    static void exibirALunos(ListaAlunos listaAlunos1){
        for(int i = 0; i < listaAlunos1.tamanho(); i++){
            Aluno a = listaAlunos1.obter(i);
            if(a != null){
                System.out.println("Aluno "+ (i + 1 ) +"°: "+ a.nome);
            }else{
                System.out.println("Aluno sem nome!");
            }
        }
    }
}
