package br.com.ada.appvendas.service.criarproduto;

import br.com.ada.appvendas.entity.Produto;

public class CadastroProduto implements CriarProduto {

    @Override
    public Produto criarProduto(String codigo, String nome, double preco, int qtdeEstoque) {

        if (nome == null || preco == 0){
            throw new RuntimeException("Produto sem nome ou valor de venda igual a zero, não pode ser cadastrado ");
        }

        Produto produto = new Produto(codigo, nome, preco, qtdeEstoque);
        return produto;
    }

}
