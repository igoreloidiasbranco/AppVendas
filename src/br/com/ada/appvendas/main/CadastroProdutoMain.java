package br.com.ada.appvendas.main;

import br.com.ada.appvendas.entity.Produto;

import java.util.ArrayList;
import java.util.List;

public class CadastroProdutoMain {

    public static void main(String[] args) {

        Produto leite = new Produto("Leite",4.50, 50);
        System.out.println(leite);

        Produto pao = new Produto("Pão", 0.50, 200);
        System.out.println(pao);

    }
}
