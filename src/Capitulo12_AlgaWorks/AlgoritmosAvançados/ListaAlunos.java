package Capitulo12_AlgaWorks.AlgoritmosAvançados;

public class ListaAlunos {

    static final int QUANTIDADE_LISTA_ALUNOS = 5;

    Aluno[] lista = new Aluno[QUANTIDADE_LISTA_ALUNOS];

    int tamanhoLista = 0;

    Aluno obter(int indice){
        return  lista[indice];
    }

    int tamanho(){
        return tamanhoLista;
    }

    void adicionar(Aluno aluno){

        if(tamanhoLista == lista.length){
            Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA_ALUNOS + lista.length];

            for(int i = 0; i < lista.length; i++){
                novaLista[i] = lista[i];
            }
            lista = novaLista;
        }
    /* Metodo acima ele aumenta a capacidade do array tendo em vista que o limite é 5 un
    porém é feito o metodo acima para que a capacidade aumente utilizando o for e criando um novo array
    sendo assim feito uma copia.
     */
        lista[tamanhoLista] = aluno;
        tamanhoLista++;
    }

    void remover(Aluno aluno){
        for(int i = 0; i < tamanhoLista; i++){
            Aluno a = lista[i];
            if(a != null && a.equals(aluno)){
                remover(i);
                break;
            }else if(a == null && aluno == null){
                remover(i);
                break;
            }
        }
    }
    void remover(int indice){
        int indiceInicial = indice + 1;
        for (int i = indiceInicial; i < tamanhoLista; i++){
            lista[i - 1] = lista[i];
        }

        tamanhoLista--;
        lista[tamanhoLista] = null;
        // este null remove a ultima iteração que não existe mais...
    }
    // Metodo acima que remove o valor e o nome da lista

    void ordernar(){
        for( int i = 1; i < tamanhoLista; i++){
            Aluno alunoPosicaoBase = lista[i];
            int indicePosicaoBase = i;

            while(indicePosicaoBase > 0){
                int indicePosicaoAnterior = indicePosicaoBase - 1;
                Aluno alunoPosicaoAnterior = lista[indicePosicaoAnterior];

                boolean alunoPosicaoAnteriorVemDepoisDe = alunoPosicaoAnterior == null || alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase);

                if (alunoPosicaoAnteriorVemDepoisDe){
                    lista[indicePosicaoBase] = lista[indicePosicaoAnterior];

                    indicePosicaoBase--;
                }else {
                    break;
                }
            }
            lista[indicePosicaoBase] = alunoPosicaoBase;


        }
    }

    /*
    public static void main(String[] args) {
        String nome1 = "Carlos";
        String nome2 = "Douglas";
        System.out.println(nome1.compareTo(nome2));
          Neste caso a existe uma funcionalidade no string que compara os parametrôs
        então ela pega nome1 e nome2 e compara, neste caso nome1 é menor do que nome2
        poi vem antes do D ou seja o resultado esperado é -1, e caso se forem iguail o
        compareto vai retornar 0, e se o nome2 foi  menor o compareto vai retornar 1

    }
    */

}
