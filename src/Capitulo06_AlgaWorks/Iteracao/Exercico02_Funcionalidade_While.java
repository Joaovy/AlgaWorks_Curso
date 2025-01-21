package Capitulo06_AlgaWorks.Iteracao;

public class Exercico02_Funcionalidade_While {

    public static void main(String[] args) {
        Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        Integer contadorDivisiveisPor3 = 0;
        Integer contadorDivisiveisPor5 = 0;
        Integer contadorDivisiveisPor3e5 = 0;

        int i = 0;
        while ( i < numeros.length) {
            if (numeros[i] % 3 == 0 && numeros[i] % 5 == 0) {
                System.out.println("O numero: " + numeros[i] + " é divisivel por 3 e por 5");
                contadorDivisiveisPor3e5++;

            } else if (numeros[i] % 5 == 0) {
                System.out.println("O numero: " + numeros[i] + " é divisivel por 5");
                contadorDivisiveisPor5++;

            } else if (numeros[i] % 3 == 0) {
                System.out.println("O numero: " + numeros[i] + " é divisivel por 3");
                contadorDivisiveisPor3++;

            }

            i++;

        }

        System.out.println("\nO total de numeros divididos por 3 e 5  é: "+ contadorDivisiveisPor3e5);
        System.out.println("O total de numeros divididos por 5 é: "+ contadorDivisiveisPor5);
        System.out.println("O total de numeros divididos por 3 é: "+ contadorDivisiveisPor3);

    }
}
