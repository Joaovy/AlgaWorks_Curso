package Anotacoes.CursoAlgarWorks.Capitulos.AlgaWorks;

public class RetornandoValores {
    public static void main(String[] args) {

    float[] premissaInicial = new float[]{745,100};
    float proporcao = 20;

    float resultadoFinal = regreDeTres(premissaInicial, proporcao);
        System.out.println("Resultado: "+ resultadoFinal);

    }

    // a nomeclatura VOID significa que não havera retorno ou seja não é q que queremos!!!
    static int numeroAleatorio(){
        int numero = 1;
        return 1;
    }
    static float regreDeTres(float[] premissa, float proporcao){
        float resultado = (premissa[0] * proporcao) / premissa[1];
        return resultado;
    }
}
