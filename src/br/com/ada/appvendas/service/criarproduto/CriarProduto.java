package br.com.ada.appvendas.service.criarproduto;

import br.com.ada.appvendas.entity.Produto;

public interface CriarProduto {

    Produto criarProduto (String nome, double preco, int qtdeEstoque);
}
