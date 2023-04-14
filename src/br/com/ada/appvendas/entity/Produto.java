package br.com.ada.appvendas.entity;

import java.util.Objects;

public class Produto {
   private String codigo;
    private String nome;
    private double precoVenda;
    private int qtdeEstoque;


public Produto(String codigo, String nome, double precoVenda, int qtdeEstoque){
    this.codigo = codigo;
    this.nome = nome;
    this.precoVenda = precoVenda;
    this.qtdeEstoque = qtdeEstoque;
}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo = '" + codigo + '\'' +
                ", nome = '" + nome + '\'' +
                ", precoVenda = " + precoVenda +
                ", qtdeEstoque = " + qtdeEstoque +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(produto.precoVenda, precoVenda) == 0 && qtdeEstoque == produto.qtdeEstoque && Objects.equals(codigo, produto.codigo) && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, precoVenda, qtdeEstoque);
    }
}
