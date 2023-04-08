package br.com.ada.appvendas.main;

import br.com.ada.appvendas.entity.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Produto leite = new Produto("Leite",4.50, 50);

        Produto pao = new Produto("Pão", 0.50, 200);
        pao.setQtdeEstoque(pao.getQtdeEstoque() + 50);

        List<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(leite);
        listaProduto.add(pao);

        for (Produto lista  : listaProduto){
            System.out.println(lista);
        }
    }
}