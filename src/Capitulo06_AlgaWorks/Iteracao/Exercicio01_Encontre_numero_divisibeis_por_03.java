package Capitulo06_AlgaWorks.Iteracao;

public class Exercicio01_Encontre_numero_divisibeis_por_03 {
    public static void main(String[] args) {

        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        Integer contador = 0;

        for(int i = 0; i < numeros.length; i++){

            if(numeros[i] % 3 == 0){
                System.out.println("O numero: "+ numeros[i] + " é divisivel por 3");
                contador++;
            }
        }

        System.out.println("O total de numeros divididos por 3 é: "+ contador);

        /* Esse programa retorna o valor da quantidades de numeros divisiveis por 3
        utilizando o array de forma bem simples para complementar o exercicio
         */
    }
}