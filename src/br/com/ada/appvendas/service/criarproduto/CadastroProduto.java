package br.com.ada.appvendas.service.criarproduto;

import br.com.ada.appvendas.entity.Produto;

public class CadastroProduto implements CriarProduto {

    @Override
    public Produto criarProduto(String nome, double preco, int qtdeEstoque) {

        Produto produto = new Produto(nome, preco, qtdeEstoque);
        return produto;
    }
}
