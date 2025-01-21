package Capitulo05_AlgaWorks.EstruturaDeDecisao;

import java.util.Scanner;

public class Exercicio02_Calculo_Bunus_Funcionario {

    public static void main(String[] args) {

        /* Esse codigo faz um calculo para verificar se a empresa atingiu o faturamento esperado
        utilizando o if encadeado, ficou um pouco confuso a parte do calculo e as entradas por isso deixei
        o codigo mais simples possivel como o exercicio pediu!
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a meta de faturamento anual: ");
        Integer metaAnual = scanner.nextInt();

        System.out.print("Qual o faturamento real da empresa: ");
        Integer faturamentoReal = scanner.nextInt();

        System.out.print("Informe a media salaria do funcionario: ");
        Double mediaSalarial = scanner.nextDouble();
        Double porcentagemDoBonus = metaAnual * 0.8;

        if(faturamentoReal >= metaAnual){
            Double premioTotal = mediaSalarial;
            System.out.println("Parabens, atigimos a meta anual seu premio foi de 100%: R$"+ premioTotal);

        } else if (faturamentoReal >= porcentagemDoBonus) {
            Double bonusDeOitentaPorcento = mediaSalarial * 0.8;
            System.out.println("Parebens, atingimos a meta de 80% seu bunos foi de: R$"+ bonusDeOitentaPorcento);
        } else{
            System.out.println("Infelizmente não atigimos a meta!");
        }

    }
}
