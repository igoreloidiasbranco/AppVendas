package br.com.ada.appvendas.entity;

public class Produto {
    private String nome;
    private double precoVenda;
    private int qtdeEstoque;


public Produto(String nome, double precoVenda, int qtdeEstoque){
    this.nome = nome;
    this.precoVenda = precoVenda;
    this.qtdeEstoque = qtdeEstoque;
}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Integer getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(Integer qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome = '" + nome + '\'' +
                ", precoVenda = " + precoVenda +
                ", qtdeEstoque = " + qtdeEstoque +
                '}';
    }
}
