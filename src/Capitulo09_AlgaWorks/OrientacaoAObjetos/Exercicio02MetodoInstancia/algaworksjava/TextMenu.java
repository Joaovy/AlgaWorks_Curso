package Capitulo09_AlgaWorks.OrientacaoAObjetos.Exercicio02MetodoInstancia.algaworksjava;

public class TextMenu {


    public static void main(String[] args) {
        TextMenu menu = new TextMenu("### Agenda do João###");

        menu.add("Listar nomes", null);
        menu.add("Inserir nome", null);
        menu.add("Remover nome", null);

        menu.show();



        int i = 9;
              //    arr[0]    arr[1]   arr[2] arr[10]
        int[] arr = { 1      , 2 ,      3,             4,5,6,7,8,9,10};

        System.out.println(i);

        System.out.println(arr[i]);

    }

    public TextMenu(String titulo) {

    }

    public void add(String optLabel, Runnable runnable){

    }

    public void show(){
        /*
        ### Agenda do João ###
        1 - Listar nomes
        2 - Inserir nome
        3 - Remover nome

        Escolha uma opção:

         */
    }




}
