package br.com.ada.appvendas.main;

import br.com.ada.appvendas.entity.Produto;
import br.com.ada.appvendas.service.criarproduto.CadastroProduto;

import java.util.ArrayList;
import java.util.List;

public class CadastroProdutoMain {

    public static void main(String[] args) {

        CadastroProduto novoProduto = new CadastroProduto();

        Produto leite = novoProduto.criarProduto( "001","Leite", 4.50, 20);

        Produto pao = novoProduto.criarProduto("002", "Pão", 0.50, 50);

        Produto cafe = novoProduto.criarProduto("003", "Café", 15.00, 30);

        Produto manteiga = novoProduto.criarProduto("004","Manteiga", 4.00,10);


        List<Produto> listaProduto = new ArrayList<>();


        listaProduto.add(leite);
        listaProduto.add(pao);
        listaProduto.add(cafe);
        listaProduto.add(manteiga);

        for (Produto lista : listaProduto) {
            System.out.println(lista);

        }
    }
}
